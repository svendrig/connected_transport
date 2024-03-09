// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FMS_ITS_Interface_Specification.proto

package fmsitsinterface;

/**
 * Protobuf enum {@code fmsitsinterface.ItsEventCode}
 */
public enum ItsEventCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Category 0    Special messages
   * </pre>
   *
   * <code>UNKNOWN_ITS_EVENT_CODE = 0;</code>
   */
  UNKNOWN_ITS_EVENT_CODE(0),
  /**
   * <pre>
   * Frequency requested to change to X Hz
   * </pre>
   *
   * <code>CHANGED_FREQUENCY_REQUEST = 1;</code>
   */
  CHANGED_FREQUENCY_REQUEST(1),
  /**
   * <pre>
   * Category 1    Signaling and speed advice
   * </pre>
   *
   * <code>MAXIMUM_SPEED = 101;</code>
   */
  MAXIMUM_SPEED(101),
  /**
   * <pre>
   * Advised speed of x km/h
   * </pre>
   *
   * <code>ADVISORY_SPEED_LIMIT = 102;</code>
   */
  ADVISORY_SPEED_LIMIT(102),
  /**
   * <pre>
   * Overtaking prohibited
   * </pre>
   *
   * <code>OVERTAKING_BAN = 103;</code>
   */
  OVERTAKING_BAN(103),
  /**
   * <pre>
   * Lane configuration changed
   * </pre>
   *
   * <code>LANE_CONFIGURATION = 104;</code>
   */
  LANE_CONFIGURATION(104),
  /**
   * <pre>
   * Category 2    Information about dangerous situations
   * </pre>
   *
   * <code>ROAD_WORKS = 201;</code>
   */
  ROAD_WORKS(201),
  /**
   * <pre>
   * Event ahead
   * </pre>
   *
   * <code>EVENTS = 202;</code>
   */
  EVENTS(202),
  /**
   * <pre>
   * Rail Level crossings, Placeholder
   * </pre>
   *
   * <code>PLACEHOLDER = 203;</code>
   */
  PLACEHOLDER(203),
  /**
   * <pre>
   * Start of traffic jam, Traffic jam ahead
   * </pre>
   *
   * <code>TRAFFIC_JAM = 204;</code>
   */
  TRAFFIC_JAM(204),
  /**
   * <pre>
   * Stationary vehicle ahead
   * </pre>
   *
   * <code>STATIONARY_VEHICLE = 205;</code>
   */
  STATIONARY_VEHICLE(205),
  /**
   * <pre>
   * Incident ahead
   * </pre>
   *
   * <code>INCIDENT = 206;</code>
   */
  INCIDENT(206),
  /**
   * <pre>
   * Bad weather conditions ahead
   * </pre>
   *
   * <code>WEATHER_CONDITIONS = 207;</code>
   */
  WEATHER_CONDITIONS(207),
  /**
   * <pre>
   * Objects/cargo on the road
   * </pre>
   *
   * <code>OBJECTS_ON_ROAD = 208;</code>
   */
  OBJECTS_ON_ROAD(208),
  /**
   * <pre>
   * Approaching emergency services (early warning)
   * </pre>
   *
   * <code>EMERGENCY_VEHICLE_APPROACHING = 209;</code>
   */
  EMERGENCY_VEHICLE_APPROACHING(209),
  /**
   * <pre>
   * Road inspector on the road
   * </pre>
   *
   * <code>ROAD_INSPECTOR = 210;</code>
   */
  ROAD_INSPECTOR(210),
  /**
   * <pre>
   * Open bridge ahead
   * </pre>
   *
   * <code>BRIDGE_OPENING = 211;</code>
   */
  BRIDGE_OPENING(211),
  /**
   * <pre>
   * Ghost driver approaching
   * </pre>
   *
   * <code>GHOST_DRIVER_WARNING = 212;</code>
   */
  GHOST_DRIVER_WARNING(212),
  /**
   * <pre>
   * Category 3    Priority with iVRI
   * </pre>
   *
   * <code>PRIORITY = 301;</code>
   */
  PRIORITY(301),
  /**
   * <pre>
   * Selective access systems (bollards, etc.), placeholder
   * </pre>
   *
   * <code>SELECTIVE_ACCESS = 302;</code>
   */
  SELECTIVE_ACCESS(302),
  /**
   * <pre>
   * Category 4    Current information iVRI
   * </pre>
   *
   * <code>TRAFFIC_LIGHT_STATUS = 401;</code>
   */
  TRAFFIC_LIGHT_STATUS(401),
  /**
   * <pre>
   * Time to green and time to red, traffic light timing update
   * </pre>
   *
   * <code>TRAFFIC_LIGHT_TIMING = 402;</code>
   */
  TRAFFIC_LIGHT_TIMING(402),
  /**
   * <pre>
   * Traffic light optimal speed advice
   * </pre>
   *
   * <code>ADVISORY_SPEED = 403;</code>
   */
  ADVISORY_SPEED(403),
  /**
   * <pre>
   * Rail Level crossing time to open, placeholder
   * </pre>
   *
   * <code>RAIL_CROSSING_STATUS = 404;</code>
   */
  RAIL_CROSSING_STATUS(404),
  /**
   * <pre>
   * Category 5    Sensor data
   * </pre>
   *
   * <code>TIRE_PRESSURE_GAUGE = 501;</code>
   */
  TIRE_PRESSURE_GAUGE(501),
  /**
   * <pre>
   * Vehicle height information
   * </pre>
   *
   * <code>ALTIMETER = 502;</code>
   */
  ALTIMETER(502),
  /**
   * <pre>
   * Vehicle weight information
   * </pre>
   *
   * <code>WEIGHT = 503;</code>
   */
  WEIGHT(503),
  /**
   * <pre>
   * Parking + loading/unloading area (occupation), placeholder
   * </pre>
   *
   * <code>PARKING_OCCUPATION = 504;</code>
   */
  PARKING_OCCUPATION(504),
  /**
   * <pre>
   * Parking + loading/unloading area (reservation), placeholder
   * </pre>
   *
   * <code>PARKING_RESERVATION = 505;</code>
   */
  PARKING_RESERVATION(505),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Category 0    Special messages
   * </pre>
   *
   * <code>UNKNOWN_ITS_EVENT_CODE = 0;</code>
   */
  public static final int UNKNOWN_ITS_EVENT_CODE_VALUE = 0;
  /**
   * <pre>
   * Frequency requested to change to X Hz
   * </pre>
   *
   * <code>CHANGED_FREQUENCY_REQUEST = 1;</code>
   */
  public static final int CHANGED_FREQUENCY_REQUEST_VALUE = 1;
  /**
   * <pre>
   * Category 1    Signaling and speed advice
   * </pre>
   *
   * <code>MAXIMUM_SPEED = 101;</code>
   */
  public static final int MAXIMUM_SPEED_VALUE = 101;
  /**
   * <pre>
   * Advised speed of x km/h
   * </pre>
   *
   * <code>ADVISORY_SPEED_LIMIT = 102;</code>
   */
  public static final int ADVISORY_SPEED_LIMIT_VALUE = 102;
  /**
   * <pre>
   * Overtaking prohibited
   * </pre>
   *
   * <code>OVERTAKING_BAN = 103;</code>
   */
  public static final int OVERTAKING_BAN_VALUE = 103;
  /**
   * <pre>
   * Lane configuration changed
   * </pre>
   *
   * <code>LANE_CONFIGURATION = 104;</code>
   */
  public static final int LANE_CONFIGURATION_VALUE = 104;
  /**
   * <pre>
   * Category 2    Information about dangerous situations
   * </pre>
   *
   * <code>ROAD_WORKS = 201;</code>
   */
  public static final int ROAD_WORKS_VALUE = 201;
  /**
   * <pre>
   * Event ahead
   * </pre>
   *
   * <code>EVENTS = 202;</code>
   */
  public static final int EVENTS_VALUE = 202;
  /**
   * <pre>
   * Rail Level crossings, Placeholder
   * </pre>
   *
   * <code>PLACEHOLDER = 203;</code>
   */
  public static final int PLACEHOLDER_VALUE = 203;
  /**
   * <pre>
   * Start of traffic jam, Traffic jam ahead
   * </pre>
   *
   * <code>TRAFFIC_JAM = 204;</code>
   */
  public static final int TRAFFIC_JAM_VALUE = 204;
  /**
   * <pre>
   * Stationary vehicle ahead
   * </pre>
   *
   * <code>STATIONARY_VEHICLE = 205;</code>
   */
  public static final int STATIONARY_VEHICLE_VALUE = 205;
  /**
   * <pre>
   * Incident ahead
   * </pre>
   *
   * <code>INCIDENT = 206;</code>
   */
  public static final int INCIDENT_VALUE = 206;
  /**
   * <pre>
   * Bad weather conditions ahead
   * </pre>
   *
   * <code>WEATHER_CONDITIONS = 207;</code>
   */
  public static final int WEATHER_CONDITIONS_VALUE = 207;
  /**
   * <pre>
   * Objects/cargo on the road
   * </pre>
   *
   * <code>OBJECTS_ON_ROAD = 208;</code>
   */
  public static final int OBJECTS_ON_ROAD_VALUE = 208;
  /**
   * <pre>
   * Approaching emergency services (early warning)
   * </pre>
   *
   * <code>EMERGENCY_VEHICLE_APPROACHING = 209;</code>
   */
  public static final int EMERGENCY_VEHICLE_APPROACHING_VALUE = 209;
  /**
   * <pre>
   * Road inspector on the road
   * </pre>
   *
   * <code>ROAD_INSPECTOR = 210;</code>
   */
  public static final int ROAD_INSPECTOR_VALUE = 210;
  /**
   * <pre>
   * Open bridge ahead
   * </pre>
   *
   * <code>BRIDGE_OPENING = 211;</code>
   */
  public static final int BRIDGE_OPENING_VALUE = 211;
  /**
   * <pre>
   * Ghost driver approaching
   * </pre>
   *
   * <code>GHOST_DRIVER_WARNING = 212;</code>
   */
  public static final int GHOST_DRIVER_WARNING_VALUE = 212;
  /**
   * <pre>
   * Category 3    Priority with iVRI
   * </pre>
   *
   * <code>PRIORITY = 301;</code>
   */
  public static final int PRIORITY_VALUE = 301;
  /**
   * <pre>
   * Selective access systems (bollards, etc.), placeholder
   * </pre>
   *
   * <code>SELECTIVE_ACCESS = 302;</code>
   */
  public static final int SELECTIVE_ACCESS_VALUE = 302;
  /**
   * <pre>
   * Category 4    Current information iVRI
   * </pre>
   *
   * <code>TRAFFIC_LIGHT_STATUS = 401;</code>
   */
  public static final int TRAFFIC_LIGHT_STATUS_VALUE = 401;
  /**
   * <pre>
   * Time to green and time to red, traffic light timing update
   * </pre>
   *
   * <code>TRAFFIC_LIGHT_TIMING = 402;</code>
   */
  public static final int TRAFFIC_LIGHT_TIMING_VALUE = 402;
  /**
   * <pre>
   * Traffic light optimal speed advice
   * </pre>
   *
   * <code>ADVISORY_SPEED = 403;</code>
   */
  public static final int ADVISORY_SPEED_VALUE = 403;
  /**
   * <pre>
   * Rail Level crossing time to open, placeholder
   * </pre>
   *
   * <code>RAIL_CROSSING_STATUS = 404;</code>
   */
  public static final int RAIL_CROSSING_STATUS_VALUE = 404;
  /**
   * <pre>
   * Category 5    Sensor data
   * </pre>
   *
   * <code>TIRE_PRESSURE_GAUGE = 501;</code>
   */
  public static final int TIRE_PRESSURE_GAUGE_VALUE = 501;
  /**
   * <pre>
   * Vehicle height information
   * </pre>
   *
   * <code>ALTIMETER = 502;</code>
   */
  public static final int ALTIMETER_VALUE = 502;
  /**
   * <pre>
   * Vehicle weight information
   * </pre>
   *
   * <code>WEIGHT = 503;</code>
   */
  public static final int WEIGHT_VALUE = 503;
  /**
   * <pre>
   * Parking + loading/unloading area (occupation), placeholder
   * </pre>
   *
   * <code>PARKING_OCCUPATION = 504;</code>
   */
  public static final int PARKING_OCCUPATION_VALUE = 504;
  /**
   * <pre>
   * Parking + loading/unloading area (reservation), placeholder
   * </pre>
   *
   * <code>PARKING_RESERVATION = 505;</code>
   */
  public static final int PARKING_RESERVATION_VALUE = 505;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ItsEventCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ItsEventCode forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_ITS_EVENT_CODE;
      case 1: return CHANGED_FREQUENCY_REQUEST;
      case 101: return MAXIMUM_SPEED;
      case 102: return ADVISORY_SPEED_LIMIT;
      case 103: return OVERTAKING_BAN;
      case 104: return LANE_CONFIGURATION;
      case 201: return ROAD_WORKS;
      case 202: return EVENTS;
      case 203: return PLACEHOLDER;
      case 204: return TRAFFIC_JAM;
      case 205: return STATIONARY_VEHICLE;
      case 206: return INCIDENT;
      case 207: return WEATHER_CONDITIONS;
      case 208: return OBJECTS_ON_ROAD;
      case 209: return EMERGENCY_VEHICLE_APPROACHING;
      case 210: return ROAD_INSPECTOR;
      case 211: return BRIDGE_OPENING;
      case 212: return GHOST_DRIVER_WARNING;
      case 301: return PRIORITY;
      case 302: return SELECTIVE_ACCESS;
      case 401: return TRAFFIC_LIGHT_STATUS;
      case 402: return TRAFFIC_LIGHT_TIMING;
      case 403: return ADVISORY_SPEED;
      case 404: return RAIL_CROSSING_STATUS;
      case 501: return TIRE_PRESSURE_GAUGE;
      case 502: return ALTIMETER;
      case 503: return WEIGHT;
      case 504: return PARKING_OCCUPATION;
      case 505: return PARKING_RESERVATION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ItsEventCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ItsEventCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ItsEventCode>() {
          public ItsEventCode findValueByNumber(int number) {
            return ItsEventCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return fmsitsinterface.FMSITSInterfaceSpecification.getDescriptor().getEnumTypes().get(3);
  }

  private static final ItsEventCode[] VALUES = values();

  public static ItsEventCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ItsEventCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:fmsitsinterface.ItsEventCode)
}
