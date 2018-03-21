This demo is of microservices using spring boot

We code in 2 microservices AccountService and CustomerService
and deploy them using Eureka/Zuul/Zipkin

It consists of 6 modules

Account-service -->Your Business microservice
Customer-service -->Your Business microservice
Discovery-service -->Registry your services are registerd with Eureka server
gateway-service -->Creates the proxy (ZUUL proxy) for your services
zipkin-service -->This is for monitoring and troubleshooting it uses Zipkin

Writedown the required classes and interfaces refering to the sample project
Refer to pom.xml from each module(springbootmicroservice/account-service/customer-service/discovery-service/gateway-service/zipkin-service)

Note the varoius annotations @SpringbootApplication @RestController etc
Note the feignclient

While running (run the respective project as Spring Boot App.)Run in the following order (port nos. and all configurations in application.yml files)
	springbootmicroservice (This is parent module for all the remaining modules)
	discovery-service (runs on port 8761)
	gateway-service (runs on port 8765)
	zipkin-service (runs on port 9411 optional will be required for monitoring)
	account-service (runs on port 2222) 
	customer-service (runs on port 3333)

The services should be invoked using port to which gateway-service listens (8765 in this case)
The url patterns are mentioned in application.yml of gateway-service project.

The dicovery-service can be invoked using the port to which it listens(8761 in this case)


Sample URLS :

http://localhost:8765/customer/customers/3
http://localhost:8765/account/accounts/222222