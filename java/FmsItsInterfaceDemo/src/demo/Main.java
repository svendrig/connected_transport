package demo;

import java.net.*;
import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URISyntaxException;
//import java.net.HttpURLConnection;


//import java.net.ProtocolException;
//import java.net.URL;
//import java.nio.ByteBuffer;
//import java.nio.charset.StandardCharsets;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import dev.gustavoavila.websocketclient.WebSocketClient;
import com.google.protobuf.*;
import fmsitsinterface.*;

//import com.fasterxml.jackson.*;
//import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*; 

public class Main{
	
	private static WebSocketClient webSocketClient;
	private static ITSAccount ITSAccount;
	private static Vehicle Vehicle;

	public static void main(String[] args) {
	ITSAccount = DemoValuesProvider.demoITSAccount();
    Vehicle = DemoValuesProvider.demoVehicle();
    
	if (onboard())
    	{
		InitSocket();
    	}		
	}
	
	private static boolean onboard()
	{
		if (putOnBoardMessage(Vehicle))
	    {
			System.out.println("Onboarding was succesfull");
	        return true;
	    }
		return false;
	}

	private static boolean putOnBoardMessage(Vehicle Vehicle)
	{
		String json;
		try {
			ObjectMapper objectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
			json = objectMapper.writeValueAsString(Vehicle);
			//System.out.println("json "+json);
			
			URL url;
			url = new URL(ITSAccount.apiUrl+"vehicles");
			HttpURLConnection MyConn;
			MyConn = (HttpURLConnection) url.openConnection();
			
			MyConn.setRequestMethod("PUT");
			MyConn.setDoInput(true);
			MyConn.setDoOutput(true);
			MyConn.setRequestProperty(ITSAccount.apiSecretName, ITSAccount.apiSecret);
			MyConn.setRequestProperty("Content-Type", ITSAccount.apiMediaType);
			OutputStream out = MyConn.getOutputStream();
			out.write(json.getBytes());
			out.close();
							
			// Collect the response code
			int responseCode = MyConn.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
						    
			if (responseCode == HttpURLConnection.HTTP_OK) {
			    // Create a reader with the input stream reader.
			    BufferedReader in = new BufferedReader(new InputStreamReader(MyConn.getInputStream()));
			    String inputLine;
	
			   // Create a string buffer
			   StringBuffer response = new StringBuffer();
	
			   // Write each of the input line
			   while ((inputLine = in.readLine()) != null) {
				   response.append(inputLine);
			   }
			   in.close();
			   // Show the output
			   //System.out.println(response.toString());
			   return true;
			}					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					    
		return false;
	}
	
	public static void InitSocket()
	{
	    URI uri;
	
	    try
	       {
	       uri = new URI(ITSAccount.wssUrl+"?"+ITSAccount.socketSecretName+"="+ITSAccount.socketSecret);
	       CreateWebSocket(uri);
	
	                webSocketClient.setConnectTimeout(10000);
	                webSocketClient.setReadTimeout(60000);
	                webSocketClient.enableAutomaticReconnection(5000);
	                webSocketClient.connect();
	                
	                System.out.println("Smartsocket connected");
	                
	                try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                locationUpdateMessage(70, 45, 52.286999, 4.781885,7);                    
	                
					try {
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					locationUpdateMessage(70, 45, 53.286999, 5.781885,7);
	                
	       }
	   catch (URISyntaxException e)
	       {
	         System.out.println("InitSocket error: " + e.getMessage());
	       }
	     
	    
	} /* InitSocket */
	
	
	private static void CreateWebSocket(URI uri)
	{
	    webSocketClient = new WebSocketClient(uri)
	    {
	        @Override
	        public void onOpen()
	        {
	        	System.out.println("WebSocket, onOpen");
	        }
	
	        @Override
	        public void onTextReceived(String message)
	        {
	            //System.out.println("onTextReceived");
	        	System.out.println("WebSocket, onTextReceived: " + message);
	        }
	
	        @Override
	        public void onBinaryReceived(byte[] data)
	        {
	            //System.out.println("onBinaryReceived");
	        	System.out.println("WebSocket, onBinaryReceived" + data);
	
	            try
	            {
	                FmsItsMessage rcvMessage;
	                rcvMessage = FmsItsMessage.parseFrom(data);
	                System.out.println("WebSocket, incoming message: " + rcvMessage.toString() + " => " + rcvMessage.getMessageType());
	
	
	                // when received message was request for timesync, send timestamp
	                //if (rcvMessage.MessageType.ToString()=="TimestampMessage")
	                if (rcvMessage.getMessageType() == MessageType.TIMESTAMP_MESSAGE)
	                {
	                	timestampMessage(rcvMessage);
	                }
	                else
	                {
	                	// TODO handle messages
	                }
	            }
	            catch (InvalidProtocolBufferException e)
	            {
	                e.printStackTrace();
	                System.out.println("WebSocket, InvalidProtocolBufferException error: " + e.getMessage());
	            }
	
	        }
	
	        @Override
	        public void onPingReceived(byte[] data)
	        {
	            //System.out.println("onPingReceived");
	        	System.out.println("WebSocket, onPingReceived" + data);
	
	            try
	            {
	                FmsItsMessage rcvMessage;
	                rcvMessage = FmsItsMessage.parseFrom(data);
	                System.out.println("WebSocket, onPingReceived, received: " + rcvMessage.getMessageType());
	            }
	            catch (InvalidProtocolBufferException e)
	            {
	                e.printStackTrace();
	                System.out.println("WebSocket, onPingReceived, InvalidProtocolBufferException error: " + e.getMessage());
	            }
	        }
	
	        @Override
	        public void onPongReceived(byte[] data)
	        {
	            //System.out.println("onPongReceived");
	        	System.out.println("WebSocket, onPongReceived" + data);
	
	            try
	            {
	                FmsItsMessage rcvMessage;
	                rcvMessage = FmsItsMessage.parseFrom(data);
	                System.out.println("WebSocket, onPongReceived, received: " + rcvMessage.getMessageType());
	            }
	            catch (InvalidProtocolBufferException e)
	            {
	                e.printStackTrace();
	                System.out.println("WebSocket, onPongReceived, InvalidProtocolBufferException error: " + e.getMessage());
	            }
	        }
	
	        @Override
	        public void onException(Exception e)
	        {
	            //System.out.println(e.getMessage());
	        	System.out.println("WebSocket, onException" + e.getMessage());
	        }
	
	        @Override
	        public void onCloseReceived(int reason, String description)
	        {
	        	System.out.println("WebSocket, onCloseReceived [%d] [%s]"+ " " +reason + " " + description);
	        }
	        
	    }; // new WebSocketClient
	
	} /* CreateWebSocket */
	
	
	private static void timestampMessage(FmsItsMessage incomingMessage) {
		TimestampMessage.Builder timestampmessagebuilder = TimestampMessage.newBuilder();
		timestampmessagebuilder.setRequestTransmission(incomingMessage.getContainer().getTimestampMessage().getRequestTransmission());
	    long millis = System.currentTimeMillis();
	    Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000).setNanos((int) ((millis % 1000) * 1000000)).build();
	    timestampmessagebuilder.setRequestReception(timestamp);
	    timestampmessagebuilder.setResponseTransmission(timestamp);
	    
	    FmsItsContainer.Builder container = FmsItsContainer.newBuilder();
	    container.setTimestampMessage(timestampmessagebuilder.build());
	    
	    FmsItsMessage.Builder builder = FmsItsMessage.newBuilder();
	    builder.setMessageType(MessageType.TIMESTAMP_MESSAGE);
	    
	    builder.setVehicleId(Vehicle.id);
	    builder.setContainer(container.build());
	
	    FmsItsMessage sndMessage = builder.build();
	            
	    sendMessage(sndMessage);
	}
	
	private static void locationUpdateMessage(int speed, int heading, double latitude, double longitude, int gpsquality)
	{
		LocationUpdateEvent.Builder loc = LocationUpdateEvent.newBuilder();
		long millis = System.currentTimeMillis();
	    Timestamp timestamp = Timestamp.newBuilder().setSeconds(millis / 1000).setNanos((int) ((millis % 1000) * 1000000)).build();
	    loc.setCreationDate(timestamp);
	    loc.setGpsQuality(gpsquality);
	    
	    LocationUpdateEvent.GeoReference.Builder geo = LocationUpdateEvent.GeoReference.newBuilder();
	    geo.setLat(latitude);
	    geo.setLon(longitude);
		loc.setGeoReference(geo.build());
				
		MeasurementType.Builder spe = MeasurementType.newBuilder();
		spe.setUnit(MeasurementUnit.KILOMETERS_PER_HOUR);
		spe.setValue(speed);
		loc.setSpeed(spe.build());
		 
		MeasurementType.Builder hea = MeasurementType.newBuilder();
		hea.setUnit(MeasurementUnit.DEGREES);
		hea.setValue(heading);
		loc.setHeading(hea.build());
		
		FmsItsContainer.Builder container = FmsItsContainer.newBuilder();
		container.setLocationUpdate(loc.build());
		
		FmsItsMessage.Builder msg = FmsItsMessage.newBuilder();
		msg.setMessageType(MessageType.LOCATION_UPDATE);
		msg.setVehicleId(Vehicle.id);
		msg.setContainer(container.build());
		
		FmsItsMessage sndMessage = msg.build();
	    sendMessage(sndMessage);
	}
	
	private static void sendMessage(FmsItsMessage outgoingMessage) {
		System.out.println("WebSocket, outgoing: "+outgoingMessage.toString());
		webSocketClient.send(outgoingMessage.toByteArray());
	}
}