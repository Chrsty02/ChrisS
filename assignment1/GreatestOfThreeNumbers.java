package assignment1;

// TODO Auto-generated method stub
import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Find the greatest number
        double greatest = findGreatest(num1, num2, num3);

        // Display the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }

    // Method to find the greatest of three numbers
    public static double findGreatest(double a, double b, double c) {
        double max = a; // Assume the first number is the greatest

        if (b > max) {
            max = b; // Update max if the second number is greater
        }

        if (c > max) {
            max = c; // Update max if the third number is greater
        }

        return max;
    }
}
