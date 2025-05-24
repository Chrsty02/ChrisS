package Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ScientificCalculator operations
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Scientific Calculator Operations:");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation (squareNAddTwoNumbers/cubeNAddTwoNumbers/addition/subtraction/multiplication/division): ");
        String operation = scanner.next();

        double result;
        try {
            switch (operation) {
                case "squareNAddTwoNumbers":
                    result = scientificCalculator.squareNAddTwoNumbers(num1, num2);
                    break;
                case "cubeNAddTwoNumbers":
                    result = scientificCalculator.cubeNAddTwoNumbers(num1, num2);
                    break;
                case "addition":
                    result = scientificCalculator.addition(num1, num2);
                    break;
                case "subtraction":
                    result = scientificCalculator.subtraction(num1, num2);
                    break;
                case "multiplication":
                    result = scientificCalculator.multiplication(num1, num2);
                    break;
                case "division":
                    result = scientificCalculator.division(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // TaxCalculator operations
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("\nTax Calculator Operations:");
        System.out.print("Enter first number: ");
        double taxNum1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double taxNum2 = scanner.nextDouble();
        System.out.print("Enter operation (addition/subtraction): ");
        String taxOperation = scanner.next();

        double taxResult;
        try {
            switch (taxOperation) {
                case "addition":
                    taxResult = taxCalculator.addition(taxNum1, taxNum2);
                    break;
                case "subtraction":
                    taxResult = taxCalculator.subtraction(taxNum1, taxNum2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }
            System.out.println("Result with tax: " + taxResult);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Floating point addition
        System.out.println("\nFloating Point Addition:");
        System.out.print("Enter first floating number: ");
        float floatNum1 = scanner.nextFloat();
        System.out.print("Enter second floating number: ");
        float floatNum2 = scanner.nextFloat();
        double floatResult = taxCalculator.addition(floatNum1, floatNum2);
        System.out.println("Result: " + floatResult);

        scanner.close();
    }
}