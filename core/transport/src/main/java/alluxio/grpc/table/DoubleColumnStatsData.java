// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.DoubleColumnStatsData}
 */
public  final class DoubleColumnStatsData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.DoubleColumnStatsData)
    DoubleColumnStatsDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DoubleColumnStatsData.newBuilder() to construct.
  private DoubleColumnStatsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DoubleColumnStatsData() {
    lowValue_ = 0D;
    highValue_ = 0D;
    numNulls_ = 0L;
    numDVs_ = 0L;
    bitVectors_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DoubleColumnStatsData(
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
          case 9: {
            bitField0_ |= 0x00000001;
            lowValue_ = input.readDouble();
            break;
          }
          case 17: {
            bitField0_ |= 0x00000002;
            highValue_ = input.readDouble();
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
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_DoubleColumnStatsData_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_DoubleColumnStatsData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.DoubleColumnStatsData.class, alluxio.grpc.table.DoubleColumnStatsData.Builder.class);
  }

  private int bitField0_;
  public static final int LOWVALUE_FIELD_NUMBER = 1;
  private double lowValue_;
  /**
   * <code>optional double lowValue = 1;</code>
   */
  public boolean hasLowValue() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional double lowValue = 1;</code>
   */
  public double getLowValue() {
    return lowValue_;
  }

  public static final int HIGHVALUE_FIELD_NUMBER = 2;
  private double highValue_;
  /**
   * <code>optional double highValue = 2;</code>
   */
  public boolean hasHighValue() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional double highValue = 2;</code>
   */
  public double getHighValue() {
    return highValue_;
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
      output.writeDouble(1, lowValue_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeDouble(2, highValue_);
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
        .computeDoubleSize(1, lowValue_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, highValue_);
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
    if (!(obj instanceof alluxio.grpc.table.DoubleColumnStatsData)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.DoubleColumnStatsData other = (alluxio.grpc.table.DoubleColumnStatsData) obj;

    boolean result = true;
    result = result && (hasLowValue() == other.hasLowValue());
    if (hasLowValue()) {
      result = result && (
          java.lang.Double.doubleToLongBits(getLowValue())
          == java.lang.Double.doubleToLongBits(
              other.getLowValue()));
    }
    result = result && (hasHighValue() == other.hasHighValue());
    if (hasHighValue()) {
      result = result && (
          java.lang.Double.doubleToLongBits(getHighValue())
          == java.lang.Double.doubleToLongBits(
              other.getHighValue()));
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
    if (hasLowValue()) {
      hash = (37 * hash) + LOWVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLowValue()));
    }
    if (hasHighValue()) {
      hash = (37 * hash) + HIGHVALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getHighValue()));
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

  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.DoubleColumnStatsData parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.table.DoubleColumnStatsData prototype) {
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
   * Protobuf type {@code alluxio.grpc.table.DoubleColumnStatsData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.DoubleColumnStatsData)
      alluxio.grpc.table.DoubleColumnStatsDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_DoubleColumnStatsData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_DoubleColumnStatsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.DoubleColumnStatsData.class, alluxio.grpc.table.DoubleColumnStatsData.Builder.class);
    }

    // Construct using alluxio.grpc.table.DoubleColumnStatsData.newBuilder()
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
      lowValue_ = 0D;
      bitField0_ = (bitField0_ & ~0x00000001);
      highValue_ = 0D;
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
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_DoubleColumnStatsData_descriptor;
    }

    public alluxio.grpc.table.DoubleColumnStatsData getDefaultInstanceForType() {
      return alluxio.grpc.table.DoubleColumnStatsData.getDefaultInstance();
    }

    public alluxio.grpc.table.DoubleColumnStatsData build() {
      alluxio.grpc.table.DoubleColumnStatsData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.DoubleColumnStatsData buildPartial() {
      alluxio.grpc.table.DoubleColumnStatsData result = new alluxio.grpc.table.DoubleColumnStatsData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.lowValue_ = lowValue_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.highValue_ = highValue_;
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
      if (other instanceof alluxio.grpc.table.DoubleColumnStatsData) {
        return mergeFrom((alluxio.grpc.table.DoubleColumnStatsData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.DoubleColumnStatsData other) {
      if (other == alluxio.grpc.table.DoubleColumnStatsData.getDefaultInstance()) return this;
      if (other.hasLowValue()) {
        setLowValue(other.getLowValue());
      }
      if (other.hasHighValue()) {
        setHighValue(other.getHighValue());
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
      alluxio.grpc.table.DoubleColumnStatsData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.DoubleColumnStatsData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double lowValue_ ;
    /**
     * <code>optional double lowValue = 1;</code>
     */
    public boolean hasLowValue() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional double lowValue = 1;</code>
     */
    public double getLowValue() {
      return lowValue_;
    }
    /**
     * <code>optional double lowValue = 1;</code>
     */
    public Builder setLowValue(double value) {
      bitField0_ |= 0x00000001;
      lowValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double lowValue = 1;</code>
     */
    public Builder clearLowValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lowValue_ = 0D;
      onChanged();
      return this;
    }

    private double highValue_ ;
    /**
     * <code>optional double highValue = 2;</code>
     */
    public boolean hasHighValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double highValue = 2;</code>
     */
    public double getHighValue() {
      return highValue_;
    }
    /**
     * <code>optional double highValue = 2;</code>
     */
    public Builder setHighValue(double value) {
      bitField0_ |= 0x00000002;
      highValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double highValue = 2;</code>
     */
    public Builder clearHighValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      highValue_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.DoubleColumnStatsData)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.DoubleColumnStatsData)
  private static final alluxio.grpc.table.DoubleColumnStatsData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.DoubleColumnStatsData();
  }

  public static alluxio.grpc.table.DoubleColumnStatsData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<DoubleColumnStatsData>
      PARSER = new com.google.protobuf.AbstractParser<DoubleColumnStatsData>() {
    public DoubleColumnStatsData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DoubleColumnStatsData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DoubleColumnStatsData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleColumnStatsData> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.DoubleColumnStatsData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

