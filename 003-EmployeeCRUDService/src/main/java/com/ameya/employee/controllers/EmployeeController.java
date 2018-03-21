package com.ameya.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ameya.employee.models.Employee;
import com.ameya.employee.services.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="EmployeeCRUDService", description="Operations pertaining to EmployeeCRUDService")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@ApiOperation(value = "View a list of Employees",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@GetMapping(path="/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	 @ApiOperation(value = "Search a Employee with an empId",response = Employee.class)
	@GetMapping(path="/employees/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		return employeeService.getEmployee(empId);
	}
	 @ApiOperation(value = "Add a Employee")
	@PostMapping(path="/employees")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	 @ApiOperation(value = "Update a Employee based on empId")
	@PutMapping(path="/employees/{empId}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable("empId") Integer empId) {
		return employeeService.updateEmployee(empId, employee);
	}
	 @ApiOperation(value = "Delete a Employee based on empId")
	@DeleteMapping(path="/employees/{empId}")
	public String deleteEmployee(@PathVariable("empId") Integer empId) {
		return employeeService.deleteEmployee(empId);
	}
}
