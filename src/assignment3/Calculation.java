package assignment3;

//Class implementing both interfaces
public class Calculation implements InterfaceA, InterfaceB {

 // Implementing add method from InterfaceA
 @Override
 public int add() {
     return a + b;
 }

 // Implementing multiply method from InterfaceB
 @Override
 public int multiply() {
     return x * y;
 }
}

