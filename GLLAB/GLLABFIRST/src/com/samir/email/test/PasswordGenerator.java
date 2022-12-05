package com.samir.email.test;

import java.util.Random;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10;
		String pass = password(length);
		System.out.println(pass);
	}
	private static String password(int length) {
		// TODO Auto-generated method stub
		return null;
	}


	static String passwor(int length) {
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
}