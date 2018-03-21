package com.ameya.soap.wsclient;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ameya.soap.student.Student;

public class TestSoapClient {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSoapClientApplication.class, args);
        Student student=context.getBean(Student.class);
	}

}
