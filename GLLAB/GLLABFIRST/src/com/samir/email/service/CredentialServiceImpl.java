package com.samir.email.service;

import java.util.Random;

import com.samir.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String passwordGenerator() {
		// TODO Auto-generated method stub
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers =  "0123456789"; 
		String symbols ="!@#$%^&*_-+<>?/";
		String values = capitalChars + smallChars + numbers + symbols;
		Random random = new Random();
		char[] password = new char[10];
		for( int i = 0 ; i <10; i++ ) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
		}
	
		
		return new String(password);
	}

	@Override
	public String emailGenerator(Employee employee, String department) {
		
		return (employee.getFirstName() + employee.getLastName()).toLowerCase() +"@" + department + "sun.com";
	}

	@Override
	public void displayCredential(Employee emp, String department) {
		// TODO Auto-generated method stub
		System.out.println( "Hi" + emp.getFirstName() + "" + emp.getLastName() + "your generate credentials are below:");
		System.out.println("Email:" + emailGenerator( emp, department));
		System.out.println("Password: " + passwordGenerator());
		

	}

}
