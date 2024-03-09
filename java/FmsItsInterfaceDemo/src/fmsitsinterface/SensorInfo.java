// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

/**
 * Protobuf type {@code fmsitsinterface.SensorInfo}
 */
public final class SensorInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fmsitsinterface.SensorInfo)
    SensorInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SensorInfo.newBuilder() to construct.
  private SensorInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SensorInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SensorInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_SensorInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_SensorInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fmsitsinterface.SensorInfo.class, fmsitsinterface.SensorInfo.Builder.class);
  }

  public static final int TIRE_PRESSURE_FIELD_NUMBER = 1;
  private fmsitsinterface.TirePressure tirePressure_;
  /**
   * <pre>
   * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
   * </pre>
   *
   * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
   * @return Whether the tirePressure field is set.
   */
  @java.lang.Override
  public boolean hasTirePressure() {
    return tirePressure_ != null;
  }
  /**
   * <pre>
   * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
   * </pre>
   *
   * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
   * @return The tirePressure.
   */
  @java.lang.Override
  public fmsitsinterface.TirePressure getTirePressure() {
    return tirePressure_ == null ? fmsitsinterface.TirePressure.getDefaultInstance() : tirePressure_;
  }
  /**
   * <pre>
   * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
   * </pre>
   *
   * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
   */
  @java.lang.Override
  public fmsitsinterface.TirePressureOrBuilder getTirePressureOrBuilder() {
    return tirePressure_ == null ? fmsitsinterface.TirePressure.getDefaultInstance() : tirePressure_;
  }

  public static final int VEHICLE_WEIGHT_FIELD_NUMBER = 2;
  private fmsitsinterface.VehicleWeight vehicleWeight_;
  /**
   * <pre>
   * object containing information on vehicle weight, its_event_code WEIGHT
   * </pre>
   *
   * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
   * @return Whether the vehicleWeight field is set.
   */
  @java.lang.Override
  public boolean hasVehicleWeight() {
    return vehicleWeight_ != null;
  }
  /**
   * <pre>
   * object containing information on vehicle weight, its_event_code WEIGHT
   * </pre>
   *
   * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
   * @return The vehicleWeight.
   */
  @java.lang.Override
  public fmsitsinterface.VehicleWeight getVehicleWeight() {
    return vehicleWeight_ == null ? fmsitsinterface.VehicleWeight.getDefaultInstance() : vehicleWeight_;
  }
  /**
   * <pre>
   * object containing information on vehicle weight, its_event_code WEIGHT
   * </pre>
   *
   * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
   */
  @java.lang.Override
  public fmsitsinterface.VehicleWeightOrBuilder getVehicleWeightOrBuilder() {
    return vehicleWeight_ == null ? fmsitsinterface.VehicleWeight.getDefaultInstance() : vehicleWeight_;
  }

  public static final int VEHICLE_HEIGHT_FIELD_NUMBER = 3;
  private fmsitsinterface.MeasurementType vehicleHeight_;
  /**
   * <pre>
   * object containing information on vehicle height, its_event_code ALTIMETE
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
   * @return Whether the vehicleHeight field is set.
   */
  @java.lang.Override
  public boolean hasVehicleHeight() {
    return vehicleHeight_ != null;
  }
  /**
   * <pre>
   * object containing information on vehicle height, its_event_code ALTIMETE
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
   * @return The vehicleHeight.
   */
  @java.lang.Override
  public fmsitsinterface.MeasurementType getVehicleHeight() {
    return vehicleHeight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : vehicleHeight_;
  }
  /**
   * <pre>
   * object containing information on vehicle height, its_event_code ALTIMETE
   * </pre>
   *
   * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
   */
  @java.lang.Override
  public fmsitsinterface.MeasurementTypeOrBuilder getVehicleHeightOrBuilder() {
    return vehicleHeight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : vehicleHeight_;
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
    if (tirePressure_ != null) {
      output.writeMessage(1, getTirePressure());
    }
    if (vehicleWeight_ != null) {
      output.writeMessage(2, getVehicleWeight());
    }
    if (vehicleHeight_ != null) {
      output.writeMessage(3, getVehicleHeight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tirePressure_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTirePressure());
    }
    if (vehicleWeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVehicleWeight());
    }
    if (vehicleHeight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVehicleHeight());
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
    if (!(obj instanceof fmsitsinterface.SensorInfo)) {
      return super.equals(obj);
    }
    fmsitsinterface.SensorInfo other = (fmsitsinterface.SensorInfo) obj;

    if (hasTirePressure() != other.hasTirePressure()) return false;
    if (hasTirePressure()) {
      if (!getTirePressure()
          .equals(other.getTirePressure())) return false;
    }
    if (hasVehicleWeight() != other.hasVehicleWeight()) return false;
    if (hasVehicleWeight()) {
      if (!getVehicleWeight()
          .equals(other.getVehicleWeight())) return false;
    }
    if (hasVehicleHeight() != other.hasVehicleHeight()) return false;
    if (hasVehicleHeight()) {
      if (!getVehicleHeight()
          .equals(other.getVehicleHeight())) return false;
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
    if (hasTirePressure()) {
      hash = (37 * hash) + TIRE_PRESSURE_FIELD_NUMBER;
      hash = (53 * hash) + getTirePressure().hashCode();
    }
    if (hasVehicleWeight()) {
      hash = (37 * hash) + VEHICLE_WEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getVehicleWeight().hashCode();
    }
    if (hasVehicleHeight()) {
      hash = (37 * hash) + VEHICLE_HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getVehicleHeight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fmsitsinterface.SensorInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.SensorInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.SensorInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static fmsitsinterface.SensorInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static fmsitsinterface.SensorInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.SensorInfo parseFrom(
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
  public static Builder newBuilder(fmsitsinterface.SensorInfo prototype) {
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
   * Protobuf type {@code fmsitsinterface.SensorInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fmsitsinterface.SensorInfo)
      fmsitsinterface.SensorInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_SensorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_SensorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fmsitsinterface.SensorInfo.class, fmsitsinterface.SensorInfo.Builder.class);
    }

    // Construct using fmsitsinterface.SensorInfo.newBuilder()
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
      tirePressure_ = null;
      if (tirePressureBuilder_ != null) {
        tirePressureBuilder_.dispose();
        tirePressureBuilder_ = null;
      }
      vehicleWeight_ = null;
      if (vehicleWeightBuilder_ != null) {
        vehicleWeightBuilder_.dispose();
        vehicleWeightBuilder_ = null;
      }
      vehicleHeight_ = null;
      if (vehicleHeightBuilder_ != null) {
        vehicleHeightBuilder_.dispose();
        vehicleHeightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_SensorInfo_descriptor;
    }

    @java.lang.Override
    public fmsitsinterface.SensorInfo getDefaultInstanceForType() {
      return fmsitsinterface.SensorInfo.getDefaultInstance();
    }

    @java.lang.Override
    public fmsitsinterface.SensorInfo build() {
      fmsitsinterface.SensorInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fmsitsinterface.SensorInfo buildPartial() {
      fmsitsinterface.SensorInfo result = new fmsitsinterface.SensorInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(fmsitsinterface.SensorInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tirePressure_ = tirePressureBuilder_ == null
            ? tirePressure_
            : tirePressureBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vehicleWeight_ = vehicleWeightBuilder_ == null
            ? vehicleWeight_
            : vehicleWeightBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.vehicleHeight_ = vehicleHeightBuilder_ == null
            ? vehicleHeight_
            : vehicleHeightBuilder_.build();
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
      if (other instanceof fmsitsinterface.SensorInfo) {
        return mergeFrom((fmsitsinterface.SensorInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fmsitsinterface.SensorInfo other) {
      if (other == fmsitsinterface.SensorInfo.getDefaultInstance()) return this;
      if (other.hasTirePressure()) {
        mergeTirePressure(other.getTirePressure());
      }
      if (other.hasVehicleWeight()) {
        mergeVehicleWeight(other.getVehicleWeight());
      }
      if (other.hasVehicleHeight()) {
        mergeVehicleHeight(other.getVehicleHeight());
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
            case 10: {
              input.readMessage(
                  getTirePressureFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getVehicleWeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getVehicleHeightFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private fmsitsinterface.TirePressure tirePressure_;
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.TirePressure, fmsitsinterface.TirePressure.Builder, fmsitsinterface.TirePressureOrBuilder> tirePressureBuilder_;
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     * @return Whether the tirePressure field is set.
     */
    public boolean hasTirePressure() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     * @return The tirePressure.
     */
    public fmsitsinterface.TirePressure getTirePressure() {
      if (tirePressureBuilder_ == null) {
        return tirePressure_ == null ? fmsitsinterface.TirePressure.getDefaultInstance() : tirePressure_;
      } else {
        return tirePressureBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public Builder setTirePressure(fmsitsinterface.TirePressure value) {
      if (tirePressureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tirePressure_ = value;
      } else {
        tirePressureBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public Builder setTirePressure(
        fmsitsinterface.TirePressure.Builder builderForValue) {
      if (tirePressureBuilder_ == null) {
        tirePressure_ = builderForValue.build();
      } else {
        tirePressureBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public Builder mergeTirePressure(fmsitsinterface.TirePressure value) {
      if (tirePressureBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tirePressure_ != null &&
          tirePressure_ != fmsitsinterface.TirePressure.getDefaultInstance()) {
          getTirePressureBuilder().mergeFrom(value);
        } else {
          tirePressure_ = value;
        }
      } else {
        tirePressureBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public Builder clearTirePressure() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tirePressure_ = null;
      if (tirePressureBuilder_ != null) {
        tirePressureBuilder_.dispose();
        tirePressureBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public fmsitsinterface.TirePressure.Builder getTirePressureBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTirePressureFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    public fmsitsinterface.TirePressureOrBuilder getTirePressureOrBuilder() {
      if (tirePressureBuilder_ != null) {
        return tirePressureBuilder_.getMessageOrBuilder();
      } else {
        return tirePressure_ == null ?
            fmsitsinterface.TirePressure.getDefaultInstance() : tirePressure_;
      }
    }
    /**
     * <pre>
     * object containing information on tire pressures, its_event_code TIRE_PRESSURE_GAUGE
     * </pre>
     *
     * <code>.fmsitsinterface.TirePressure tire_pressure = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.TirePressure, fmsitsinterface.TirePressure.Builder, fmsitsinterface.TirePressureOrBuilder> 
        getTirePressureFieldBuilder() {
      if (tirePressureBuilder_ == null) {
        tirePressureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fmsitsinterface.TirePressure, fmsitsinterface.TirePressure.Builder, fmsitsinterface.TirePressureOrBuilder>(
                getTirePressure(),
                getParentForChildren(),
                isClean());
        tirePressure_ = null;
      }
      return tirePressureBuilder_;
    }

    private fmsitsinterface.VehicleWeight vehicleWeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.VehicleWeight, fmsitsinterface.VehicleWeight.Builder, fmsitsinterface.VehicleWeightOrBuilder> vehicleWeightBuilder_;
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     * @return Whether the vehicleWeight field is set.
     */
    public boolean hasVehicleWeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     * @return The vehicleWeight.
     */
    public fmsitsinterface.VehicleWeight getVehicleWeight() {
      if (vehicleWeightBuilder_ == null) {
        return vehicleWeight_ == null ? fmsitsinterface.VehicleWeight.getDefaultInstance() : vehicleWeight_;
      } else {
        return vehicleWeightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public Builder setVehicleWeight(fmsitsinterface.VehicleWeight value) {
      if (vehicleWeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vehicleWeight_ = value;
      } else {
        vehicleWeightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public Builder setVehicleWeight(
        fmsitsinterface.VehicleWeight.Builder builderForValue) {
      if (vehicleWeightBuilder_ == null) {
        vehicleWeight_ = builderForValue.build();
      } else {
        vehicleWeightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public Builder mergeVehicleWeight(fmsitsinterface.VehicleWeight value) {
      if (vehicleWeightBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          vehicleWeight_ != null &&
          vehicleWeight_ != fmsitsinterface.VehicleWeight.getDefaultInstance()) {
          getVehicleWeightBuilder().mergeFrom(value);
        } else {
          vehicleWeight_ = value;
        }
      } else {
        vehicleWeightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public Builder clearVehicleWeight() {
      bitField0_ = (bitField0_ & ~0x00000002);
      vehicleWeight_ = null;
      if (vehicleWeightBuilder_ != null) {
        vehicleWeightBuilder_.dispose();
        vehicleWeightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public fmsitsinterface.VehicleWeight.Builder getVehicleWeightBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getVehicleWeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    public fmsitsinterface.VehicleWeightOrBuilder getVehicleWeightOrBuilder() {
      if (vehicleWeightBuilder_ != null) {
        return vehicleWeightBuilder_.getMessageOrBuilder();
      } else {
        return vehicleWeight_ == null ?
            fmsitsinterface.VehicleWeight.getDefaultInstance() : vehicleWeight_;
      }
    }
    /**
     * <pre>
     * object containing information on vehicle weight, its_event_code WEIGHT
     * </pre>
     *
     * <code>.fmsitsinterface.VehicleWeight vehicle_weight = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.VehicleWeight, fmsitsinterface.VehicleWeight.Builder, fmsitsinterface.VehicleWeightOrBuilder> 
        getVehicleWeightFieldBuilder() {
      if (vehicleWeightBuilder_ == null) {
        vehicleWeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fmsitsinterface.VehicleWeight, fmsitsinterface.VehicleWeight.Builder, fmsitsinterface.VehicleWeightOrBuilder>(
                getVehicleWeight(),
                getParentForChildren(),
                isClean());
        vehicleWeight_ = null;
      }
      return vehicleWeightBuilder_;
    }

    private fmsitsinterface.MeasurementType vehicleHeight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder> vehicleHeightBuilder_;
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     * @return Whether the vehicleHeight field is set.
     */
    public boolean hasVehicleHeight() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     * @return The vehicleHeight.
     */
    public fmsitsinterface.MeasurementType getVehicleHeight() {
      if (vehicleHeightBuilder_ == null) {
        return vehicleHeight_ == null ? fmsitsinterface.MeasurementType.getDefaultInstance() : vehicleHeight_;
      } else {
        return vehicleHeightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public Builder setVehicleHeight(fmsitsinterface.MeasurementType value) {
      if (vehicleHeightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vehicleHeight_ = value;
      } else {
        vehicleHeightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public Builder setVehicleHeight(
        fmsitsinterface.MeasurementType.Builder builderForValue) {
      if (vehicleHeightBuilder_ == null) {
        vehicleHeight_ = builderForValue.build();
      } else {
        vehicleHeightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public Builder mergeVehicleHeight(fmsitsinterface.MeasurementType value) {
      if (vehicleHeightBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          vehicleHeight_ != null &&
          vehicleHeight_ != fmsitsinterface.MeasurementType.getDefaultInstance()) {
          getVehicleHeightBuilder().mergeFrom(value);
        } else {
          vehicleHeight_ = value;
        }
      } else {
        vehicleHeightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public Builder clearVehicleHeight() {
      bitField0_ = (bitField0_ & ~0x00000004);
      vehicleHeight_ = null;
      if (vehicleHeightBuilder_ != null) {
        vehicleHeightBuilder_.dispose();
        vehicleHeightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public fmsitsinterface.MeasurementType.Builder getVehicleHeightBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getVehicleHeightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    public fmsitsinterface.MeasurementTypeOrBuilder getVehicleHeightOrBuilder() {
      if (vehicleHeightBuilder_ != null) {
        return vehicleHeightBuilder_.getMessageOrBuilder();
      } else {
        return vehicleHeight_ == null ?
            fmsitsinterface.MeasurementType.getDefaultInstance() : vehicleHeight_;
      }
    }
    /**
     * <pre>
     * object containing information on vehicle height, its_event_code ALTIMETE
     * </pre>
     *
     * <code>.fmsitsinterface.MeasurementType vehicle_height = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder> 
        getVehicleHeightFieldBuilder() {
      if (vehicleHeightBuilder_ == null) {
        vehicleHeightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            fmsitsinterface.MeasurementType, fmsitsinterface.MeasurementType.Builder, fmsitsinterface.MeasurementTypeOrBuilder>(
                getVehicleHeight(),
                getParentForChildren(),
                isClean());
        vehicleHeight_ = null;
      }
      return vehicleHeightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:fmsitsinterface.SensorInfo)
  }

  // @@protoc_insertion_point(class_scope:fmsitsinterface.SensorInfo)
  private static final fmsitsinterface.SensorInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fmsitsinterface.SensorInfo();
  }

  public static fmsitsinterface.SensorInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SensorInfo>
      PARSER = new com.google.protobuf.AbstractParser<SensorInfo>() {
    @java.lang.Override
    public SensorInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<SensorInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SensorInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fmsitsinterface.SensorInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
