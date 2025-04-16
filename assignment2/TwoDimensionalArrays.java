package assignment2;

	public class TwoDimensionalArrays {
	    public static void main(String[] args) {
	        // Define a 2-dimensional array to store the scores of 2 students in 3 papers
	        int[][] scores = {
	            {85, 90, 78}, // Scores of student 1 in papers 1, 2, and 3
	            {92, 88, 95}  // Scores of student 2 in papers 1, 2, and 3
	        };

	        // Calculate the average score for each student
	        double[] averageScores = new double[2];

	        for (int i = 0; i < scores.length; i++) {
	            int total = 0;
	            for (int j = 0; j < scores[i].length; j++) {
	                total += scores[i][j];
	            }
	            averageScores[i] = (double) total / scores[i].length;
	        }

	        // Print the average scores
	        for (int i = 0; i < averageScores.length; i++) {
	            System.out.println("Average score of student " + (i + 1) + ": " + averageScores[i]);
	        }
	    }
	}
