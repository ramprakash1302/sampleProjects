package com.ameya.pojos;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int epmId;
	private String firstName;
	private String lastName;
	private Double salary;

	private Project project1;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEpmId() {
		return epmId;
	}
	public void setEpmId(int epmId) {
		this.epmId = epmId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public Project getProject1() {
		return project1;
	}
	@Required
	public void setProject1(Project project1) {
		this.project1 = project1;
	}
	@Override
	public String toString() {
		return "Employee [epmId=" + epmId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", project=" + project1 + "]";
	}
	
}
