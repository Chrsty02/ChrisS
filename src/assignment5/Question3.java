package assignment5;

//User-defined exception
class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);
 }
}

public class Question3 {
 // Method that throws the custom exception
 public static void validateAge(int age) throws MyCustomException {
     if (age < 18) {
         throw new MyCustomException("Age is not valid to vote");
     } else {
         System.out.println("Welcome to vote!");
     }
 }

 public static void main(String[] args) {
     try {
         // Test the method with an age that should throw the exception
         validateAge(15);
     } catch (MyCustomException e) {
         System.out.println("Caught the exception: " + e.getMessage());
     }
 }
}
