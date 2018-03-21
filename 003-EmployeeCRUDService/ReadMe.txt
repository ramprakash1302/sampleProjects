
Observe the entries in application.properties file
Rest URLS :

GET  : http://localhost:8080/employees/103
GET  : http://localhost:8080/employees
POST : http://localhost:8080/employees --->This will have Json in body
PUT  : http://localhost:8080/employees/103--->this will have Json in body
DELETE : http://localhost:8080/employees/103


Swagger :
Add the dependencies in pom.xml update maven project
Code in the com.ameya.employee.SwaggerConfig class

URLS : 
http://localhost:8080/v2/api-docs
http://localhost:8080/swagger-ui.html