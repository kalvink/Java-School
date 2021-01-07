package array2D;


/*
 * Task 1. 
 * Generates 2D array with random numbers and finds and shows the number of elements > 10 in the array.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task1 {
	public static void main(String[] args) {
		int[][] numArray = new int[6][4];
		int count = 0;

		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 4; k++) {
				numArray[i][k] = (int) (Math.random() * (11) + 5); //the numbers in the array range from 5 - 15
				System.out.print(numArray[i][k] + " ");
			}
			System.out.println(" ");
		}
		// search numbers > 10 in array
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 4; k++) {

				if (numArray[i][k] > 10)
					count++;
			}
		}
		System.out.println("Number of elements less than ten is: " + count);
	}
}
