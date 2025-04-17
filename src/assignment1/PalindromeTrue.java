package assignment1;

public class PalindromeTrue {
    public static void main(String[] args) {
        int number = 343; // You can change this number to test other values
        boolean isPalindrome = checkPalindrome(number);

        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return originalNumber == reversedNumber;
    }
}
