package Exam;

public class ScientificCalculator extends Calculator {
    public double squareNAddTwoNumbers(double num1, double num2) {
        return Math.pow(num1, 2) + Math.pow(num2, 2);
    }

    public double cubeNAddTwoNumbers(double num1, double num2) {
        return Math.pow(num1, 3) + Math.pow(num2, 3);
    }
}
