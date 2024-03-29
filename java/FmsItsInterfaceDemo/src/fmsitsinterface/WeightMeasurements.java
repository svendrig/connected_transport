// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

/**
 * Protobuf type {@code fmsitsinterface.WeightMeasurements}
 */
public final class WeightMeasurements extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fmsitsinterface.WeightMeasurements)
    WeightMeasurementsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightMeasurements.newBuilder() to construct.
  private WeightMeasurements(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightMeasurements() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeightMeasurements();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_WeightMeasurements_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_WeightMeasurements_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fmsitsinterface.WeightMeasurements.class, fmsitsinterface.WeightMeasurements.Builder.class);
  }

  public static final int AXLE_FIELD_NUMBER = 1;
  private int axle_ = 0;
  /**
   * <pre>
   * indicating axle, counting starts from top of vehicle
   * </pre>
   *
   * <code>int32 axle = 1;</code>
   * @return The axle.
   */
  @java.lang.Override
  public int getAxle() {
    return axle_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private fmsitsinterface.MeasurementType weight_;
  /**
   * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
   * @return Whether the weight field is set.
   */
  @java.lang.Override
  public boolean hasWeight() {
    return weight_ != null;
  }
  /**
   * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
   * @return The weight.
   */
  @java.lang.Override
  public fmsitsinterface.MeasurementType getWeight() {
    return weight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : weight_;
  }
  /**
   * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
   */
  @java.lang.Override
  public fmsitsinterface.MeasurementTypeOrBuilder getWeightOrBuilder() {
    return weight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : weight_;
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
    if (axle_ != 0) {
      output.writeInt32(1, axle_);
    }
    if (weight_ != null) {
      output.writeMessage(2, getWeight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (axle_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, axle_);
    }
    if (weight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWeight());
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
    if (!(obj instanceof fmsitsinterface.WeightMeasurements)) {
      return super.equals(obj);
    }
    fmsitsinterface.WeightMeasurements other = (fmsitsinterface.WeightMeasurements) obj;

    if (getAxle()
        != other.getAxle()) return false;
    if (hasWeight() != other.hasWeight()) return false;
    if (hasWeight()) {
      if (!getWeight()
          .equals(other.getWeight())) return false;
    }
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
    hash = (37 * hash) + AXLE_FIELD_NUMBER;
    hash = (53 * hash) + getAxle();
    if (hasWeight()) {
      hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getWeight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fmsitsinterface.WeightMeasurements parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static fmsitsinterface.WeightMeasurements parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static fmsitsinterface.WeightMeasurements parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.WeightMeasurements parseFrom(
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
  public static Builder newBuilder(fmsitsinterface.WeightMeasurements prototype) {
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
   * Protobuf type {@code fmsitsinterface.WeightMeasurements}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fmsitsinterface.WeightMeasurements)
      fmsitsinterface.WeightMeasurementsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_WeightMeasurements_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_WeightMeasurements_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fmsitsinterface.WeightMeasurements.class, fmsitsinterface.WeightMeasurements.Builder.class);
    }

    // Construct using fmsitsinterface.WeightMeasurements.newBuilder()
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
      axle_ = 0;
      weight_ = null;
      if (weightBuilder_ != null) {
        weightBuilder_.dispose();
        weightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_WeightMeasurements_descriptor;
    }

    @java.lang.Override
    public fmsitsinterface.WeightMeasurements getDefaultInstanceForType() {
      return fmsitsinterface.WeightMeasurements.getDefaultInstance();
    }

    @java.lang.Override
    public fmsitsinterface.WeightMeasurements build() {
      fmsitsinterface.WeightMeasurements result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fmsitsinterface.WeightMeasurements buildPartial() {
      fmsitsinterface.WeightMeasurements result = new fmsitsinterface.WeightMeasurements(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(fmsitsinterface.WeightMeasurements result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.axle_ = axle_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weight_ = weightBuilder_ == null
            ? weight_
            : weightBuilder_.build();
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
      if (other instanceof fmsitsinterface.WeightMeasurements) {
        return mergeFrom((fmsitsinterface.WeightMeasurements)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fmsitsinterface.WeightMeasurements other) {
      if (other == fmsitsinterface.WeightMeasurements.getDefaultInstance()) return this;
      if (other.getAxle() != 0) {
        setAxle(other.getAxle());
      }
      if (other.hasWeight()) {
        mergeWeight(other.getWeight());
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
              axle_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getWeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private int axle_ ;
    /**
     * <pre>
     * indicating axle, counting starts from top of vehicle
     * </pre>
     *
     * <code>int32 axle = 1;</code>
     * @return The axle.
     */
    @java.lang.Override
    public int getAxle() {
      return axle_;
    }
    /**
     * <pre>
     * indicating axle, counting starts from top of vehicle
     * </pre>
     *
     * <code>int32 axle = 1;</code>
     * @param value The axle to set.
     * @return This builder for chaining.
     */
    public Builder setAxle(int value) {

      axle_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicating axle, counting starts from top of vehicle
     * </pre>
     *
     * <code>int32 axle = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAxle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      axle_ = 0;
      onChanged();
      return this;
    }

    private fmsitsinterface.MeasurementType weight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder> weightBuilder_;
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     * @return Whether the weight field is set.
     */
    public boolean hasWeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     * @return The weight.
     */
    public fmsitsinterface.MeasurementType getWeight() {
      if (weightBuilder_ == null) {
        return weight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : weight_;
      } else {
        return weightBuilder_.getMessage();
      }
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public Builder setWeight(fmsitsinterface.MeasurementType value) {
      if (weightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        weight_ = value;
      } else {
        weightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public Builder setWeight(
        fmsitsinterface.MeasurementType.Builder builderForValue) {
      if (weightBuilder_ == null) {
        weight_ = builderForValue.build();
      } else {
        weightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public Builder mergeWeight(fmsitsinterface.MeasurementType value) {
      if (weightBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          weight_ != null &&
          weight_ != fmsitsinterface.MeasurementType.getDefaultInstance()) {
          getWeightBuilder().mergeFrom(value);
        } else {
          weight_ = value;
        }
      } else {
        weightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public Builder clearWeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      weight_ = null;
      if (weightBuilder_ != null) {
        weightBuilder_.dispose();
        weightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public fmsitsinterface.MeasurementType.Builder getWeightBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWeightFieldBuilder().getBuilder();
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    public fmsitsinterface.MeasurementTypeOrBuilder getWeightOrBuilder() {
      if (weightBuilder_ != null) {
        return weightBuilder_.getMessageOrBuilder();
      } else {
        return weight_ == null ?
            fmsitsinterface.MeasurementType.getDefaultInstance() : weight_;
      }
    }
    /**
     * <code>.fmsitsinterface.MeasurementType weight = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder> 
        getWeightFieldBuilder() {
      if (weightBuilder_ == null) {
        weightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder>(
                getWeight(),
                getParentForChildren(),
                isClean());
        weight_ = null;
      }
      return weightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:fmsitsinterface.WeightMeasurements)
  }

  // @@protoc_insertion_point(class_scope:fmsitsinterface.WeightMeasurements)
  private static final fmsitsinterface.WeightMeasurements DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fmsitsinterface.WeightMeasurements();
  }

  public static fmsitsinterface.WeightMeasurements getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightMeasurements>
      PARSER = new com.google.protobuf.AbstractParser<WeightMeasurements>() {
    @java.lang.Override
    public WeightMeasurements parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeightMeasurements> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeightMeasurements> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fmsitsinterface.WeightMeasurements getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

