// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/block_master.proto

package alluxio.grpc;

/**
 * <pre>
 **
 * A list of lost storage paths inside a worker
 * </pre>
 *
 * Protobuf type {@code alluxio.grpc.block.StorageList}
 */
public  final class StorageList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.block.StorageList)
    StorageListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StorageList.newBuilder() to construct.
  private StorageList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StorageList() {
    storage_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StorageList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StorageList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              storage_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            storage_.add(bs);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        storage_ = storage_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_StorageList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_StorageList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.StorageList.class, alluxio.grpc.StorageList.Builder.class);
  }

  public static final int STORAGE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList storage_;
  /**
   * <pre>
   ** a lost storage path 
   * </pre>
   *
   * <code>repeated string storage = 1;</code>
   * @return A list containing the storage.
   */
  public com.google.protobuf.ProtocolStringList
      getStorageList() {
    return storage_;
  }
  /**
   * <pre>
   ** a lost storage path 
   * </pre>
   *
   * <code>repeated string storage = 1;</code>
   * @return The count of storage.
   */
  public int getStorageCount() {
    return storage_.size();
  }
  /**
   * <pre>
   ** a lost storage path 
   * </pre>
   *
   * <code>repeated string storage = 1;</code>
   * @param index The index of the element to return.
   * @return The storage at the given index.
   */
  public java.lang.String getStorage(int index) {
    return storage_.get(index);
  }
  /**
   * <pre>
   ** a lost storage path 
   * </pre>
   *
   * <code>repeated string storage = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the storage at the given index.
   */
  public com.google.protobuf.ByteString
      getStorageBytes(int index) {
    return storage_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < storage_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, storage_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < storage_.size(); i++) {
        dataSize += computeStringSizeNoTag(storage_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStorageList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.StorageList)) {
      return super.equals(obj);
    }
    alluxio.grpc.StorageList other = (alluxio.grpc.StorageList) obj;

    if (!getStorageList()
        .equals(other.getStorageList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getStorageCount() > 0) {
      hash = (37 * hash) + STORAGE_FIELD_NUMBER;
      hash = (53 * hash) + getStorageList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.StorageList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.StorageList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.StorageList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.StorageList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.StorageList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.StorageList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.StorageList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.StorageList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.StorageList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.StorageList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.StorageList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.StorageList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.StorageList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * A list of lost storage paths inside a worker
   * </pre>
   *
   * Protobuf type {@code alluxio.grpc.block.StorageList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.block.StorageList)
      alluxio.grpc.StorageListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_StorageList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_StorageList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.StorageList.class, alluxio.grpc.StorageList.Builder.class);
    }

    // Construct using alluxio.grpc.StorageList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      storage_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.BlockMasterProto.internal_static_alluxio_grpc_block_StorageList_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.StorageList getDefaultInstanceForType() {
      return alluxio.grpc.StorageList.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.StorageList build() {
      alluxio.grpc.StorageList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.StorageList buildPartial() {
      alluxio.grpc.StorageList result = new alluxio.grpc.StorageList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        storage_ = storage_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.storage_ = storage_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.StorageList) {
        return mergeFrom((alluxio.grpc.StorageList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.StorageList other) {
      if (other == alluxio.grpc.StorageList.getDefaultInstance()) return this;
      if (!other.storage_.isEmpty()) {
        if (storage_.isEmpty()) {
          storage_ = other.storage_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStorageIsMutable();
          storage_.addAll(other.storage_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.StorageList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.StorageList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList storage_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureStorageIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        storage_ = new com.google.protobuf.LazyStringArrayList(storage_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @return A list containing the storage.
     */
    public com.google.protobuf.ProtocolStringList
        getStorageList() {
      return storage_.getUnmodifiableView();
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @return The count of storage.
     */
    public int getStorageCount() {
      return storage_.size();
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param index The index of the element to return.
     * @return The storage at the given index.
     */
    public java.lang.String getStorage(int index) {
      return storage_.get(index);
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the storage at the given index.
     */
    public com.google.protobuf.ByteString
        getStorageBytes(int index) {
      return storage_.getByteString(index);
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param index The index to set the value at.
     * @param value The storage to set.
     * @return This builder for chaining.
     */
    public Builder setStorage(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageIsMutable();
      storage_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param value The storage to add.
     * @return This builder for chaining.
     */
    public Builder addStorage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageIsMutable();
      storage_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param values The storage to add.
     * @return This builder for chaining.
     */
    public Builder addAllStorage(
        java.lang.Iterable<java.lang.String> values) {
      ensureStorageIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, storage_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStorage() {
      storage_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     ** a lost storage path 
     * </pre>
     *
     * <code>repeated string storage = 1;</code>
     * @param value The bytes of the storage to add.
     * @return This builder for chaining.
     */
    public Builder addStorageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureStorageIsMutable();
      storage_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.block.StorageList)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.block.StorageList)
  private static final alluxio.grpc.StorageList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.StorageList();
  }

  public static alluxio.grpc.StorageList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StorageList>
      PARSER = new com.google.protobuf.AbstractParser<StorageList>() {
    @java.lang.Override
    public StorageList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StorageList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StorageList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.StorageList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

