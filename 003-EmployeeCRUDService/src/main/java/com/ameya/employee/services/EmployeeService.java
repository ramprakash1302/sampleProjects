package com.ameya.employee.services;

import java.util.List;

import com.ameya.employee.models.Employee;

public interface EmployeeService {
	public List<Employee>getAllEmployees();
	public String addEmployee(Employee employee);
	public String updateEmployee(Integer empId,Employee employee);
	public Employee getEmployee(Integer empId);
	public String deleteEmployee(Integer empId);
}
