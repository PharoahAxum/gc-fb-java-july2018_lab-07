package co.grandcircus.lab_07;

import java.util.Scanner;

public class UserDataApp { // <formerly> public class ValidationDemo {

	public static void main(String[] args) {
	
	// Task: Write a program that will recognize invalid inputs using regular
	// expressions.
			
			Scanner scnr = new Scanner(System.in);
				
			String name = Validation.getStringMatchingRegex(scnr, "Enter first name: ", "[A-Z][a-z]*");
			String phoneNum = Validation.getPhoneStringMatchingRegex(scnr, "Enter your telephone numer"
					+ " with area code: ", "\\(\\d{3}\\)\\d{3}-?\\d{4}");
			int age = Validation.getInt(scnr, "Enter your age: ", 0, 150);
			String usrDate = Validation.getDateStringMatchingRegex(scnr, "Enter the date of your birth,"
					+ " as DD/MM/YYYY: ", "[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
			double heightInFeet = Validation.getDouble(scnr, "Enter your height (in feet): ", 0, 10);
				
			System.out.println("Name: " + name);
			System.out.println("Phone Number: " + phoneNum);
			System.out.println("Age: " + age);
			System.out.println("Birth Day: " + usrDate);
			System.out.println("Height: " + heightInFeet + "ft");

			scnr.close();
			}
}

