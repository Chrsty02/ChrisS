package assignment1;

public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 1, second = 1;

        System.out.print("Fibonacci Series from 1 to 50: ");

        // Print the first two numbers of the series
        System.out.print(first + ", " + second);

        // Generate and print the rest of the series within the range
        while (true) {
            int next = first + second;
            if (next > 50) {
                break;
            }
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
