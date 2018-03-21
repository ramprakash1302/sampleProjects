package com.ameya.employee.daos;



import org.springframework.data.repository.CrudRepository;

import com.ameya.employee.models.Employee;

//This will be AUTO IMPLEMENTED by Spring into a Bean called employeeDao if CrudRepository is extended 
//CRUD refers Create, Read, Update, Delete
public interface EmployeeDao extends CrudRepository<Employee, Integer>{
	
}
