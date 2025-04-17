package assignment4;

public class Interface1 {

			public interface A{
			int a= 10;
			int b = 20;
			
			int sum();
			}
			
			public class B implements A{
				@Override
				public int sum() {
					return a+b;
				}
				
			public class Main{
				public static void main(String[] args) {
					//TODO Auto generated method stub
					
					B interfaceDemonstartion = new B();
					System.out.println("The sum of a and b in interface is:" + interfaceDemonstartion.sum());
	}
			}
				