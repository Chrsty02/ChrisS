package assignment2;

import java.util.*; 
public class GreatestLeastValues { 
	public static void main(String args[]) 
	{ 

		// initializing the ArrayList elements 
		ArrayList<Integer> arr = new ArrayList<>(); 
		arr.add(100); 
		arr.add(251); 
		arr.add(90); 
		arr.add(52); 
		arr.add(75); 
		arr.add(11); 

		int min = arr.get(0); 
		int max = arr.get(0); 

		// store the length of the ArrayList in variable n 
		int n = arr.size(); 

		// loop to find minimum from ArrayList 
		for (int i = 1; i < n; i++) { 
			if (arr.get(i) < min) { 
				min = arr.get(i); 
			} 
		} 

		// loop to find maximum from ArrayList 
		for (int i = 1; i < n; i++) { 
			if (arr.get(i) > max) { 
				max = arr.get(i); 
			} 
		} 

		// The result will be printed 
		System.out.println("Maximum is : " + max); 
		System.out.println("Minimum is : " + min); 
	} 
}
