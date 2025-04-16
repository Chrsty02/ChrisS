package assignment2;

public class Substring {

	  
	    // Define the main method.
	    public static void main(String[] args) {
	        // Declare and initialize a string variable.
	        String str = "The cow jumped over the moon and the dish ran away with the spoon.";

	        // Get a substring of the above string starting from
	        // index 29 and ending at index 66.
	        String new_str = str.substring(29, 66);

	        // Display the original and the extracted substring for comparison.
	        System.out.println("old = " + str);
	        System.out.println("new = " + new_str);
	    }
	}
