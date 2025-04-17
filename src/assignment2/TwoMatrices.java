package assignment2;

public class TwoMatrices {

	    // Method to add two matrices
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int cols = matrix1[0].length;
	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        return result;
	    }

	    // Method to print a matrix
	    public static void printMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Define two matrices
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        // Add the matrices
	        int[][] result = addMatrices(matrix1, matrix2);

	        // Print the result
	        System.out.println("Resultant Matrix:");
	        printMatrix(result);
	    }
	}
