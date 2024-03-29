// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

/**
 * Protobuf type {@code fmsitsinterface.MeasurementType}
 */
public final class MeasurementType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fmsitsinterface.MeasurementType)
    MeasurementTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MeasurementType.newBuilder() to construct.
  private MeasurementType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MeasurementType() {
    unit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MeasurementType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_MeasurementType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_MeasurementType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fmsitsinterface.MeasurementType.class, fmsitsinterface.MeasurementType.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_ = 0;
  /**
   * <code>int32 value = 1;</code>
   * @return The value.
   */
  @java.lang.Override
  public int getValue() {
    return value_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private int unit_ = 0;
  /**
   * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  @java.lang.Override public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
   * @return The unit.
   */
  @java.lang.Override public fmsitsinterface.MeasurementUnit getUnit() {
    fmsitsinterface.MeasurementUnit result = fmsitsinterface.MeasurementUnit.forNumber(unit_);
    return result == null ? fmsitsinterface.MeasurementUnit.UNRECOGNIZED : result;
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
    if (value_ != 0) {
      output.writeInt32(1, value_);
    }
    if (unit_ != fmsitsinterface.MeasurementUnit.UNKNOWN.getNumber()) {
      output.writeEnum(2, unit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, value_);
    }
    if (unit_ != fmsitsinterface.MeasurementUnit.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unit_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof fmsitsinterface.MeasurementType)) {
      return super.equals(obj);
    }
    fmsitsinterface.MeasurementType other = (fmsitsinterface.MeasurementType) obj;

    if (getValue()
        != other.getValue()) return false;
    if (unit_ != other.unit_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue();
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fmsitsinterface.MeasurementType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.MeasurementType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.MeasurementType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static fmsitsinterface.MeasurementType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static fmsitsinterface.MeasurementType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.MeasurementType parseFrom(
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
  public static Builder newBuilder(fmsitsinterface.MeasurementType prototype) {
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
   * Protobuf type {@code fmsitsinterface.MeasurementType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fmsitsinterface.MeasurementType)
      fmsitsinterface.MeasurementTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_MeasurementType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_MeasurementType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fmsitsinterface.MeasurementType.class, fmsitsinterface.MeasurementType.Builder.class);
    }

    // Construct using fmsitsinterface.MeasurementType.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = 0;
      unit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_MeasurementType_descriptor;
    }

    @java.lang.Override
    public fmsitsinterface.MeasurementType getDefaultInstanceForType() {
      return fmsitsinterface.MeasurementType.getDefaultInstance();
    }

    @java.lang.Override
    public fmsitsinterface.MeasurementType build() {
      fmsitsinterface.MeasurementType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fmsitsinterface.MeasurementType buildPartial() {
      fmsitsinterface.MeasurementType result = new fmsitsinterface.MeasurementType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(fmsitsinterface.MeasurementType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unit_ = unit_;
      }
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
      if (other instanceof fmsitsinterface.MeasurementType) {
        return mergeFrom((fmsitsinterface.MeasurementType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fmsitsinterface.MeasurementType other) {
      if (other == fmsitsinterface.MeasurementType.getDefaultInstance()) return this;
      if (other.getValue() != 0) {
        setValue(other.getValue());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              value_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              unit_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int value_ ;
    /**
     * <code>int32 value = 1;</code>
     * @return The value.
     */
    @java.lang.Override
    public int getValue() {
      return value_;
    }
    /**
     * <code>int32 value = 1;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(int value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 value = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
     * @return The enum numeric value on the wire for unit.
     */
    @java.lang.Override public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
     * @return The unit.
     */
    @java.lang.Override
    public fmsitsinterface.MeasurementUnit getUnit() {
      fmsitsinterface.MeasurementUnit result = fmsitsinterface.MeasurementUnit.forNumber(unit_);
      return result == null ? fmsitsinterface.MeasurementUnit.UNRECOGNIZED : result;
    }
    /**
     * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(fmsitsinterface.MeasurementUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementUnit unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      unit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:fmsitsinterface.MeasurementType)
  }

  // @@protoc_insertion_point(class_scope:fmsitsinterface.MeasurementType)
  private static final fmsitsinterface.MeasurementType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fmsitsinterface.MeasurementType();
  }

  public static fmsitsinterface.MeasurementType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MeasurementType>
      PARSER = new com.google.protobuf.AbstractParser<MeasurementType>() {
    @java.lang.Override
    public MeasurementType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MeasurementType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MeasurementType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fmsitsinterface.MeasurementType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

