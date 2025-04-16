package assignment1;

import java.util.Scanner;
public class ScannerInput_1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
// Write a Java program to get a number from the user and print whether it is
// positive or negative
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter an integer here: ");
int number = scanner.nextInt();
// Check if the number is positive, negative, or zero
if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
scanner.close();
}
}

//import java.util.Scanner;
//
//public class ScannerInput {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer here: ");
//        int number = scanner.nextInt();
//
//        if (number > 0) {
//            System.out.println(number + " is positive");
//        } else if (number < 0) {
//            System.out.println(number + " is negative");
//        } else {
//            System.out.println(number + " is zero");
//        }
//
//        scanner.close();
//    }
//}
