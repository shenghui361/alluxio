// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.StringColumnStatsData}
 */
public  final class StringColumnStatsData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.StringColumnStatsData)
    StringColumnStatsDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StringColumnStatsData.newBuilder() to construct.
  private StringColumnStatsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StringColumnStatsData() {
    maxColLen_ = 0L;
    avgColLen_ = 0D;
    numNulls_ = 0L;
    numDVs_ = 0L;
    bitVectors_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StringColumnStatsData(
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
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            maxColLen_ = input.readInt64();
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            avgColLen_ = input.readDouble();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            numNulls_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            numDVs_ = input.readInt64();
            break;
          }
          case 42: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000010;
            bitVectors_ = bs;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_StringColumnStatsData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_StringColumnStatsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.StringColumnStatsData.class, alluxio.grpc.table.StringColumnStatsData.Builder.class);
  }

  private int bitField0_;
  public static final int MAXCOLLEN_FIELD_NUMBER = 1;
  private long maxColLen_;
  /**
   * <code>optional int64 maxColLen = 1;</code>
   */
  public boolean hasMaxColLen() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int64 maxColLen = 1;</code>
   */
  public long getMaxColLen() {
    return maxColLen_;
  }

  public static final int AVGCOLLEN_FIELD_NUMBER = 2;
  private double avgColLen_;
  /**
   * <code>optional double avgColLen = 2;</code>
   */
  public boolean hasAvgColLen() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional double avgColLen = 2;</code>
   */
  public double getAvgColLen() {
    return avgColLen_;
  }

  public static final int NUMNULLS_FIELD_NUMBER = 3;
  private long numNulls_;
  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  public boolean hasNumNulls() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int64 numNulls = 3;</code>
   */
  public long getNumNulls() {
    return numNulls_;
  }

  public static final int NUMDVS_FIELD_NUMBER = 4;
  private long numDVs_;
  /**
   * <code>optional int64 numDVs = 4;</code>
   */
  public boolean hasNumDVs() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 numDVs = 4;</code>
   */
  public long getNumDVs() {
    return numDVs_;
  }

  public static final int BITVECTORS_FIELD_NUMBER = 5;
  private volatile java.lang.Object bitVectors_;
  /**
   * <code>optional string bitVectors = 5;</code>
   */
  public boolean hasBitVectors() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional string bitVectors = 5;</code>
   */
  public java.lang.String getBitVectors() {
    java.lang.Object ref = bitVectors_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        bitVectors_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string bitVectors = 5;</code>
   */
  public com.google.protobuf.ByteString
      getBitVectorsBytes() {
    java.lang.Object ref = bitVectors_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bitVectors_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, maxColLen_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeDouble(2, avgColLen_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(3, numNulls_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(4, numDVs_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bitVectors_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, maxColLen_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, avgColLen_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numNulls_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, numDVs_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bitVectors_);
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
    if (!(obj instanceof alluxio.grpc.table.StringColumnStatsData)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.StringColumnStatsData other = (alluxio.grpc.table.StringColumnStatsData) obj;

    boolean result = true;
    result = result && (hasMaxColLen() == other.hasMaxColLen());
    if (hasMaxColLen()) {
      result = result && (getMaxColLen()
          == other.getMaxColLen());
    }
    result = result && (hasAvgColLen() == other.hasAvgColLen());
    if (hasAvgColLen()) {
      result = result && (
          java.lang.Double.doubleToLongBits(getAvgColLen())
          == java.lang.Double.doubleToLongBits(
              other.getAvgColLen()));
    }
    result = result && (hasNumNulls() == other.hasNumNulls());
    if (hasNumNulls()) {
      result = result && (getNumNulls()
          == other.getNumNulls());
    }
    result = result && (hasNumDVs() == other.hasNumDVs());
    if (hasNumDVs()) {
      result = result && (getNumDVs()
          == other.getNumDVs());
    }
    result = result && (hasBitVectors() == other.hasBitVectors());
    if (hasBitVectors()) {
      result = result && getBitVectors()
          .equals(other.getBitVectors());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMaxColLen()) {
      hash = (37 * hash) + MAXCOLLEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxColLen());
    }
    if (hasAvgColLen()) {
      hash = (37 * hash) + AVGCOLLEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAvgColLen()));
    }
    if (hasNumNulls()) {
      hash = (37 * hash) + NUMNULLS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumNulls());
    }
    if (hasNumDVs()) {
      hash = (37 * hash) + NUMDVS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getNumDVs());
    }
    if (hasBitVectors()) {
      hash = (37 * hash) + BITVECTORS_FIELD_NUMBER;
      hash = (53 * hash) + getBitVectors().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.StringColumnStatsData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.table.StringColumnStatsData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code alluxio.grpc.table.StringColumnStatsData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.StringColumnStatsData)
      alluxio.grpc.table.StringColumnStatsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_StringColumnStatsData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_StringColumnStatsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.StringColumnStatsData.class, alluxio.grpc.table.StringColumnStatsData.Builder.class);
    }

    // Construct using alluxio.grpc.table.StringColumnStatsData.newBuilder()
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
    public Builder clear() {
      super.clear();
      maxColLen_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      avgColLen_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000002);
      numNulls_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      numDVs_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      bitVectors_ = "";
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_StringColumnStatsData_descriptor;
    }

    public alluxio.grpc.table.StringColumnStatsData getDefaultInstanceForType() {
      return alluxio.grpc.table.StringColumnStatsData.getDefaultInstance();
    }

    public alluxio.grpc.table.StringColumnStatsData build() {
      alluxio.grpc.table.StringColumnStatsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.StringColumnStatsData buildPartial() {
      alluxio.grpc.table.StringColumnStatsData result = new alluxio.grpc.table.StringColumnStatsData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.maxColLen_ = maxColLen_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.avgColLen_ = avgColLen_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.numNulls_ = numNulls_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.numDVs_ = numDVs_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.bitVectors_ = bitVectors_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.table.StringColumnStatsData) {
        return mergeFrom((alluxio.grpc.table.StringColumnStatsData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.StringColumnStatsData other) {
      if (other == alluxio.grpc.table.StringColumnStatsData.getDefaultInstance()) return this;
      if (other.hasMaxColLen()) {
        setMaxColLen(other.getMaxColLen());
      }
      if (other.hasAvgColLen()) {
        setAvgColLen(other.getAvgColLen());
      }
      if (other.hasNumNulls()) {
        setNumNulls(other.getNumNulls());
      }
      if (other.hasNumDVs()) {
        setNumDVs(other.getNumDVs());
      }
      if (other.hasBitVectors()) {
        bitField0_ |= 0x00000010;
        bitVectors_ = other.bitVectors_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.table.StringColumnStatsData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.StringColumnStatsData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long maxColLen_ ;
    /**
     * <code>optional int64 maxColLen = 1;</code>
     */
    public boolean hasMaxColLen() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 maxColLen = 1;</code>
     */
    public long getMaxColLen() {
      return maxColLen_;
    }
    /**
     * <code>optional int64 maxColLen = 1;</code>
     */
    public Builder setMaxColLen(long value) {
      bitField0_ |= 0x00000001;
      maxColLen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 maxColLen = 1;</code>
     */
    public Builder clearMaxColLen() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxColLen_ = 0L;
      onChanged();
      return this;
    }

    private double avgColLen_ ;
    /**
     * <code>optional double avgColLen = 2;</code>
     */
    public boolean hasAvgColLen() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double avgColLen = 2;</code>
     */
    public double getAvgColLen() {
      return avgColLen_;
    }
    /**
     * <code>optional double avgColLen = 2;</code>
     */
    public Builder setAvgColLen(double value) {
      bitField0_ |= 0x00000002;
      avgColLen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double avgColLen = 2;</code>
     */
    public Builder clearAvgColLen() {
      bitField0_ = (bitField0_ & ~0x00000002);
      avgColLen_ = 0D;
      onChanged();
      return this;
    }

    private long numNulls_ ;
    /**
     * <code>optional int64 numNulls = 3;</code>
     */
    public boolean hasNumNulls() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 numNulls = 3;</code>
     */
    public long getNumNulls() {
      return numNulls_;
    }
    /**
     * <code>optional int64 numNulls = 3;</code>
     */
    public Builder setNumNulls(long value) {
      bitField0_ |= 0x00000004;
      numNulls_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 numNulls = 3;</code>
     */
    public Builder clearNumNulls() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numNulls_ = 0L;
      onChanged();
      return this;
    }

    private long numDVs_ ;
    /**
     * <code>optional int64 numDVs = 4;</code>
     */
    public boolean hasNumDVs() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int64 numDVs = 4;</code>
     */
    public long getNumDVs() {
      return numDVs_;
    }
    /**
     * <code>optional int64 numDVs = 4;</code>
     */
    public Builder setNumDVs(long value) {
      bitField0_ |= 0x00000008;
      numDVs_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 numDVs = 4;</code>
     */
    public Builder clearNumDVs() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numDVs_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object bitVectors_ = "";
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public boolean hasBitVectors() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public java.lang.String getBitVectors() {
      java.lang.Object ref = bitVectors_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          bitVectors_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public com.google.protobuf.ByteString
        getBitVectorsBytes() {
      java.lang.Object ref = bitVectors_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bitVectors_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public Builder setBitVectors(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      bitVectors_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public Builder clearBitVectors() {
      bitField0_ = (bitField0_ & ~0x00000010);
      bitVectors_ = getDefaultInstance().getBitVectors();
      onChanged();
      return this;
    }
    /**
     * <code>optional string bitVectors = 5;</code>
     */
    public Builder setBitVectorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
      bitVectors_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.StringColumnStatsData)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.StringColumnStatsData)
  private static final alluxio.grpc.table.StringColumnStatsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.StringColumnStatsData();
  }

  public static alluxio.grpc.table.StringColumnStatsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<StringColumnStatsData>
      PARSER = new com.google.protobuf.AbstractParser<StringColumnStatsData>() {
    public StringColumnStatsData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StringColumnStatsData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StringColumnStatsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StringColumnStatsData> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.StringColumnStatsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

