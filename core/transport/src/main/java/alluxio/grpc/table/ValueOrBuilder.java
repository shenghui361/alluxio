// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 long_type = 1;</code>
   */
  boolean hasLongType();
  /**
   * <code>optional int64 long_type = 1;</code>
   */
  long getLongType();

  /**
   * <code>optional double double_type = 2;</code>
   */
  boolean hasDoubleType();
  /**
   * <code>optional double double_type = 2;</code>
   */
  double getDoubleType();

  /**
   * <code>optional string string_type = 3;</code>
   */
  boolean hasStringType();
  /**
   * <code>optional string string_type = 3;</code>
   */
  java.lang.String getStringType();
  /**
   * <code>optional string string_type = 3;</code>
   */
  com.google.protobuf.ByteString
      getStringTypeBytes();

  /**
   * <code>optional bool boolean_type = 4;</code>
   */
  boolean hasBooleanType();
  /**
   * <code>optional bool boolean_type = 4;</code>
   */
  boolean getBooleanType();

  public alluxio.grpc.table.Value.ValueCase getValueCase();
}
