// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface JobCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.JobCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  boolean hasRunTaskCommand();
  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  alluxio.grpc.RunTaskCommand getRunTaskCommand();
  /**
   * <code>optional .alluxio.grpc.job.RunTaskCommand runTaskCommand = 1;</code>
   */
  alluxio.grpc.RunTaskCommandOrBuilder getRunTaskCommandOrBuilder();

  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  boolean hasCancelTaskCommand();
  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  alluxio.grpc.CancelTaskCommand getCancelTaskCommand();
  /**
   * <code>optional .alluxio.grpc.job.CancelTaskCommand cancelTaskCommand = 2;</code>
   */
  alluxio.grpc.CancelTaskCommandOrBuilder getCancelTaskCommandOrBuilder();

  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  boolean hasRegisterCommand();
  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  alluxio.grpc.RegisterCommand getRegisterCommand();
  /**
   * <code>optional .alluxio.grpc.job.RegisterCommand registerCommand = 3;</code>
   */
  alluxio.grpc.RegisterCommandOrBuilder getRegisterCommandOrBuilder();

  /**
   * <code>optional .alluxio.grpc.job.SetTaskPoolSizeCommand setTaskPoolSizeCommand = 4;</code>
   */
  boolean hasSetTaskPoolSizeCommand();
  /**
   * <code>optional .alluxio.grpc.job.SetTaskPoolSizeCommand setTaskPoolSizeCommand = 4;</code>
   */
  alluxio.grpc.SetTaskPoolSizeCommand getSetTaskPoolSizeCommand();
  /**
   * <code>optional .alluxio.grpc.job.SetTaskPoolSizeCommand setTaskPoolSizeCommand = 4;</code>
   */
  alluxio.grpc.SetTaskPoolSizeCommandOrBuilder getSetTaskPoolSizeCommandOrBuilder();
}
