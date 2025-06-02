package assignment3;

public class Calculation {
    // Declare three integer variables
    private int num1;
    private int num2;
    private int num3;

    // Constructor to initialize the variables
    public Calculation(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    // Method to calculate the sum of the three numbers
    public int Sum() {
        return num1 + num2 + num3;
    }

    // Main method to create an object and call the constructor and sum method
    public static void main(String[] args) {
        // Create an object of Calculation and pass three integer values
        Calculation calc = new Calculation(100, 250, 300);

        // Call the sum method and print the result
        int result = calc.Sum();
        System.out.println("The sum of the three numbers is: " + result);
    }
}
