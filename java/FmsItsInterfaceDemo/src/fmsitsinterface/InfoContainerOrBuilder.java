// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface InfoContainerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.InfoContainer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The CSP that created the message.
   * </pre>
   *
   * <code>string author = 1;</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <pre>
   * The CSP that created the message.
   * </pre>
   *
   * <code>string author = 1;</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <pre>
   * Unique ID generated by the CSP. Be careful that the eventID is not guaranteed to be unique across different CSPs, but has to be unique within the set of events of a single CSP.
   * </pre>
   *
   * <code>string event_id = 2;</code>
   * @return The eventId.
   */
  java.lang.String getEventId();
  /**
   * <pre>
   * Unique ID generated by the CSP. Be careful that the eventID is not guaranteed to be unique across different CSPs, but has to be unique within the set of events of a single CSP.
   * </pre>
   *
   * <code>string event_id = 2;</code>
   * @return The bytes for eventId.
   */
  com.google.protobuf.ByteString
      getEventIdBytes();

  /**
   * <pre>
   * messageType indicates the status of the message
   * </pre>
   *
   * <code>.fmsitsinterface.InfoContainer.MessageType message_type = 3;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <pre>
   * messageType indicates the status of the message
   * </pre>
   *
   * <code>.fmsitsinterface.InfoContainer.MessageType message_type = 3;</code>
   * @return The messageType.
   */
  fmsitsinterface.InfoContainer.MessageType getMessageType();

  /**
   * <pre>
   * eventVersion indicates the version of the message with a unique eventId.
   * </pre>
   *
   * <code>int32 event_version = 4;</code>
   * @return The eventVersion.
   */
  int getEventVersion();

  /**
   * <pre>
   * time of sending of the message (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 5;</code>
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   * <pre>
   * time of sending of the message (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 5;</code>
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   * <pre>
   * time of sending of the message (UTC+00:00).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   * <pre>
   * the requested interval sampling rate of GPS samples in order to facilitate a usecase. Unit of value is second. If filled in, location container has to contain a polygon where the higher frequency is required
   * </pre>
   *
   * <code>int32 desired_interval = 6;</code>
   * @return The desiredInterval.
   */
  int getDesiredInterval();
}
