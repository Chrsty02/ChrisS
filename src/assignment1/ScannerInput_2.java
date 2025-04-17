package assignment1;
import java.util.Scanner;

import java.util.Scanner;
public class ScannerInput_2 {
public static void main(String[] args) {
// TODO Auto-generated method stub
// Write a Java program to get a float number from the user and print whether it is
// positive or negative
//	
	System.out.println("Enter a floating number:");
	Scanner scanner = new Scanner(System.in);
	float number = scanner.nextFloat();
	System.out.println("Number entered is: "+ number);
	if (number > 0) {
	    System.out.println("The number is positive.");
	} else if (number < 0) {
	    System.out.println("The number is negative.");
	} else {
	    System.out.println("The number is zero.");
	}
	scanner.close();
	}
	}