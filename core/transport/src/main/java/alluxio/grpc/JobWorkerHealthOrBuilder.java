// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface JobWorkerHealthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.JobWorkerHealth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 workerId = 1;</code>
   */
  boolean hasWorkerId();
  /**
   * <code>optional int64 workerId = 1;</code>
   */
  long getWorkerId();

  /**
   * <code>repeated double loadAverage = 2;</code>
   */
  java.util.List<java.lang.Double> getLoadAverageList();
  /**
   * <code>repeated double loadAverage = 2;</code>
   */
  int getLoadAverageCount();
  /**
   * <code>repeated double loadAverage = 2;</code>
   */
  double getLoadAverage(int index);

  /**
   * <code>optional int64 lastUpdated = 3;</code>
   */
  boolean hasLastUpdated();
  /**
   * <code>optional int64 lastUpdated = 3;</code>
   */
  long getLastUpdated();

  /**
   * <code>optional string hostname = 4;</code>
   */
  boolean hasHostname();
  /**
   * <code>optional string hostname = 4;</code>
   */
  java.lang.String getHostname();
  /**
   * <code>optional string hostname = 4;</code>
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>optional int32 taskPoolSize = 5;</code>
   */
  boolean hasTaskPoolSize();
  /**
   * <code>optional int32 taskPoolSize = 5;</code>
   */
  int getTaskPoolSize();

  /**
   * <code>optional int32 numActiveTasks = 6;</code>
   */
  boolean hasNumActiveTasks();
  /**
   * <code>optional int32 numActiveTasks = 6;</code>
   */
  int getNumActiveTasks();

  /**
   * <code>optional int32 unfinishedTasks = 7;</code>
   */
  boolean hasUnfinishedTasks();
  /**
   * <code>optional int32 unfinishedTasks = 7;</code>
   */
  int getUnfinishedTasks();
}
