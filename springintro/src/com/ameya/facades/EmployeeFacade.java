package com.ameya.facades;

import org.springframework.beans.factory.annotation.Autowired;

import com.ameya.services.EmployeeService;

public class EmployeeFacade {
	
	@Autowired
	private EmployeeService employeeService;
	
	public EmployeeFacade() {
		
	}
	public void facadeInvoked() {
		employeeService.serViceInvoked();
		System.out.println("+++++ faced invoking service +++++");
	}
}
