using System.Text.Json;
using System.Text;
using FMS_ITS_Interface_Demo.Models;
using static FMS_ITS_Interface_Demo.Models.VehicleModel;
using System.Net; // Required for rest calls
using System.Net.WebSockets;
using System.Xml;
using Google.Protobuf;
using Google.Protobuf.WellKnownTypes; // required for timestamp message

namespace FMS_ITS_Interface_Demo
{
    class Demo
    {
        private Vehicle vehicle;
        private ItsAccount itsAccount;
        private ClientWebSocket webSocket;
        private CancellationTokenSource cts = new CancellationTokenSource();

        public Demo()
        {
            vehicle = DemoValuesProvider.demoVehicle();
            Console.WriteLine(JsonSerializer.Serialize(vehicle));
            itsAccount = DemoValuesProvider.demoITSAccount();

            /* When onboarding is successfull */
            if (onboard())
            {
                /* Start websocket interface */
                initWebSocket().ConfigureAwait(false);

                /* Send some location updates, to initiate incoming messages */
                demoLocationUpdates();
            }
        }

        private bool onboard()
        {
            if (putOnBoardMessage(JsonSerializer.Serialize(vehicle), vehicle.licensePlate))
            {
                Console.WriteLine("Onboarding was succesfull");
                return true;
            }
            return false;
        }

