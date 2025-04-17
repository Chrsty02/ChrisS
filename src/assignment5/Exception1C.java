package assignment5;

public class Exception1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		// ArrayIndexOutOfBoundsException
		int[] a = new int[6];
		int seventhElement = a[7];
		System.out.println("Array Length is : " + seventhElement);
		} catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println("Error message is " + e1);
		} finally {
		System.out.println("Finally block is always executed");
		}
		}
		}