package assignment2;

public class AverageValues {

	    public static void main(String[] args) {
	        // Example array of integers
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Calculate the average
	        double average = calculateAverage(numbers);

	        // Print the average
	        System.out.println("The average value of the array is: " + average);
	    }

	    public static double calculateAverage(int[] array) {
	        if (array == null || array.length == 0) {
	            throw new IllegalArgumentException("Array must not be null or empty");
	        }

	        int sum = 0;
	        for (int number : array) {
	            sum += number;
	        }

	        return (double) sum / array.length;
	    }
	}
