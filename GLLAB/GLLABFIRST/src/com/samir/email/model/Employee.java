package com.samir.email.model;

public class Employee {
	private String FirstName;
	private String LastName;
	
	public Employee(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

}
