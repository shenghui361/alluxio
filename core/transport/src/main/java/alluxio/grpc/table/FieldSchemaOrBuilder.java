// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface FieldSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.FieldSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional uint32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>optional string name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string type = 3;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <code>optional string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>optional string comment = 4;</code>
   * @return Whether the comment field is set.
   */
  boolean hasComment();
  /**
   * <code>optional string comment = 4;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>optional string comment = 4;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();
}
