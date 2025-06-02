package Exam;

import java.util.Scanner;

// Main class
		public class Question16 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Choose calculator type: 1 for Scientific, 2 for Tax");
		        int calculatorType = scanner.nextInt();

		        Calculator calculator;
		        if (calculatorType == 1) {
		            calculator = new ScientificCalculator();
		        } else if (calculatorType == 2) {
		            calculator = new TaxCalculator();
		        } else {
		            System.out.println("Invalid calculator type.");
		            return;
		        }

		        System.out.println("Enter first number:");
		        double num1 = scanner.nextDouble();

		        System.out.println("Enter second number:");
		        double num2 = scanner.nextDouble();

		        System.out.println("Choose operation: +, -, *, /, squareNAdd, cubeNAdd");
		        String operation = scanner.next();

		        try {
		            double result;
		            switch (operation) {
		                case "+":
		                    result = calculator.addition(num1, num2);
		                    break;
		                case "-":
		                    result = calculator.subtraction(num1, num2);
		                    break;
		                case "*":
		                    result = calculator.multiplication(num1, num2);
		                    break;
		                case "/":
		                    result = calculator.division(num1, num2);
		                    break;
		                case "squareNAdd":
		                    if (calculator instanceof ScientificCalculator) {
		                        result = ((ScientificCalculator) calculator).squareNAddTwoNumbers(num1, num2);
		                    } else {
		                        System.out.println("Operation not supported by this calculator.");
		                        return;
		                    }
		                    break;
		                case "cubeNAdd":
		                    if (calculator instanceof ScientificCalculator) {
		                        result = ((ScientificCalculator) calculator).cubeNAddTwoNumbers(num1, num2);
		                    } else {
		                        System.out.println("Operation not supported by this calculator.");
		                        return;
		                    }
		                    break;
		                default:
		                    System.out.println("Invalid operation.");
		                    return;
		            }
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
