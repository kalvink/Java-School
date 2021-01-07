package array2D;


/*
 * Task 2. 
 * Generates 2D array with random numbers and finds and shows the sum of the elements in each row.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task2 {
	public static void main(String[] args) {
		int[][] numArray = new int[5][7];
		int sum;

		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int k = 0; k < 7; k++) {
				numArray[i][k] = (int) (Math.random() * ((9 - 1 + 1) + 1)); //the numbers in array range from 1-9

				System.out.print(numArray[i][k] + " ");
			}
			System.out.println();

		}
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int k = 0; k < 7; k++) {

				sum = sum + numArray[i][k];

			}

			System.out.println("Sum of elements in row " + i + " is " + sum);
		}
	}
}