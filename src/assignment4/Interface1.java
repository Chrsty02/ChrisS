package assignment4;

//Define the interface A
interface A {
 int a = 5; // By default, interface variables are public, static, and final
 int b = 10;

 int sum(); // Method to be implemented by the class
}

//Class B implements interface A
class B implements A {
 // Implementing the sum method
 public int sum() {
     return a + b;
 }
}

//Main class to test the implementation
public class Interface1 {
 public static void main(String[] args) {
     B b = new B();
     int result = b.sum();
     System.out.println("The sum of a and b is: " + result);
 }
}
