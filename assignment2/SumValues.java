package assignment2;

public class SumValues {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate the sum of the array elements
        int sum = calculateSum(numbers);

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
