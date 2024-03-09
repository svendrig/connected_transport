package demo;

import java.util.UUID;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder; 
import org.w3c.dom.Document; 
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node; 
import org.w3c.dom.Element; 

public class DemoValuesProvider {
	
	public static Vehicle demoVehicle()
    {
		Vehicle vehicle = new Vehicle();
		vehicle.id = UUID.randomUUID().toString();
		vehicle.externalAttributes = new ExternalAttributes();
		vehicle.externalAttributes.iVRIPriorityEnabled = false;
				
		try {
		
			File file = new File("./config/demo_vehicle.xml");
			if(file.exists() && !file.isDirectory()) { 
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
				DocumentBuilder db = dbf.newDocumentBuilder(); 
				Document doc = db.parse(file); 
				doc.getDocumentElement().normalize();
				NodeList nodeList = doc.getElementsByTagName("vehicle"); 
				Node node = nodeList.item(0); 
				Element tElement = (Element)node;
                
				vehicle.name = tElement.getElementsByTagName("name").item(0).getTextContent();
				vehicle.licensePlate = tElement.getElementsByTagName("licenseplate").item(0).getTextContent();
				vehicle.vehicleType = tElement.getElementsByTagName("vehicletype").item(0).getTextContent();
				vehicle.fuel = tElement.getElementsByTagName("fuel").item(0).getTextContent();
			}
			else {
				System.out.println("file does not exists: demo_vehicle.xml");
				
			}
    	} catch (IOException | ParserConfigurationException | SAXException e) {
    		e.printStackTrace();
		}
	
		return vehicle;
    }
	
	public static ITSAccount demoITSAccount()
    {
		ITSAccount account = new ITSAccount();
		
		try {
			File file = new File("./config/demo_settings.xml");
			if(file.exists() && !file.isDirectory()) { 
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder db = dbf.newDocumentBuilder(); 
			Document doc = db.parse(file); 
			doc.getDocumentElement().normalize();
			
			/* rest api settings */
			NodeList restNode = doc.getElementsByTagName("rest"); 
			Node node = restNode.item(0); 
			Element tElement = (Element)node;
                
			account.apiUrl = tElement.getElementsByTagName("endpoint").item(0).getTextContent();
			account.apiSecretName = tElement.getElementsByTagName("name").item(0).getTextContent();
			account.apiSecret = tElement.getElementsByTagName("secret").item(0).getTextContent();
			account.apiMediaType = tElement.getElementsByTagName("type").item(0).getTextContent();
			
			/* websocket settings */
			NodeList wsNodeList = doc.getElementsByTagName("ws"); 
			Node wsNode = wsNodeList.item(0); 
			Element wsElement = (Element) wsNode;
			
			account.wssUrl = wsElement.getElementsByTagName("endpoint").item(0).getTextContent();
			account.socketSecretName = wsElement.getElementsByTagName("name").item(0).getTextContent();
			account.socketSecret = wsElement.getElementsByTagName("secret").item(0).getTextContent();
			}
			else {
				System.out.println("file does not exists: demo_settings.xml");
				
			}
    	} catch (IOException | ParserConfigurationException | SAXException e) {
    		e.printStackTrace();
		}
		return account;
    }
}