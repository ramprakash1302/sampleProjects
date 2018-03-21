package com.ameya.soap.wsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ameya.soap.student.Student;
import com.ameya.soap.student.StudentDetailsRequest;
import com.ameya.soap.student.StudentDetailsResponse;

@SpringBootApplication
public class SpringBootSoapClientApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapClientApplication.class, args);
	}
	@Bean
	public Student getStudent(SOAPConnector client) {
		StudentDetailsRequest request = new StudentDetailsRequest();
		request.setName("Kshiti");
		//StudentDetailsResponse response =(StudentDetailsResponse) client.callWebService("http://localhost:8080/service/student-details", request);
		//Wimdow show view TCP/Ip Monitor
		// rt click in top left pane properties
		// Add -> local monitoring port 9001 host localhost port 8080 start automatically apply and close
		// then comment out above response generation and uncomment below line and run TestsoapClient again
		//go to TCP/IP Monitor select xml for request and also for response in the drop downs
		//u will see the request and response soap envelopes
		StudentDetailsResponse response =(StudentDetailsResponse) client.callWebService("http://localhost:9001/service/student-details", request);
		System.out.println("Got Response As below ========= : "+response.toString()+"============"+response.getStudent().toString());
		Student student=response.getStudent();
		System.out.println("Name : "+response.getStudent().getName());
		System.out.println("Standard : "+response.getStudent().getStandard());
		System.out.println("Address : "+response.getStudent().getAddress());
		return student;
	}
}
