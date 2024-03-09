using FMS_ITS_Interface_Demo.Models;
using static FMS_ITS_Interface_Demo.Models.VehicleModel;
using System.Xml;

namespace FMS_ITS_Interface_Demo
{
    public class DemoValuesProvider
    {
        public static Vehicle demoVehicle()
        {
            Vehicle vehicle = new Vehicle();
            vehicle.id = Guid.NewGuid().ToString();
            vehicle.externalAttributes = new ExternalAttributes() { iVRIPriorityEnabled = "false" };
            vehicle.length = new Length() { unit = "m", value = 14.0 };
            vehicle.height = new Height() { unit = "m", value = 4.0 };
            vehicle.width = new Width() { unit = "m", value = 2.6 };
            vehicle.emptyWeight = new Emptyweight() { unit = "kg", value = 12000.0 };

            XmlDocument xDoc = new XmlDocument();

            //load up the xml from the location 
            xDoc.Load("/demo/config/demo_vehicle.xml");
            foreach (XmlNode node in xDoc.DocumentElement.ChildNodes)
            {
                // first node is the url ... have to go to nexted loc node 
                foreach (XmlNode locNode in node)
                {
                    // thereare a couple child nodes here so only take data from node named loc 
                    if (locNode.Name == "name")
                    {
                        vehicle.name = locNode.InnerText;
                    }
                    if (locNode.Name == "licenseplate")
                    {
                        vehicle.licensePlate = locNode.InnerText;
                    }
                    if (locNode.Name == "vehicletype")
                    {
                        vehicle.vehicleType = locNode.InnerText;
                    }
                    if (locNode.Name == "fuel")
                    {
                        vehicle.fuel = locNode.InnerText;
                    }
                }
            }
            return vehicle;
        }


        public static ItsAccount demoITSAccount()
        {
            ItsAccount account = new ItsAccount();

            XmlDocument xDoc = new XmlDocument();
            //load up the xml from the location 
            xDoc.Load("/demo/config/demo_settings.xml");
            foreach (XmlNode node in xDoc.DocumentElement.ChildNodes)
            {
                if (node.Name == "rest")
                {
                    // first node is the url ... have to go to nexted loc node 
                    foreach (XmlNode locNode in node)
                    {
                        // thereare a couple child nodes here so only take data from node named loc 
                        if (locNode.Name == "name")
                        {
                            account.apiSecretName = locNode.InnerText;
                        }
                        if (locNode.Name == "secret")
                        {
                            account.apiSecret = locNode.InnerText;
                        }
                        if (locNode.Name == "type")
                        {
                            account.apiMediaType = locNode.InnerText;
                        }
                        if (locNode.Name == "endpoint")
                        {
                            account.apiUrl = locNode.InnerText;
                        }
                    }
                }
                if (node.Name == "ws")
                {
                    // first node is the url ... have to go to nexted loc node 
                    foreach (XmlNode locNode in node)
                    {
                        // thereare a couple child nodes here so only take data from node named loc 
                        if (locNode.Name == "name")
                        {
                            account.socketSecretName = locNode.InnerText;
                        }
                        if (locNode.Name == "secret")
                        {
                            account.socketSecret = locNode.InnerText;
                        }
                        if (locNode.Name == "endpoint")
                        {
                            account.wssUrl = locNode.InnerText;
                        }
                    }
                }
            }
            return account;
        }
    }
}
