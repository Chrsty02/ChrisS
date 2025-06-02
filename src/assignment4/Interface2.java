package assignment4;

//Interface C
interface C {
 int a = 10;
 int b = 20;

 void add();
}

//Interface D
interface D {
 int x = 30;
 int y = 40;

 void mul();
}

//Class Calculation implementing both interfaces C and D
class Calculation implements C, D {
 public void add() {
     int result = a + b;
     System.out.println("Addition of a and b: " + result);
 }

 public void mul() {
     int result = x * y;
     System.out.println("Multiplication of x and y: " + result);
 }
}

//Main class
public class Interface2 {
 public static void main(String[] args) {
     Calculation calculation = new Calculation();
     calculation.add(); // Calls the add method
     calculation.mul(); // Calls the mul method
 }
}

