package assignment1;

public class DigitNumbers {
    public static void main(String[] args) {
        int number = 987654321; // You can change this number to test with different values
        int count = 0;

        // Handle negative numbers by converting them to positive
        if (number < 0) {
            number = -number;
        }

        // Count the number of digits
        while (number > 0) {
            number = number / 10;
            count++;
        }

        // Print the result
        System.out.println("The number of digits is: " + count);
    }
}
