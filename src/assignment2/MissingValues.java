package assignment2;

public class MissingValues  {

	    public static void main(String[] args) {
	        int[] array = {1, 2, 4, 5, 6};
	        int n = array.length + 1; // The total number of elements including the missing one
	        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
	        int actualSum = 0;

	        // Calculate the sum of the elements in the array
	        for (int num : array) {
	            actualSum += num;
	        }

	        // The missing number is the difference between the expected sum and the actual sum
	        int missingNumber = expectedSum - actualSum;

	        System.out.println("The missing number is: " + missingNumber);
	    }
	}
