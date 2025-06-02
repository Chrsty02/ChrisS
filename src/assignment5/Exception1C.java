package assignment5;

public class Exception1C {
    public static void main(String[] args) {
        try {
            int[] a = new int[6]; // Array with indices 0 to 5
            int validElement = a[5]; // Accessing the last valid index
            System.out.println("Array element at index 5 is: " + validElement);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Error message is " + e1);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}