package array2D;


/*
 * Task 4. 
 * Generates 2D array with random numbers and finds and shows the range of elements in each row.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task4 {
	public static void main(String[] args) {
		int[][] numArray = new int[5][7];
		int min = 0;
		int max = 0;

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 7; k++) {
				numArray[i][k] = (int) (Math.random() * ((9 - 1 + 1) + 1));
				// the numbers in array range from 1-9
				System.out.print(numArray[i][k] + " ");
			}
			System.out.println();

		}
		for (int i = 0; i < 5; i++) {
			max = 0;
			min = numArray[i][0];
			for (int k = 0; k < 7; k++) {
				if (max < numArray[i][k])
					max = numArray[i][k];

				if (min > numArray[i][k])
					min = numArray[i][k];

			}
			System.out.println("Range of elements in row " + i + " is " + min
					+ " - " + max);

		}
	}
}