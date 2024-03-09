namespace FMS_ITS_Interface_Demo.Models
{
    public class VehicleModel
    {
        public class Vehicle
        {
            public string id { get; set; }
            public string name { get; set; }
            public string vehicleType { get; set; }
            public ExternalAttributes externalAttributes { get; set; }
            public string fuel { get; set; }
            public Length length { get; set; }
            public Height height { get; set; }
            public Width width { get; set; }
            public string licensePlate { get; set; }
            public Emptyweight emptyWeight { get; set; }
        }

        public class ExternalAttributes
        {
            public string iVRIPriorityEnabled { get; set; }
            public string dynamicRate { get; set; }
        }

        public class Length
        {
            public object value { get; set; }
            public string unit { get; set; }
        }

        public class Height
        {
            public object value { get; set; }
            public string unit { get; set; }
        }

        public class Width
        {
            public object value { get; set; }
            public string unit { get; set; }
        }

        public class Emptyweight
        {
            public object value { get; set; }
            public string unit { get; set; }
        }
    }
}