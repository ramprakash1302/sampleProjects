package com.ameya.employee.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Employee {
	@Id
	@ApiModelProperty(notes = "The Primary Key for Employee <b>empId</b>",required = true)
	private Integer empId;
	@ApiModelProperty(notes = "The Employee <b>firstName</b>",required = true)
	private String firstName;
	@ApiModelProperty(notes = "The Employee <b>midName</b>",required = true)
	private String midName;
	@ApiModelProperty(notes = "The Employee <b>lastName</b>",required = true)
	private String lastName;
	@ApiModelProperty(notes = "The Employee <b>salary</b>",required = true)
	private Double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String firstName, String midName, String lastName, Double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.midName = midName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", midName=" + midName + ", lastName="
				+ lastName + ", salary=" + salary + "]";
	}

}
