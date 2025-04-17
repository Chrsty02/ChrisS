package assignment5;

public class A {

	public class ArrayExceptionHandling {
	    public static void main(String[] args) {
	        int[] a = null;

	        try {
	            // Attempting to access an element of a null array
	            int value = a[120];
	            System.out.println("Value at index 120: " + value);
	        } catch (NullPointerException e) {
	            System.out.println("Caught a NullPointerException: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
	        } finally {
	            System.out.println("This block is always executed.");
	        }
	    }
	}
}
	