        private bool putOnBoardMessage(string vehicleJson, string vehLicense)
        {
            bool result = false;
            Console.WriteLine("Vehicle {0} boarding", vehLicense);

            var data = Encoding.ASCII.GetBytes(vehicleJson);
            WebRequest myReq = RestCall.getRequest(itsAccount, data, "vehicles");

            using (var stream = myReq.GetRequestStream())
            {
                stream.Write(data, 0, data.Length);
            }

            try
            {
                using (var response = (HttpWebResponse)myReq.GetResponse())
                {
                    result = response.StatusCode == HttpStatusCode.OK;
                }

                if (result)
                {
                    Console.WriteLine("Vehicle {0} succesfully boarded, priority state: {1}", vehLicense, vehicle.externalAttributes.iVRIPriorityEnabled.Equals("true") ? "enabled" : "disabled");
                    return true;
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            return false;
        }

        private async Task initWebSocket()
        {
            webSocket = new ClientWebSocket();

            await webSocket.ConnectAsync(new Uri(string.Concat(itsAccount.wssUrl, "?", itsAccount.socketSecretName, "=", itsAccount.socketSecret)), cts.Token);

            await Task.Factory.StartNew(
                                  

            async () =>
               {
               var rcvBytes = new byte[4096 * 20];
               var rcvBuffer = new ArraySegment<byte>(rcvBytes);
                   while (true)
                   {
                       WebSocketReceiveResult rcvResult = await webSocket.ReceiveAsync(rcvBuffer, cts.Token);
                       if (rcvResult.MessageType == WebSocketMessageType.Close)
                       {
                           Console.WriteLine("Client {0} Smartsocket disconnected!", vehicle.licensePlate);
                           return false;
                       }
                       else
                       {
                           byte[] msgBytes = rcvBuffer.Skip(rcvBuffer.Offset).Take(rcvResult.Count).ToArray();
                           var incomingMessage = receiveMessage(msgBytes);
                           
                           /* when received message was request for timesync, directy respond */
                           if (incomingMessage.MessageType.ToString() == "TimestampMessage")
                           {
                               var outgoingMessage = timestampMessage(incomingMessage);
                               sendMessage(outgoingMessage);

                           }
                       }
                    }
               },
               cts.Token, 
               TaskCreationOptions.LongRunning, 
               TaskScheduler.Default);
        }


        private Fmsitsinterface.FmsItsMessage timestampMessage(Fmsitsinterface.FmsItsMessage incomingMessage)
        {
            var Message = new Fmsitsinterface.FmsItsMessage();
            Message.MessageType = Fmsitsinterface.MessageType.TimestampMessage;
            Message.VehicleId = vehicle.id;

            Message.Container = new Fmsitsinterface.FmsItsContainer();
            Message.Container.TimestampMessage = new Fmsitsinterface.TimestampMessage();

            var ts = DateTimeOffset.Now.ToUnixTimeSeconds();
            var unixTimestamp = Timestamp.FromDateTime(DateTime.UtcNow);
            Message.Container.TimestampMessage.RequestTransmission = incomingMessage.Container.TimestampMessage.RequestTransmission;
            Message.Container.TimestampMessage.RequestReception = unixTimestamp;
            Message.Container.TimestampMessage.ResponseTransmission = unixTimestamp;
            return Message;
        }


        protected Fmsitsinterface.FmsItsMessage locationUpdateMessage(int speed, int heading, double latitude, double longitude, int gpsquality)
        {
            var Message = new Fmsitsinterface.FmsItsMessage();
            Message.MessageType = Fmsitsinterface.MessageType.LocationUpdate;
            Message.VehicleId = vehicle.id;

            Message.Container = new Fmsitsinterface.FmsItsContainer();
            Message.Container.LocationUpdate = new Fmsitsinterface.LocationUpdateEvent();
            Message.Container.LocationUpdate.CreationDate = Timestamp.FromDateTime(DateTime.UtcNow);
            Message.Container.LocationUpdate.GpsQuality = gpsquality;

            Message.Container.LocationUpdate.GeoReference = new Fmsitsinterface.LocationUpdateEvent.Types.GeoReference();
            Message.Container.LocationUpdate.GeoReference.Lat = latitude;
            Message.Container.LocationUpdate.GeoReference.Lon = longitude;
            
            Message.Container.LocationUpdate.Speed = new Fmsitsinterface.MeasurementType();
            Message.Container.LocationUpdate.Speed.Value = speed;
            Message.Container.LocationUpdate.Speed.Unit = Fmsitsinterface.MeasurementUnit.KilometersPerHour;

            Message.Container.LocationUpdate.Heading = new Fmsitsinterface.MeasurementType();
            Message.Container.LocationUpdate.Heading.Value = heading;
            Message.Container.LocationUpdate.Heading.Unit = Fmsitsinterface.MeasurementUnit.Degrees;           
            return Message;
        }

        public async void demoLocationUpdates()
        {
            XmlDocument xDoc = new XmlDocument();

            //load up the xml from the location 
            xDoc.Load("/demo/config/demo_locations.xml");
            foreach (XmlNode node in xDoc.DocumentElement.ChildNodes)
            {

                if (node.Name == "location")
                {
                    DemoLocation location = new DemoLocation();

                    foreach (XmlNode locNode in node)
                    {
                        if (locNode.Name == "name")
                        {
                            location.speed = Int32.Parse(locNode.InnerText);
                        }
                        if (locNode.Name == "heading")
                        {
                            location.heading = Int32.Parse(locNode.InnerText);
                        }
                        if (locNode.Name == "latitude")
                        {
                            location.latitude = Double.Parse(locNode.InnerText);
                        }
                        if (locNode.Name == "longitude")
                        {
                            location.longitude = Double.Parse(locNode.InnerText);
                        }
                        if (locNode.Name == "gps_quality")
                        {
                            location.gps_quality = Int32.Parse(locNode.InnerText);
                        }
                    }
                     
                    await Task.Delay(2000);
                    var outgoingMessage = locationUpdateMessage(location.speed, location.heading, location.latitude, location.longitude, location.gps_quality);
                    sendMessage(outgoingMessage);
                    
                }
            }
        }

        private Fmsitsinterface.FmsItsMessage receiveMessage(byte[] msgBytes)
        {
            Fmsitsinterface.FmsItsMessage incomingMessage;

            incomingMessage = Fmsitsinterface.FmsItsMessage.Parser.ParseFrom(msgBytes);
            Console.WriteLine("Incoming:");
            //Console.WriteLine(incomingMessage.ToByteString().ToBase64());
            Console.WriteLine(incomingMessage.ToString());
                        
            return incomingMessage;
        }

        private bool sendMessage(Fmsitsinterface.FmsItsMessage outgoingMessage)
        {
            Console.WriteLine("Outgoing:");
            Console.WriteLine(outgoingMessage.ToString());
            var sendBuffer = new ArraySegment<Byte>(Encoding.UTF8.GetBytes(outgoingMessage.ToString()));
            webSocket.SendAsync(sendBuffer, WebSocketMessageType.Text, true, CancellationToken.None);
            return true;
        }
    }
}