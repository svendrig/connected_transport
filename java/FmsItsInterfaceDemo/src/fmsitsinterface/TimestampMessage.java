// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

/**
 * Protobuf type {@code fmsitsinterface.TimestampMessage}
 */
public final class TimestampMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:fmsitsinterface.TimestampMessage)
    TimestampMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimestampMessage.newBuilder() to construct.
  private TimestampMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimestampMessage() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimestampMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_TimestampMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_TimestampMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            fmsitsinterface.TimestampMessage.class, fmsitsinterface.TimestampMessage.Builder.class);
  }

  public static final int REQUEST_TRANSMISSION_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp requestTransmission_;
  /**
   * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
   * @return Whether the requestTransmission field is set.
   */
  @java.lang.Override
  public boolean hasRequestTransmission() {
    return requestTransmission_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
   * @return The requestTransmission.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getRequestTransmission() {
    return requestTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestTransmission_;
  }
  /**
   * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getRequestTransmissionOrBuilder() {
    return requestTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestTransmission_;
  }

  public static final int REQUEST_RECEPTION_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp requestReception_;
  /**
   * <code>.google.protobuf.Timestamp request_reception = 2;</code>
   * @return Whether the requestReception field is set.
   */
  @java.lang.Override
  public boolean hasRequestReception() {
    return requestReception_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp request_reception = 2;</code>
   * @return The requestReception.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getRequestReception() {
    return requestReception_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestReception_;
  }
  /**
   * <code>.google.protobuf.Timestamp request_reception = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getRequestReceptionOrBuilder() {
    return requestReception_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestReception_;
  }

  public static final int RESPONSE_TRANSMISSION_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp responseTransmission_;
  /**
   * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
   * @return Whether the responseTransmission field is set.
   */
  @java.lang.Override
  public boolean hasResponseTransmission() {
    return responseTransmission_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
   * @return The responseTransmission.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getResponseTransmission() {
    return responseTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : responseTransmission_;
  }
  /**
   * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getResponseTransmissionOrBuilder() {
    return responseTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : responseTransmission_;
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
    if (requestTransmission_ != null) {
      output.writeMessage(1, getRequestTransmission());
    }
    if (requestReception_ != null) {
      output.writeMessage(2, getRequestReception());
    }
    if (responseTransmission_ != null) {
      output.writeMessage(3, getResponseTransmission());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestTransmission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestTransmission());
    }
    if (requestReception_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRequestReception());
    }
    if (responseTransmission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResponseTransmission());
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
    if (!(obj instanceof fmsitsinterface.TimestampMessage)) {
      return super.equals(obj);
    }
    fmsitsinterface.TimestampMessage other = (fmsitsinterface.TimestampMessage) obj;

    if (hasRequestTransmission() != other.hasRequestTransmission()) return false;
    if (hasRequestTransmission()) {
      if (!getRequestTransmission()
          .equals(other.getRequestTransmission())) return false;
    }
    if (hasRequestReception() != other.hasRequestReception()) return false;
    if (hasRequestReception()) {
      if (!getRequestReception()
          .equals(other.getRequestReception())) return false;
    }
    if (hasResponseTransmission() != other.hasResponseTransmission()) return false;
    if (hasResponseTransmission()) {
      if (!getResponseTransmission()
          .equals(other.getResponseTransmission())) return false;
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
    if (hasRequestTransmission()) {
      hash = (37 * hash) + REQUEST_TRANSMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getRequestTransmission().hashCode();
    }
    if (hasRequestReception()) {
      hash = (37 * hash) + REQUEST_RECEPTION_FIELD_NUMBER;
      hash = (53 * hash) + getRequestReception().hashCode();
    }
    if (hasResponseTransmission()) {
      hash = (37 * hash) + RESPONSE_TRANSMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getResponseTransmission().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static fmsitsinterface.TimestampMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static fmsitsinterface.TimestampMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static fmsitsinterface.TimestampMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static fmsitsinterface.TimestampMessage parseFrom(
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
  public static Builder newBuilder(fmsitsinterface.TimestampMessage prototype) {
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
   * Protobuf type {@code fmsitsinterface.TimestampMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:fmsitsinterface.TimestampMessage)
      fmsitsinterface.TimestampMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_TimestampMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_TimestampMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fmsitsinterface.TimestampMessage.class, fmsitsinterface.TimestampMessage.Builder.class);
    }

    // Construct using fmsitsinterface.TimestampMessage.newBuilder()
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
      requestTransmission_ = null;
      if (requestTransmissionBuilder_ != null) {
        requestTransmissionBuilder_.dispose();
        requestTransmissionBuilder_ = null;
      }
      requestReception_ = null;
      if (requestReceptionBuilder_ != null) {
        requestReceptionBuilder_.dispose();
        requestReceptionBuilder_ = null;
      }
      responseTransmission_ = null;
      if (responseTransmissionBuilder_ != null) {
        responseTransmissionBuilder_.dispose();
        responseTransmissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return fmsitsinterface.FMSITSInterfaceSpecification.internal_static_fmsitsinterface_TimestampMessage_descriptor;
    }

    @java.lang.Override
    public fmsitsinterface.TimestampMessage getDefaultInstanceForType() {
      return fmsitsinterface.TimestampMessage.getDefaultInstance();
    }

    @java.lang.Override
    public fmsitsinterface.TimestampMessage build() {
      fmsitsinterface.TimestampMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public fmsitsinterface.TimestampMessage buildPartial() {
      fmsitsinterface.TimestampMessage result = new fmsitsinterface.TimestampMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(fmsitsinterface.TimestampMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestTransmission_ = requestTransmissionBuilder_ == null
            ? requestTransmission_
            : requestTransmissionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requestReception_ = requestReceptionBuilder_ == null
            ? requestReception_
            : requestReceptionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.responseTransmission_ = responseTransmissionBuilder_ == null
            ? responseTransmission_
            : responseTransmissionBuilder_.build();
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
      if (other instanceof fmsitsinterface.TimestampMessage) {
        return mergeFrom((fmsitsinterface.TimestampMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(fmsitsinterface.TimestampMessage other) {
      if (other == fmsitsinterface.TimestampMessage.getDefaultInstance()) return this;
      if (other.hasRequestTransmission()) {
        mergeRequestTransmission(other.getRequestTransmission());
      }
      if (other.hasRequestReception()) {
        mergeRequestReception(other.getRequestReception());
      }
      if (other.hasResponseTransmission()) {
        mergeResponseTransmission(other.getResponseTransmission());
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
                  getRequestTransmissionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRequestReceptionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResponseTransmissionFieldBuilder().getBuilder(),
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

    private com.google.protobuf.Timestamp requestTransmission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> requestTransmissionBuilder_;
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     * @return Whether the requestTransmission field is set.
     */
    public boolean hasRequestTransmission() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     * @return The requestTransmission.
     */
    public com.google.protobuf.Timestamp getRequestTransmission() {
      if (requestTransmissionBuilder_ == null) {
        return requestTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestTransmission_;
      } else {
        return requestTransmissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public Builder setRequestTransmission(com.google.protobuf.Timestamp value) {
      if (requestTransmissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestTransmission_ = value;
      } else {
        requestTransmissionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public Builder setRequestTransmission(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (requestTransmissionBuilder_ == null) {
        requestTransmission_ = builderForValue.build();
      } else {
        requestTransmissionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public Builder mergeRequestTransmission(com.google.protobuf.Timestamp value) {
      if (requestTransmissionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          requestTransmission_ != null &&
          requestTransmission_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getRequestTransmissionBuilder().mergeFrom(value);
        } else {
          requestTransmission_ = value;
        }
      } else {
        requestTransmissionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public Builder clearRequestTransmission() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestTransmission_ = null;
      if (requestTransmissionBuilder_ != null) {
        requestTransmissionBuilder_.dispose();
        requestTransmissionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getRequestTransmissionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestTransmissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getRequestTransmissionOrBuilder() {
      if (requestTransmissionBuilder_ != null) {
        return requestTransmissionBuilder_.getMessageOrBuilder();
      } else {
        return requestTransmission_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : requestTransmission_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp request_transmission = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getRequestTransmissionFieldBuilder() {
      if (requestTransmissionBuilder_ == null) {
        requestTransmissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getRequestTransmission(),
                getParentForChildren(),
                isClean());
        requestTransmission_ = null;
      }
      return requestTransmissionBuilder_;
    }

    private com.google.protobuf.Timestamp requestReception_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> requestReceptionBuilder_;
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     * @return Whether the requestReception field is set.
     */
    public boolean hasRequestReception() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     * @return The requestReception.
     */
    public com.google.protobuf.Timestamp getRequestReception() {
      if (requestReceptionBuilder_ == null) {
        return requestReception_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : requestReception_;
      } else {
        return requestReceptionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public Builder setRequestReception(com.google.protobuf.Timestamp value) {
      if (requestReceptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestReception_ = value;
      } else {
        requestReceptionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public Builder setRequestReception(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (requestReceptionBuilder_ == null) {
        requestReception_ = builderForValue.build();
      } else {
        requestReceptionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public Builder mergeRequestReception(com.google.protobuf.Timestamp value) {
      if (requestReceptionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          requestReception_ != null &&
          requestReception_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getRequestReceptionBuilder().mergeFrom(value);
        } else {
          requestReception_ = value;
        }
      } else {
        requestReceptionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public Builder clearRequestReception() {
      bitField0_ = (bitField0_ & ~0x00000002);
      requestReception_ = null;
      if (requestReceptionBuilder_ != null) {
        requestReceptionBuilder_.dispose();
        requestReceptionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getRequestReceptionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRequestReceptionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getRequestReceptionOrBuilder() {
      if (requestReceptionBuilder_ != null) {
        return requestReceptionBuilder_.getMessageOrBuilder();
      } else {
        return requestReception_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : requestReception_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp request_reception = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getRequestReceptionFieldBuilder() {
      if (requestReceptionBuilder_ == null) {
        requestReceptionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getRequestReception(),
                getParentForChildren(),
                isClean());
        requestReception_ = null;
      }
      return requestReceptionBuilder_;
    }

    private com.google.protobuf.Timestamp responseTransmission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> responseTransmissionBuilder_;
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     * @return Whether the responseTransmission field is set.
     */
    public boolean hasResponseTransmission() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     * @return The responseTransmission.
     */
    public com.google.protobuf.Timestamp getResponseTransmission() {
      if (responseTransmissionBuilder_ == null) {
        return responseTransmission_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : responseTransmission_;
      } else {
        return responseTransmissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public Builder setResponseTransmission(com.google.protobuf.Timestamp value) {
      if (responseTransmissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        responseTransmission_ = value;
      } else {
        responseTransmissionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public Builder setResponseTransmission(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (responseTransmissionBuilder_ == null) {
        responseTransmission_ = builderForValue.build();
      } else {
        responseTransmissionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public Builder mergeResponseTransmission(com.google.protobuf.Timestamp value) {
      if (responseTransmissionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          responseTransmission_ != null &&
          responseTransmission_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getResponseTransmissionBuilder().mergeFrom(value);
        } else {
          responseTransmission_ = value;
        }
      } else {
        responseTransmissionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public Builder clearResponseTransmission() {
      bitField0_ = (bitField0_ & ~0x00000004);
      responseTransmission_ = null;
      if (responseTransmissionBuilder_ != null) {
        responseTransmissionBuilder_.dispose();
        responseTransmissionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getResponseTransmissionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResponseTransmissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getResponseTransmissionOrBuilder() {
      if (responseTransmissionBuilder_ != null) {
        return responseTransmissionBuilder_.getMessageOrBuilder();
      } else {
        return responseTransmission_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : responseTransmission_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp response_transmission = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getResponseTransmissionFieldBuilder() {
      if (responseTransmissionBuilder_ == null) {
        responseTransmissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getResponseTransmission(),
                getParentForChildren(),
                isClean());
        responseTransmission_ = null;
      }
      return responseTransmissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:fmsitsinterface.TimestampMessage)
  }

  // @@protoc_insertion_point(class_scope:fmsitsinterface.TimestampMessage)
  private static final fmsitsinterface.TimestampMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new fmsitsinterface.TimestampMessage();
  }

  public static fmsitsinterface.TimestampMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimestampMessage>
      PARSER = new com.google.protobuf.AbstractParser<TimestampMessage>() {
    @java.lang.Override
    public TimestampMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimestampMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimestampMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public fmsitsinterface.TimestampMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

