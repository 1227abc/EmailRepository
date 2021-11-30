package com.greatlearning.service;

import java.nio.charset.Charset;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	
	
	public String generateEmail(String fname,String lname, String dept) {
		
		String email = fname.toLowerCase().replace(" ","") + lname.toLowerCase().replace(" ","")+"@"+dept.toLowerCase().replace(" ","")+".company.com";
		return email;
		
	}
	
	public String generatePassword() {
		
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%^&*()_+=<>[]";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[8];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< 8 ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	        
	      }
		
		
		return "" + new String(password);
	     
	   }
	
	
	
	public void showCredentials(Employee emp, String email, String password) {
		
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows" );
		System.out.println("Email    ---> " + email);
		System.out.println("Password ---> " + password);
	}


}
