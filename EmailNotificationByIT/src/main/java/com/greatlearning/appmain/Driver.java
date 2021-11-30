package com.greatlearning.appmain;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CredentialService cred = new CredentialService();

		System.out.println("Please enter your first name:");

		String fname = sc.nextLine();

		System.out.println("Please enter your last name:");

		String lname = sc.nextLine();

		System.out.println("Please choose the option from the below: " + "\n" + "1. Technical  " + "\n" + "2. Admin "
				+ "\n" + "3. Human Resource " + "\n" + "4. Legal");

		int dname = sc.nextInt();

		String email = null;
		String password = null;
		if (dname == 1) {
			Employee emp = new Employee(fname, lname, "Technical");
			email = cred.generateEmail(fname, lname, "Technical");
			
			password = cred.generatePassword();
			cred.showCredentials(emp, email, password);

		} else if (dname == 2) {
			Employee emp = new Employee(fname, lname, "Admin");
			email = cred.generateEmail(fname, lname, "Admin");
			
			password = cred.generatePassword();
			cred.showCredentials(emp, email, password);
			
		} else if (dname == 3) {
			Employee emp = new Employee(fname, lname, "Human Resource");
			email = cred.generateEmail(fname, lname, "Human Resource");
		
			password = cred.generatePassword();
			cred.showCredentials(emp, email, password);
			
		} else if (dname == 4) {
			Employee emp = new Employee(fname, lname, "Legal");
			email = cred.generateEmail(fname, lname, "Legal");
			
			password = cred.generatePassword();
			cred.showCredentials(emp, email, password);
			
		} else {
			System.out.println("Please enter a valid option");
		}

	}

}
