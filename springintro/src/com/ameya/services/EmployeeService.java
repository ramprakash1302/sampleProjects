package com.ameya.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ameya.daos.EmployeeDAO;

public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDao;
	public EmployeeService() {
		
	}
	public void serViceInvoked() {
		employeeDao.dbOperation();
		System.out.println("+++++ Service Invoking DAO +++++");
	}

}
