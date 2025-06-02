package assignment5;

public class Exception1B {

    public static void main(String[] args) {
        try {
            // Initialize the array with some values
            int a[] = {1, 2, 3, 4, 5}; // Example initialization
            int arrayLength = a.length;
            System.out.println("Array Length is : " + arrayLength);
        } catch (NullPointerException e1) {
            System.out.println("Error message is " + e1);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
