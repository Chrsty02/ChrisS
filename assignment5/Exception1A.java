package assignment5;

public class Exception1A {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub try 
		try {
		//Arithmetic Exception
		int result = 10/2; //Division by zero
		System.out.println("Division value is: " + result);	}
	 catch (ArithmeticException e1) {
		 System.out.println("Error message is" + e1);
	 }
	 finally {
		 System.out.println("Finally block is always executed");
	}
	}
}
