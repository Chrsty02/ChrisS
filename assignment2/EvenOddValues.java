package assignment2;

public class EvenOddValues  {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print even numbers
        System.out.println("Even numbers:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        // Print odd numbers
        System.out.println("\nOdd numbers:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
