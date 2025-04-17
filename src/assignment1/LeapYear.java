package assignment1;

	import java.util.Scanner;

	public class LeapYear {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Check if the year is a leap year
	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        // Close the scanner
	        scanner.close();
	    }

	    // Method to determine if a year is a leap year
	    public static boolean isLeapYear(int year) {
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    return true; // Divisible by 400
	                } else {
	                    return false; // Divisible by 100 but not by 400
	                }
	            } else {
	                return true; // Divisible by 4 but not by 100
	            }
	        } else {
	            return false; // Not divisible by 4
	        }
	    }
	}
