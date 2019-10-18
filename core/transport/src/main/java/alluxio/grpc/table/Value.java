// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.Value}
 */
public  final class Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.Value)
    ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Value() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Value(
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
            valueCase_ = 1;
            value_ = input.readInt64();
            break;
          }
          case 17: {
            valueCase_ = 2;
            value_ = input.readDouble();
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            valueCase_ = 3;
            value_ = bs;
            break;
          }
          case 32: {
            valueCase_ = 4;
            value_ = input.readBool();
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
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_Value_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.Value.class, alluxio.grpc.table.Value.Builder.class);
  }

  private int bitField0_;
  private int valueCase_ = 0;
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite {
    LONG_TYPE(1),
    DOUBLE_TYPE(2),
    STRING_TYPE(3),
    BOOLEAN_TYPE(4),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return LONG_TYPE;
        case 2: return DOUBLE_TYPE;
        case 3: return STRING_TYPE;
        case 4: return BOOLEAN_TYPE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int LONG_TYPE_FIELD_NUMBER = 1;
  /**
   * <code>optional int64 long_type = 1;</code>
   */
  public boolean hasLongType() {
    return valueCase_ == 1;
  }
  /**
   * <code>optional int64 long_type = 1;</code>
   */
  public long getLongType() {
    if (valueCase_ == 1) {
      return (java.lang.Long) value_;
    }
    return 0L;
  }

  public static final int DOUBLE_TYPE_FIELD_NUMBER = 2;
  /**
   * <code>optional double double_type = 2;</code>
   */
  public boolean hasDoubleType() {
    return valueCase_ == 2;
  }
  /**
   * <code>optional double double_type = 2;</code>
   */
  public double getDoubleType() {
    if (valueCase_ == 2) {
      return (java.lang.Double) value_;
    }
    return 0D;
  }

  public static final int STRING_TYPE_FIELD_NUMBER = 3;
  /**
   * <code>optional string string_type = 3;</code>
   */
  public boolean hasStringType() {
    return valueCase_ == 3;
  }
  /**
   * <code>optional string string_type = 3;</code>
   */
  public java.lang.String getStringType() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8() && (valueCase_ == 3)) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string string_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStringTypeBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 3) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 3) {
        value_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BOOLEAN_TYPE_FIELD_NUMBER = 4;
  /**
   * <code>optional bool boolean_type = 4;</code>
   */
  public boolean hasBooleanType() {
    return valueCase_ == 4;
  }
  /**
   * <code>optional bool boolean_type = 4;</code>
   */
  public boolean getBooleanType() {
    if (valueCase_ == 4) {
      return (java.lang.Boolean) value_;
    }
    return false;
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
    if (valueCase_ == 1) {
      output.writeInt64(
          1, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 2) {
      output.writeDouble(
          2, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    if (valueCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) value_));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            1, (long)((java.lang.Long) value_));
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            2, (double)((java.lang.Double) value_));
    }
    if (valueCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
    }
    if (valueCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) value_));
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
    if (!(obj instanceof alluxio.grpc.table.Value)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.Value other = (alluxio.grpc.table.Value) obj;

    boolean result = true;
    result = result && getValueCase().equals(
        other.getValueCase());
    if (!result) return false;
    switch (valueCase_) {
      case 1:
        result = result && (getLongType()
            == other.getLongType());
        break;
      case 2:
        result = result && (
            java.lang.Double.doubleToLongBits(getDoubleType())
            == java.lang.Double.doubleToLongBits(
                other.getDoubleType()));
        break;
      case 3:
        result = result && getStringType()
            .equals(other.getStringType());
        break;
      case 4:
        result = result && (getBooleanType()
            == other.getBooleanType());
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + LONG_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getLongType());
        break;
      case 2:
        hash = (37 * hash) + DOUBLE_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleType()));
        break;
      case 3:
        hash = (37 * hash) + STRING_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getStringType().hashCode();
        break;
      case 4:
        hash = (37 * hash) + BOOLEAN_TYPE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBooleanType());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.Value parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.Value parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.Value parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.table.Value prototype) {
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
   * Protobuf type {@code alluxio.grpc.table.Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.Value)
      alluxio.grpc.table.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_Value_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.Value.class, alluxio.grpc.table.Value.Builder.class);
    }

    // Construct using alluxio.grpc.table.Value.newBuilder()
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
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_Value_descriptor;
    }

    public alluxio.grpc.table.Value getDefaultInstanceForType() {
      return alluxio.grpc.table.Value.getDefaultInstance();
    }

    public alluxio.grpc.table.Value build() {
      alluxio.grpc.table.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.Value buildPartial() {
      alluxio.grpc.table.Value result = new alluxio.grpc.table.Value(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (valueCase_ == 1) {
        result.value_ = value_;
      }
      if (valueCase_ == 2) {
        result.value_ = value_;
      }
      if (valueCase_ == 3) {
        result.value_ = value_;
      }
      if (valueCase_ == 4) {
        result.value_ = value_;
      }
      result.bitField0_ = to_bitField0_;
      result.valueCase_ = valueCase_;
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
      if (other instanceof alluxio.grpc.table.Value) {
        return mergeFrom((alluxio.grpc.table.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.Value other) {
      if (other == alluxio.grpc.table.Value.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case LONG_TYPE: {
          setLongType(other.getLongType());
          break;
        }
        case DOUBLE_TYPE: {
          setDoubleType(other.getDoubleType());
          break;
        }
        case STRING_TYPE: {
          valueCase_ = 3;
          value_ = other.value_;
          onChanged();
          break;
        }
        case BOOLEAN_TYPE: {
          setBooleanType(other.getBooleanType());
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
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
      alluxio.grpc.table.Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>optional int64 long_type = 1;</code>
     */
    public boolean hasLongType() {
      return valueCase_ == 1;
    }
    /**
     * <code>optional int64 long_type = 1;</code>
     */
    public long getLongType() {
      if (valueCase_ == 1) {
        return (java.lang.Long) value_;
      }
      return 0L;
    }
    /**
     * <code>optional int64 long_type = 1;</code>
     */
    public Builder setLongType(long value) {
      valueCase_ = 1;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 long_type = 1;</code>
     */
    public Builder clearLongType() {
      if (valueCase_ == 1) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional double double_type = 2;</code>
     */
    public boolean hasDoubleType() {
      return valueCase_ == 2;
    }
    /**
     * <code>optional double double_type = 2;</code>
     */
    public double getDoubleType() {
      if (valueCase_ == 2) {
        return (java.lang.Double) value_;
      }
      return 0D;
    }
    /**
     * <code>optional double double_type = 2;</code>
     */
    public Builder setDoubleType(double value) {
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double double_type = 2;</code>
     */
    public Builder clearDoubleType() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>optional string string_type = 3;</code>
     */
    public boolean hasStringType() {
      return valueCase_ == 3;
    }
    /**
     * <code>optional string string_type = 3;</code>
     */
    public java.lang.String getStringType() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 3) {
          if (bs.isValidUtf8()) {
            value_ = s;
          }
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string string_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStringTypeBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 3) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 3) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string string_type = 3;</code>
     */
    public Builder setStringType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string string_type = 3;</code>
     */
    public Builder clearStringType() {
      if (valueCase_ == 3) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional string string_type = 3;</code>
     */
    public Builder setStringTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  valueCase_ = 3;
      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>optional bool boolean_type = 4;</code>
     */
    public boolean hasBooleanType() {
      return valueCase_ == 4;
    }
    /**
     * <code>optional bool boolean_type = 4;</code>
     */
    public boolean getBooleanType() {
      if (valueCase_ == 4) {
        return (java.lang.Boolean) value_;
      }
      return false;
    }
    /**
     * <code>optional bool boolean_type = 4;</code>
     */
    public Builder setBooleanType(boolean value) {
      valueCase_ = 4;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool boolean_type = 4;</code>
     */
    public Builder clearBooleanType() {
      if (valueCase_ == 4) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.Value)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.Value)
  private static final alluxio.grpc.table.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.Value();
  }

  public static alluxio.grpc.table.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    public Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Value(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

