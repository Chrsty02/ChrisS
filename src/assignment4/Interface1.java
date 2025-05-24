package assignment4;

public class Interface1 {

    public interface A {
        int a = 10;
        int b = 20;

        int sum();
    }

    public class B implements A {
        @Override
        public int sum() {
            return a + b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Interface1 outerInstance = new Interface1();
            B interfaceDemonstration = outerInstance.new B();
            System.out.println("The sum of a and b in interface is: " + interfaceDemonstration.sum());
        }
    }
}

			
	
			
				