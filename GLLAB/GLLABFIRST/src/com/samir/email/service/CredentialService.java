package com.samir.email.service;

import com.samir.email.model.Employee;

public interface CredentialService {
	
	public String passwordGenerator();
	
	public String emailGenerator(Employee employee, String department);
	
	public void displayCredential(Employee emp, String department);
	
	

}
