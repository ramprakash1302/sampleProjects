package com.ameya.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.ameya.employee")
public class EmployeeCrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudServiceApplication.class, args);
	}
}
