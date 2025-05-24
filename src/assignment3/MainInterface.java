package assignment3;

//Main class to test the implementation
public class MainInterface {
public static void main(String[] args) {
   Calculation calculation = new Calculation();

   // Calling add method
   System.out.println("The addition of a and b in interface A is: " + calculation.add());

   // Calling multiply method
   System.out.println("The multiplication of x and y in interface B is: " + calculation.multiply());
}
}