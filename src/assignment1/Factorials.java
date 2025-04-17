package assignment1;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate the input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}
