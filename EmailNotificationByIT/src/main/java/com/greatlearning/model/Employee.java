package com.greatlearning.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String deptName;
	
	public Employee(String firstName, String lastName, String deptName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
		
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
	
	

}
