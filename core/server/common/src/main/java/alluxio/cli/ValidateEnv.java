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

package alluxio.cli;

import alluxio.Configuration;
import alluxio.PropertyKey;
import alluxio.cli.validation.PortAvailabilityValidationTask;
import alluxio.cli.validation.RamDiskMountPrivilegeValidationTask;
import alluxio.cli.validation.SecureHdfsValidationTask;
import alluxio.cli.validation.StorageSpaceValidationTask;
import alluxio.cli.validation.SshValidationTask;
import alluxio.cli.validation.UfsDirectoryValidationTask;
import alluxio.cli.validation.UserLimitValidationTask;
import alluxio.cli.validation.Utils;
import alluxio.cli.validation.ValidationTask;
import alluxio.exception.status.InvalidArgumentException;
import alluxio.util.network.NetworkAddressUtils.ServiceType;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

/**
 * Utility for checking Alluxio environment.
 */
public final class ValidateEnv {
  public static final Option HADOOP_CONF_DIR_OPTION =
      Option.builder("hadoopConfDir").required(false).hasArg(true)
          .desc("path to server-side hadoop conf dir").build();

  private static final String USAGE = "USAGE: validateEnv TARGET [NAME] [OPTIONS]\n\n"
      + "Validate environment for Alluxio.\n\n"
      + "TARGET can be one of the following values:\n"
      + "local:   run all validation tasks on local\n"
      + "master:  run master validation tasks on local\n"
      + "worker:  run worker validation tasks on local\n"
      + "all:     run corresponding validation tasks on all master nodes and worker nodes\n"
      + "masters: run master validation tasks on all master nodes\n"
      + "workers: run worker validation tasks on all worker nodes\n\n"
      + "NAME can be any task full name or prefix.\n"
      + "When NAME is given, only tasks with name starts with the prefix will run.\n"
      + "For example, specifying NAME \"master\" or \"ma\" will run both tasks named "
      + "\"master.rpc.port.available\" and \"master.web.port.available\" but not "
      + "\"worker.rpc.port.available\".\n"
      + "If NAME is not given, all tasks for the given TARGET will run.\n\n"
      + "OPTIONS can be a list of command line options. Each option has the"
      + " format \"-<optionName> [optionValue]\"\n";

  private static final Map<ValidationTask, String> TASKS = new HashMap<>();

  private static final String ALLUXIO_MASTER_CLASS = "alluxio.master.AlluxioMaster";
  private static final String ALLUXIO_WORKER_CLASS = "alluxio.worker.AlluxioWorker";
  private static final String ALLUXIO_PROXY_CLASS = "alluxio.proxy.AlluxioProxy";

  // port availability validations
  private static final ValidationTask MASTER_RPC_VALIDATION_TASK = registerTask(
      "master.rpc.port.available",
      new PortAvailabilityValidationTask(ServiceType.MASTER_RPC, ALLUXIO_MASTER_CLASS));
  private static final ValidationTask MASTER_WEB_VALIDATION_TASK = registerTask(
      "master.web.port.available",
      new PortAvailabilityValidationTask(ServiceType.MASTER_WEB, ALLUXIO_MASTER_CLASS));
  private static final ValidationTask WORKER_DATA_VALIDATION_TASK = registerTask(
      "worker.data.port.available",
      new PortAvailabilityValidationTask(ServiceType.WORKER_DATA, ALLUXIO_WORKER_CLASS));
  private static final ValidationTask WORKER_RPC_VALIDATION_TASK = registerTask(
      "worker.rpc.port.available",
      new PortAvailabilityValidationTask(ServiceType.WORKER_RPC, ALLUXIO_WORKER_CLASS));
  private static final ValidationTask WORKER_WEB_VALIDATION_TASK = registerTask(
      "worker.web.port.available",
      new PortAvailabilityValidationTask(ServiceType.WORKER_WEB, ALLUXIO_WORKER_CLASS));
  private static final ValidationTask PROXY_WEB_VALIDATION_TASK = registerTask(
      "proxy.web.port.available",
      new PortAvailabilityValidationTask(ServiceType.PROXY_WEB, ALLUXIO_PROXY_CLASS));

  // security configuration validations
  private static final ValidationTask MASTER_SECURITY_VALIDATION_TASK = registerTask(
      "master.secure.hdfs",
      new SecureHdfsValidationTask("master"));
  private static final ValidationTask WORKER_SECURITY_VALIDATION_TASK = registerTask(
      "worker.secure.hdfs",
      new SecureHdfsValidationTask("worker"));

