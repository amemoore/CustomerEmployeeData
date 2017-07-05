package ced;

import java.util.Scanner;

public class PersonApp {
	
	private static Scanner sc;
	private static String type;

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Tester Application");
		sc = new Scanner(System.in);
		type = Validator.getString(sc, "Create customer or employee?  (c/e): ");
		
		
		if (type.equalsIgnoreCase("c")){
			
		}

	}
//IN PROGRESS JULY 5TH//////////////
}
