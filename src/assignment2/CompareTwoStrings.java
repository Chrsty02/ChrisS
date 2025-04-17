package assignment2;

public class CompareTwoStrings {

	    public static void main(String[] args) {
	        // Example strings to compare
	        String string1 = "This Is My Sentence.";
	        String string2 = "This is my sentence.";

	        // Compare the strings ignoring case
	        if (compareStringsIgnoreCase(string1, string2)) {
	            System.out.println("The strings are equal (ignoring case).");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
	    }

	    /**
	     * Compares two strings ignoring case differences.
	     *
	     * @param str1 the first string
	     * @param str2 the second string
	     * @return true if the strings are equal ignoring case, false otherwise
	     */
	    public static boolean compareStringsIgnoreCase(String str1, String str2) {
	        if (str1 == null || str2 == null) {
	            return str1 == str2;
	        }
	        return str1.equalsIgnoreCase(str2);
	    }
	}