  // ssh validations
  private static final ValidationTask SSH_TO_MASTERS_VALIDATION_TASK = registerTask(
      "ssh.masters.reachable",
      new SshValidationTask("masters"));
  private static final ValidationTask SSH_TO_WORKERS_VALIDATION_TASK = registerTask(
      "ssh.workers.reachable",
      new SshValidationTask("workers"));

  // UFS validations
  private static final ValidationTask UFS_ROOT_VALIDATION_TASK = registerTask(
      "ufs.root.accessible",
      new UfsDirectoryValidationTask());

  // RAM disk validations
  private static final ValidationTask WORKER_RAMDISK_MOUNT_PRIVILEGE_VALIDATION_TASK = registerTask(
      "worker.ramdisk.mount.privilege", new RamDiskMountPrivilegeValidationTask());

  // User limit validations
  private static final ValidationTask ULIMIT_OPEN_FILES_VALIDATION_TASK = registerTask(
      "ulimit.nofile",
      UserLimitValidationTask.createOpenFilesLimitValidationTask());

  private static final ValidationTask ULIMIT_USER_PROCS_VALIDATION_TASK = registerTask(
      "ulimit.nproc",
      UserLimitValidationTask.createUserProcessesLimitValidationTask());

  // space validations
  private static final ValidationTask WORKER_STORAGE_SPACE_VALIDATION_TASK = registerTask(
      "worker.storage.space",
      new StorageSpaceValidationTask());

  private static final Map<String, Collection<ValidationTask>> TARGET_TASKS =
      initializeTargetTasks();

  private static Map<String, Collection<ValidationTask>> initializeTargetTasks() {
    Map<String, Collection<ValidationTask>> targetMap = new TreeMap<>();
    ValidationTask[] commonTasks = {
        PROXY_WEB_VALIDATION_TASK,
        SSH_TO_MASTERS_VALIDATION_TASK,
        SSH_TO_WORKERS_VALIDATION_TASK,
        UFS_ROOT_VALIDATION_TASK,
        ULIMIT_OPEN_FILES_VALIDATION_TASK,
        ULIMIT_USER_PROCS_VALIDATION_TASK
    };
    ValidationTask[] masterTasks = {
        MASTER_RPC_VALIDATION_TASK,
        MASTER_WEB_VALIDATION_TASK,
        MASTER_SECURITY_VALIDATION_TASK,
    };
    ValidationTask[] workerTasks = {
        WORKER_DATA_VALIDATION_TASK,
        WORKER_RAMDISK_MOUNT_PRIVILEGE_VALIDATION_TASK,
        WORKER_RPC_VALIDATION_TASK,
        WORKER_STORAGE_SPACE_VALIDATION_TASK,
        WORKER_WEB_VALIDATION_TASK,
        WORKER_SECURITY_VALIDATION_TASK,
    };

    targetMap.put("master", Arrays.asList(
        ArrayUtils.addAll(commonTasks, masterTasks)));
    targetMap.put("worker", Arrays.asList(
        ArrayUtils.addAll(commonTasks, workerTasks)));
    targetMap.put("local", TASKS.keySet());
    return targetMap;
  }

  private static ValidationTask registerTask(String name, ValidationTask task) {
    TASKS.put(task, name);
    return task;
  }

  private static boolean validateRemote(List<String> nodes, String target, String name,
      Map<String, String> optionsMap) throws InterruptedException {
    if (nodes == null) {
      return false;
    }

    boolean success = true;
    for (String node : nodes) {
      success &= validateRemote(node, target, name, optionsMap);
    }

    return success;
  }

  // validates environment on remote node
  private static boolean validateRemote(String node, String target, String name,
      Map<String, String> optionsMap) throws InterruptedException {
    System.out.format("Validating %s environment on %s...%n", target, node);
    if (!Utils.isAddressReachable(node, 22)) {
      System.err.format("Unable to reach ssh port 22 on node %s.%n", node);
      return false;
    }

    StringBuilder sb = new StringBuilder();
    for (Map.Entry<String, String> entry : optionsMap.entrySet()) {
      sb.append("-");
      sb.append(entry.getKey());
      sb.append(" ");
      sb.append(entry.getValue());
      sb.append(" ");
    }
    String homeDir = Configuration.get(PropertyKey.HOME);
    String remoteCommand = String.format(
        "%s/bin/alluxio validateEnv %s %s %s", homeDir, target, name == null ? "" : name, sb.toString());
    String localCommand = String.format(
        "ssh -o ConnectTimeout=5 -o StrictHostKeyChecking=no -tt %s \"bash %s\"",
        node, remoteCommand);
    System.out.println("y7jin locla cmd " + localCommand);
    String[] command = {"bash", "-c", localCommand};
    try {
      ProcessBuilder builder = new ProcessBuilder(command);
      builder.redirectErrorStream(true);
      builder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
      builder.redirectInput(ProcessBuilder.Redirect.INHERIT);
      Process process = builder.start();
      process.waitFor();
      return process.exitValue() == 0;
    } catch (IOException e) {
      System.err.format("Unable to validate on node %s: %s.%n", node, e.getMessage());
      return false;
    }
  }

