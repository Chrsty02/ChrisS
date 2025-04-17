package assignment1;

import java.util.Scanner;
public class ScannerInput_3 {
public static void main(String[] args) {
// TODO Auto-generated method stub
// Write a Java program to get a number from the user and print whether it is
// positive or negative
		// TODO Auto-generated method stub
		System.out.println("Enter a Float:");
		Scanner scanner = new Scanner(System.in);
		float number1 = scanner.nextFloat();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter a String:");
		String strVariable1 = scanner.next();
		System.out.println("String entered is: " + strVariable1);
		scanner.close();
}
}