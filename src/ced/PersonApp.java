package ced;

import java.util.Scanner;

public class PersonApp {
	
	private static Scanner sc;
	private static String type;
	private static String firstName;
	private static String lastName;
	private static String email;
	private static String socialSecurityNo;
	private static int customerNo;
	private static String choice;

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Tester Application");
		sc = new Scanner(System.in);
		choice = "y";
		
		while (choice.equalsIgnoreCase("y")){
			type = Validator.getString(sc, "Create customer or employee?  (c/e): ");
			if (type.equalsIgnoreCase("c")){
				firstName = Validator.getString(sc, "Enter first name: ");
				lastName = Validator.getString(sc, "Enter last name: ");
				email = Validator.getString(sc, "Enter email address: ");
				customerNo = Validator.getInt(sc, "Enter customer number: ");
				System.out.println("You have entered the following:  \n");
				System.out.println("First Name: " + firstName + "\n" +
									"Last Name: " + lastName + "\n" + 
									"Email Address: " + email + "\n" + 
									"Customer Number: " + customerNo + "\n");
									
			}
			else if (type.equalsIgnoreCase("e")){
				firstName = Validator.getString(sc, "Enter first name: ");
				lastName = Validator.getString(sc, "Enter last name: ");
				email = Validator.getString(sc, "Enter email address: ");
				socialSecurityNo = Validator.getString(sc, "Enter social security number: ");
				System.out.println("You have entered the following:  \n");
				System.out.println("First Name: " + firstName + "\n" +
						"Last Name: " + lastName + "\n" + 
						"Email Address: " + email + "\n" + 
						"Social Security Number: " + socialSecurityNo + "\n");
			}
			else{
				System.out.println("Invalid input.");
			}
			choice = Validator.getString(sc, "Continue? (y/n)");
		}
}
}
