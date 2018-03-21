package com.ameya.employee.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameya.employee.daos.EmployeeDao;
import com.ameya.employee.models.Employee;
import com.ameya.employee.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees=new ArrayList<>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}

	@Override
	public String addEmployee(Employee employee) {
		return (employeeDao.save(employee)!=null ?"Saved Successfully !!! " : "Error while Saving !!!");
	}

	@Override
	public String updateEmployee(Integer empId, Employee employee) {
		Employee empToUpdate=employeeDao.findOne(empId);
		empToUpdate.setFirstName(employee.getFirstName());
		empToUpdate.setMidName(employee.getMidName());
		empToUpdate.setLastName(employee.getLastName());
		empToUpdate.setSalary(employee.getSalary());
		return (employeeDao.save(empToUpdate)!=null ?"Updated Successfully !!! " : "Error while Updating !!!");
	}

	@Override
	public Employee getEmployee(Integer empId) {
			return employeeDao.findOne(empId);
	}

	@Override
	public String deleteEmployee(Integer empId) {
		String retVal="Deleted Successfully !!!";
		try {
			employeeDao.delete(empId);
		}catch(Exception e) {
			retVal="Error while Deleting !!!";
		}
		return retVal;
	}

}
