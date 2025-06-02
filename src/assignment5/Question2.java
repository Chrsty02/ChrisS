package assignment5;

import java.io.IOException;

public class Question2 {

    // Method that throws a checked exception
    public static void methodThatThrows() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    // Method that handles the exception
    public static void handleException() {
        try {
            methodThatThrows();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
