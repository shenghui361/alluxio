/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.cli.fsadmin.command;

import alluxio.cli.AbstractCommand;
import alluxio.cli.fsadmin.report.CapacityCommand;
import alluxio.cli.fsadmin.report.SummaryCommand;
import alluxio.client.block.BlockMasterClient;
import alluxio.client.block.RetryHandlingBlockMasterClient;
import alluxio.client.file.FileSystemContext;
import alluxio.client.file.FileSystemMasterClient;
import alluxio.client.MetaMasterClient;
import alluxio.client.RetryHandlingMetaMasterClient;
import alluxio.exception.ExceptionMessage;
import alluxio.exception.status.InvalidArgumentException;
import alluxio.exception.status.UnavailableException;
import alluxio.master.MasterClientConfig;
import alluxio.master.MasterInquireClient;
import alluxio.master.PollingMasterInquireClient;
import alluxio.resource.CloseableResource;
import alluxio.retry.ExponentialBackoffRetry;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.List;

/**
 * Reports Alluxio running cluster information.
 */
public final class ReportCommand extends AbstractCommand {
  public static final String HELP_OPTION_NAME = "h";
  public static final String LIVE_OPTION_NAME = "live";
  public static final String LOST_OPTION_NAME = "lost";
  public static final String SPECIFIED_OPTION_NAME = "workers";

  private MetaMasterClient mMetaMasterClient;
  private BlockMasterClient mBlockMasterClient;
  private PrintStream mPrintStream;

  private static final Option HELP_OPTION =
      Option.builder(HELP_OPTION_NAME)
          .required(false)
          .hasArg(false)
          .desc("print help information.")
          .build();

  private static final Option LIVE_OPTION =
      Option.builder(LIVE_OPTION_NAME)
          .required(false)
          .hasArg(false)
          .desc("show capacity information of live workers.")
          .build();

  private static final Option LOST_OPTION =
      Option.builder(LOST_OPTION_NAME)
          .required(false)
          .hasArg(false)
          .desc("show capacity information of lost workers.")
          .build();

  private static final Option SPECIFIED_OPTION =
      Option.builder(SPECIFIED_OPTION_NAME)
          .required(false)
          .hasArg(true)
          .desc("show capacity information of specified workers.")
          .build();

  enum Command {
    CAPACITY, // Report worker capacity information
    SUMMARY // Report cluster summary
  }

  /**
   * Creates a new instance of {@link ReportCommand}.
   */
  public ReportCommand() {
    mMetaMasterClient = new RetryHandlingMetaMasterClient(MasterClientConfig.defaults());
    mBlockMasterClient = new RetryHandlingBlockMasterClient(MasterClientConfig.defaults());
    mPrintStream = System.out;
  }

  @Override
  public String getCommandName() {
    return "report";
  }

  @Override
  protected int getNumOfArgs() {
    return 1;
  }

  @Override
  public int run(CommandLine cl) throws IOException {
    String[] args = cl.getArgs();

    if (cl.hasOption(HELP_OPTION_NAME)
        && !(args.length > 0 && args[0].equals("capacity"))) {
      // if category is capacity, we print report capacity usage inside CapacityCommand.
      System.out.println(getUsage());
      System.out.println(getDescription());
      return 0;
    }

    // Get the report category
    Command command = Command.SUMMARY;
    if (args.length == 1) {
      switch (args[0]) {
        case "capacity":
          command = Command.CAPACITY;
          break;
        case "summary":
          command = Command.SUMMARY;
          break;
        default:
          System.out.println(getUsage());
          System.out.println(getDescription());
          throw new InvalidArgumentException("report category is invalid.");
      }
    }

    // Only capacity category has [category args]
    if (!command.equals(Command.CAPACITY)) {
      if (cl.getOptions().length > 0) {
        throw new InvalidArgumentException(
            String.format("report %s does not support arguments: %s",
                command.toString().toLowerCase(), cl.getOptions()[0].getOpt()));
      }
    }

    // Check if Alluxio master and client services are running
    try {
      try (CloseableResource<FileSystemMasterClient> client =
               FileSystemContext.INSTANCE.acquireMasterClientResource()) {
        MasterInquireClient inquireClient = null;
        try {
          InetSocketAddress address = client.get().getAddress();
          List<InetSocketAddress> addresses = Arrays.asList(address);
          inquireClient = new PollingMasterInquireClient(addresses, () ->
              new ExponentialBackoffRetry(50, 100, 2));
        } catch (UnavailableException e) {
          System.err.println("Failed to get the leader master.");
          System.err.println("Please check your Alluxio master status");
          return 1;
        }
        try {
          inquireClient.getPrimaryRpcAddress();
        } catch (UnavailableException e) {
          System.err.println("The Alluxio leader master is not currently serving requests.");
          System.err.println("Please check your Alluxio master status");
          return 1;
        }
      }

      switch (command) {
        case CAPACITY:
          CapacityCommand capacityCommand = new CapacityCommand(
              mBlockMasterClient, mPrintStream);
          capacityCommand.run(cl);
          break;
        case SUMMARY:
          SummaryCommand summaryCommand = new SummaryCommand(mMetaMasterClient,
              mBlockMasterClient, mPrintStream);
          summaryCommand.run();
          break;
        default:
          break;
      }
    } finally {
      mMetaMasterClient.close();
      mBlockMasterClient.close();
    }
    return 0;
  }

  @Override
  public Options getOptions() {
    return new Options()
        .addOption(HELP_OPTION)
        .addOption(LIVE_OPTION)
        .addOption(LOST_OPTION)
        .addOption(SPECIFIED_OPTION);
  }

  @Override
  public String getUsage() {
    return "report [category] [category args]";
  }

  @Override
  public String getDescription() {
    return "Report Alluxio running cluster information.\n"
        + "Where [category] is an optional argument. If no arguments are passed in, "
        + "summary information will be printed out.\n"
        + "[category] can be one of the following:\n"
        + "    capacity         worker capacity information\n"
        + "    summary          cluster summary\n";
  }

  @Override
  public void validateArgs(String... args) throws InvalidArgumentException {
    if (args.length > 1) {
      throw new InvalidArgumentException(
          ExceptionMessage.INVALID_ARGS_GENERIC.getMessage(getCommandName()));
    }
  }
}
