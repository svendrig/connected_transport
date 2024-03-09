namespace FMS_ITS_Interface_Demo.Models
{
    public class ItsAccount
    {
        public string apiSecretName { get; set; }
        public string socketSecretName { get; set; }
        public string apiSecret { get; set; }
        public string apiMediaType { get; set; }
        public string socketSecret { get; set; }
        public string apiUrl { get; set; }
        public string wssUrl { get; set; }
    }
}