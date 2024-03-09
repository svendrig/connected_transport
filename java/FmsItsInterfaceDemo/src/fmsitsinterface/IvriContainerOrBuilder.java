// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

public interface IvriContainerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:fmsitsinterface.IvriContainer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * object containing feedback on priority request, its_event_code PRIORITY
   * </pre>
   *
   * <code>.fmsitsinterface.PriorityContainer priority_container = 1;</code>
   * @return Whether the priorityContainer field is set.
   */
  boolean hasPriorityContainer();
  /**
   * <pre>
   * object containing feedback on priority request, its_event_code PRIORITY
   * </pre>
   *
   * <code>.fmsitsinterface.PriorityContainer priority_container = 1;</code>
   * @return The priorityContainer.
   */
  fmsitsinterface.PriorityContainer getPriorityContainer();
  /**
   * <pre>
   * object containing feedback on priority request, its_event_code PRIORITY
   * </pre>
   *
   * <code>.fmsitsinterface.PriorityContainer priority_container = 1;</code>
   */
  fmsitsinterface.PriorityContainerOrBuilder getPriorityContainerOrBuilder();

  /**
   * <pre>
   * object containing information on traffic light states, its_event_code TRAFFIC_LIGHT_STATUS
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightStateInformation traffic_light_state_information = 2;</code>
   * @return Whether the trafficLightStateInformation field is set.
   */
  boolean hasTrafficLightStateInformation();
  /**
   * <pre>
   * object containing information on traffic light states, its_event_code TRAFFIC_LIGHT_STATUS
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightStateInformation traffic_light_state_information = 2;</code>
   * @return The trafficLightStateInformation.
   */
  fmsitsinterface.TrafficLightStateInformation getTrafficLightStateInformation();
  /**
   * <pre>
   * object containing information on traffic light states, its_event_code TRAFFIC_LIGHT_STATUS
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightStateInformation traffic_light_state_information = 2;</code>
   */
  fmsitsinterface.TrafficLightStateInformationOrBuilder getTrafficLightStateInformationOrBuilder();

  /**
   * <pre>
   * object containing information on when traffic light state changes are expected, its_event_code TRAFFIC_LIGHT_TIMING
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightTimingInformation traffic_light_timing_information = 3;</code>
   * @return Whether the trafficLightTimingInformation field is set.
   */
  boolean hasTrafficLightTimingInformation();
  /**
   * <pre>
   * object containing information on when traffic light state changes are expected, its_event_code TRAFFIC_LIGHT_TIMING
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightTimingInformation traffic_light_timing_information = 3;</code>
   * @return The trafficLightTimingInformation.
   */
  fmsitsinterface.TrafficLightTimingInformation getTrafficLightTimingInformation();
  /**
   * <pre>
   * object containing information on when traffic light state changes are expected, its_event_code TRAFFIC_LIGHT_TIMING
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightTimingInformation traffic_light_timing_information = 3;</code>
   */
  fmsitsinterface.TrafficLightTimingInformationOrBuilder getTrafficLightTimingInformationOrBuilder();

  /**
   * <pre>
   * object containing information on optimal speed to intersection, its_event_code ADVISORY_SPEED
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightSpeedAdvice traffic_light_speed_advice = 4;</code>
   * @return Whether the trafficLightSpeedAdvice field is set.
   */
  boolean hasTrafficLightSpeedAdvice();
  /**
   * <pre>
   * object containing information on optimal speed to intersection, its_event_code ADVISORY_SPEED
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightSpeedAdvice traffic_light_speed_advice = 4;</code>
   * @return The trafficLightSpeedAdvice.
   */
  fmsitsinterface.TrafficLightSpeedAdvice getTrafficLightSpeedAdvice();
  /**
   * <pre>
   * object containing information on optimal speed to intersection, its_event_code ADVISORY_SPEED
   * </pre>
   *
   * <code>.fmsitsinterface.TrafficLightSpeedAdvice traffic_light_speed_advice = 4;</code>
   */
  fmsitsinterface.TrafficLightSpeedAdviceOrBuilder getTrafficLightSpeedAdviceOrBuilder();
}
