package co.grandcircus.fbjava_july2018.lab_07;

import java.util.Scanner;

public class Lab_07 { // <formerly> public class ValidationDemo {

	public static void main(String[] args) {
	
	// Task: Write a program that will recognize invalid inputs using regular
	// expressions.
			
			Scanner scnr = new Scanner(System.in);
				
			String name = Lab_07_Validator.getStringMatchingRegex(scnr, "Enter first name: ", "[A-Z][a-z]*");
			int age = Lab_07_Validator.getInt(scnr, "Enter your age: ", 0, 150);
			String usrDate = Lab_07_Validator.getDateStringMatchingRegex(scnr, "Enter the date of your birth,"
					+ " as DD/MM/YYYY: ", "[0-3][0-9]/[0-1][0-9]/[0-9]{4}");
			double heightInFeet = Lab_07_Validator.getDouble(scnr, "Enter your height (in feet): ", 0, 10);
				
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Birth Day: " + usrDate);
			System.out.println("Height: " + heightInFeet + "ft");

			scnr.close();
			}
}

