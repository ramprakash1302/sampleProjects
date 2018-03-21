Create the project

Add the dependencies as in pom.xml note the wsdl4j and xjc related dependencies(critical)

create the Student.xsd file

run mvn clean install

This will generate the stubs/requ/res/factory classes

Create the StudentendPoint.java

Create the StudentRepository.java
Create the Config.java

invoke URL : http://localhost:8080/service/studentDetailsWsdl.wsdl

The wsdl will be available in browser