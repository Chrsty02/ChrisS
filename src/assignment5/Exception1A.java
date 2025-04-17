package assignment5;

public class Exception1A {
	

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        int result;

        try {
            // Attempt to divide by zero
            result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // This block will always execute
            System.out.println("Execution completed.");
        }
    }
}
