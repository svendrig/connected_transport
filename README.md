# connected_transport

Connected Transport Demo

This demo application is build to speed up development of implementing the Standard FMS-ITS Interface for connected transport.
For your conveniance we have developed an small demo application with the following functionalities:

- onBoard
- open websocket connection
- receive messages
- send messages

The demo shows the complete flow of initialize -> register -> send messages -> receive messages, but does not contain examples of how to use incoming data in an GUI for example.
Messages send and received are all displayed as JSON messages in an console, that can be sen aas real time logging of the communication. 

You can use, adjust and improve this code any way you want.
Any remarks, adustments or improvements to this demo code are always welcome.
Let's all help to speed up the adoption of connected transport!

We have created three different projects/repo's with the same demo, but in different programming languages:
- C#(created with visual studio): https://github.com/svendrig/connected_transport/tree/main/c#
- Java (created with Eclipse): https://github.com/svendrig/connected_transport/tree/main/java
- Kotlin (created with android studio): not online yet

Many thanks to Frank Wilhelm (Logi-App) and Guido Schiltmans (Mobicoach) for creating the first version of the c# code and sharing there experiences as the first developers using the FMS-ITS Interface.

To do's:
- Store api and websocket credentials more secure 
- Post planned route to REST API to automaticly request priority for trucks at smart traffic lights
- Filter and use incoming data in your application


For C#:
Build with Visual studio 2022 17.9

Used packages (NuGet Package Manager):
Install-Package Google.Protobuf 3.25.3 (google.protobuf)
	used for protobuf 
	
The fmsitsinterface classes are generated with protoc from the latest version (2.1) FMS_ITS_Interface_Specification.proto
For protoc: https://github.com/protocolbuffers/protobuf/releases
protoc --csharp_out=csharp FMS_ITS_Interface_Specification.proto


For Java:
Build with Eclipse 2023-12

Used libraries (from maven):
jackson-databind-2.3.1 (com.fasterxml.jackson.databind)
	used for converting objects to json (for message output in console)
java-android-websocket-client-2.0.2 (dev.gustavoavila.websocketclient)
	used for websocket connection
protobuf-java-3.25.3 (com.google.protobuf)
	used for protobuf 
	
The fmsitsinterface classes are generated with protoc from the latest version (2.1) FMS_ITS_Interface_Specification.proto
For protoc: https://github.com/protocolbuffers/protobuf/releases
used command: protoc --java_out=java FMS_ITS_Interface_Specification.proto

Start demo with:
java -cp .;lib/jackson-annotations-2.3.1.jar;lib/jackson-core-2.3.1.jar;lib/jackson-databind-2.3.1.jar;lib/java-android-websocket-client-2.0.2.jar;lib/protobuf-java-3.25.3.jar demo/Main

