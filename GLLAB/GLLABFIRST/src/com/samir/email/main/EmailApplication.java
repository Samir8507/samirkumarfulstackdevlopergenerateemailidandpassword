package com.samir.email.main;

import java.util.Scanner;

import com.samir.email.model.Employee;
import com.samir.email.service.CredentialService;
import com.samir.email.service.CredentialServiceImpl;


public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialService service = new CredentialServiceImpl();
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String firstName = a.next();
		System.out.println("Enter LastName");
		String lastName = a.next();
		Employee employee =new Employee(firstName, lastName);
		
		String department = null;
		service.passwordGenerator();
		System.out.println("Please enter Department from below");
		System.out.println("1. Choose 1 for Tecnical");
		System.out.println("2. Choose 2 for Administration");
		System.out.println("3. Choose 3 for Human Resourse");
		System.out.println("4. Choose 4 for legal");
		
		
		System.out.println("Enter your Option");
		int option = a.nextInt();
		switch (option) {
		case 1:
			department = "technical";
			break;
		case 2: 
			department = "administration";
			break;
		case 3:
			department = "human resourse";
			break;
		case 4:
			department ="legal";
			break;
			default:
			System.out.println("Enter the right option");
			break;
			
		}
		service.emailGenerator(employee,  department);
		service.displayCredential(employee,  department);

	}

}
