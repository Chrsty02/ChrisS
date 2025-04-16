package assignment5;

public class Exception2A {

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.FileNotFoundException;
	public class Exception2A {
	public static void main(String[] args) throws InterruptedException, IOException {
	FileInputStream file = new FileInputStream("input.txt");
	file.read();
	Thread.sleep(3000);
	}
	}
