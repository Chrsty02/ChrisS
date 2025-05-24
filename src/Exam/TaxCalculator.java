package Exam;

public class TaxCalculator extends Calculator {
    private static final double TAX_RATE = 0.13;

    @Override
    public double addition(double num1, double num2) {
        double sum = super.addition(num1, num2);
        return sum + (sum * TAX_RATE);
    }

    @Override
    public double subtraction(double num1, double num2) {
        double difference = super.subtraction(num1, num2);
        return difference + (difference * TAX_RATE);
    }

    public double addition(float num1, float num2) {
        return num1 + num2;
    }
}
