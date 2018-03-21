Create the project as per the pom.xml note maven jaxb2 plugin entries....very important

Run the springbootsoapservice as spring boot app

Invoke URL http://localhost:8080/service/studentDetailsWsdl.wsdl

copy and paste the wsdl in wsdl folder.

mvn clean install will generate required model/factroy/request/response classes

Code in config.java
Note // this is the package name specified in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("com.ameya.soap.student");

Code in SOAPConnector.java

Code in/Modify SpringBootSoapClientApplication.java

Code in TestSoapClient.java

Run this class as Java App. (Ensure springbootsoapservice is running)

//Wimdow show view TCP/Ip Monitor
		// rt click in top left pane properties
		// Add -> local monitoring port 9001 host localhost port 8080 start automatically apply and close
		// then comment out above response generation and uncomment below line and run TestsoapClient again
		//go to TCP/IP Monitor select xml for request and also for response in the drop downs
		//u will see the request and response soap envelopes