  // runs validation tasks in local environment
  private static boolean validateLocal(String target, String name,
      Map<String, String> optionsMap) throws InterruptedException {
    int validationCount = 0;
    int failureCount = 0;
    Collection<ValidationTask> tasks = TARGET_TASKS.get(target);
    for (ValidationTask task : tasks) {
      String taskName = TASKS.get(task);
      if (name != null && !taskName.startsWith(name)) {
        continue;
      }

      System.out.format("Validating %s...", taskName);
      if (task.validate(optionsMap)) {
        System.out.println("OK");
      } else {
        System.out.println("Failed");
        failureCount++;
      }

      validationCount++;
    }

    if (failureCount > 0) {
      System.err.format("Validation failed. Total failures: %d.%n", failureCount);
      return false;
    }

    if (validationCount == 0) {
      System.err.format("No validation task matched name \"%s\".%n", name);
      return false;
    }

    System.out.println("Validation succeeded.");
    return true;
  }

  private static boolean validateWorkers(String name, Map<String, String> optionsMap) throws InterruptedException {
    return validateRemote(Utils.readNodeList("workers"), "worker", name, optionsMap);
  }

  private static boolean validateMasters(String name, Map<String, String> optionsMap) throws InterruptedException {
    return validateRemote(Utils.readNodeList("masters"), "master", name, optionsMap);
  }

  /**
   * Prints the help message.
   *
   * @param message message before standard usage information
   */
  public static void printHelp(String message) {
    System.err.println(message);
    System.out.print(USAGE);
  }

  /**
   * Validates environment.
   *
   * @param args list of arguments
   * @return 0 on success, -1 on validation failures, -2 on invalid arguments
   */
  public static int validate(String... args) throws InterruptedException {
    CommandLine cl;
    try {
      cl = parseArgsAndOptions(args);
    } catch (InvalidArgumentException e) {
      printHelp("Invalid argument");
      return -1;
    }

    Map<String, String> optionsMap = new HashMap<>();
    for (Option opt : cl.getOptions()) {
      optionsMap.put(opt.getOpt(), opt.getValue());
    }

    String[] parsedArgs = cl.getArgs();
    if (parsedArgs == null || parsedArgs.length < 1) {
      printHelp("Target not specified.");
      return -2;
    }
    String target = parsedArgs[0];
    String name = parsedArgs.length > 1 ? parsedArgs[1] : null;

    boolean success;
    switch (target) {
      case "local":
      case "worker":
      case "master":
        success = validateLocal(target, name, optionsMap);
        break;
      case "all":
        success = validateMasters(name, optionsMap);
        success = validateWorkers(name, optionsMap) && success;
        break;
      case "workers":
        success = validateWorkers(name, optionsMap);
        break;
      case "masters":
        success = validateMasters(name, optionsMap);
        break;
      default:
        printHelp("Invalid target.");
        return -2;
    }

    return success ? 0 : -1;
  }

  /**
   * Validates Alluxio environment.
   *
   * @param args the arguments to specify which validation tasks to run
   */
  public static void main(String[] args) throws InterruptedException {
    System.exit(validate(args));
  }

  /**
   * Parses the command line arguments and options in {@code args}.
   *
   * After successful execution of this method, command line arguments can be
   * retrieved by invoking {@link CommandLine#getArgs()}, and options can be
   * retrieved by calling {@link CommandLine#getOptions()}.
   *
   * @param args
   * @return
   * @throws InvalidArgumentException
   */
  private static CommandLine parseArgsAndOptions(String... args) throws InvalidArgumentException {
    Options opts = new Options().addOption(HADOOP_CONF_DIR_OPTION);
    CommandLineParser parser = new DefaultParser();
    CommandLine cmd;

    try {
      cmd = parser.parse(opts, args);
    } catch (ParseException e) {
      throw new InvalidArgumentException(
          "Failed to parse args for validateEnv", e);
    }
    return cmd;
  }

  private ValidateEnv() {} // prevents instantiation
}
