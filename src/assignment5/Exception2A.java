package assignment5;

	import java.io.IOException;

	public class Exception2A {

	    // Method that throws a checked exception
	    public static void throwCheckedException() throws IOException {
	        // Throwing a checked exception
	        throw new IOException("This is a checked exception");
	    }

	    public static void main(String[] args) {
	        try {
	            // Calling the method that throws a checked exception
	            throwCheckedException();
	        } catch (IOException e) {
	            // Handling the checked exception
	            System.out.println("Caught an IOException: " + e.getMessage());
	        }
	    }
	}