package assignment5;

public class B {

	public class ArrayIndexOutOfBoundsExample {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        try {
	            // Attempt to access an index that is out of bounds
	            System.out.println("Accessing element at index 10: " + numbers[10]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handle the exception
	            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } finally {
	            // This block will always execute, regardless of whether an exception was thrown
	            System.out.println("This is the finally block. It always executes.");
	        }

	        // Continue with the rest of the program
	        System.out.println("Program continues to run after the exception is handled.");
	    }
	}
}

