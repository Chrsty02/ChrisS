package assignment3;

public class Calculation2 {

    // Method to sum two integers
    public int sum(int x, int y) {
        return x + y;
    }

    // Method to sum three integers
    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    // Method to sum two doubles
    public double sum(double x, double y) {
        return x + y;
    }

    // Method to sum three doubles
    public double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        // Create an object of Calculation2 class
        Calculation2 cal = new Calculation2();

        // Call different sum methods with different inputs
        int sum1 = cal.sum(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = cal.sum(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = cal.sum(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);

        double sum4 = cal.sum(5.5, 10.5, 15.5);
        System.out.println("Sum of three doubles: " + sum4);
    }
}




