package assignment5;

public class Exception1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		// NullPointerException
		int a[] = null;
		int arrayLength = a.length;
		System.out.println("Array Length is : " + arrayLength);
		} catch (NullPointerException e1) {
		System.out.println("Error message is " + e1);
		} finally {
		System.out.println("Finally block is always executed");
		}
	}
}
