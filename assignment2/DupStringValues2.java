package assignment2;

	import java.util.HashSet;

	public class DupStringValues2{
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 3};

	        System.out.println("Duplicate elements in the array are:");
	        findDuplicates(array);
	    }

	    public static void findDuplicates(int[] array) {
	        HashSet<Integer> set = new HashSet<>();
	        boolean foundDuplicates = false;

	        for (int i = 0; i < array.length; i++) {
	            if (set.contains(array[i])) {
	                System.out.print(array[i] + " ");
	                foundDuplicates = true;
	            } else {
	                set.add(array[i]);
	            }
	        }

	        if (!foundDuplicates) {
	            System.out.println("No duplicates found.");
	        }
	    }
	}



