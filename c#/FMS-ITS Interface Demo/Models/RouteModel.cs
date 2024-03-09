namespace FMS_ITS_Interface_Demo.Models
{
    public class RouteModel
    {
        public class Route
        {
            public string id { get; set; }
            public string name { get; set; }
            public string creationDate { get; set; }
            public Actor[] actors { get; set; }
            public Georeference geoReferences { get; set; }
        }

        public class Georeference
        {
            public Point[] points { get; set; }
            public string type { get; set; }
        }

        public class Actor
        {
            public string associationType { get; set; }
            public string uuid { get; set; }
            public string entityType { get; set; }
        }


        public class Point
        {
            public float lat { get; set; }
            public float lon { get; set; }
        }
    }
}