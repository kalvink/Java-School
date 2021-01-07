package array2D;


/*
 * Task 3. 
 * Generates 2D array with random numbers and finds and shows the max number in the array and the number of odd numbers in the array.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task3 {
	public static void main(String[] args) {
		int[][] numArray = new int[6][4];
		int max = 0;
		int odd = 0;

		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 4; k++) {
				numArray[i][k] = (int) (Math.random() * (11) + 5); //the numbers in the array range from 5 - 15
				System.out.print(numArray[i][k] + " ");
			}
			System.out.println(" ");
		}
		// search numbers for the max
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 4; k++) {

				if (max < numArray[i][k])
					max = numArray[i][k];
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 4; k++) {

				if (numArray[i][k] % 2 == 1)
					odd++;
			}
		}
		System.out.println("The max element in the array is: " + max);
		System.out
				.println("The number of odd elements in the array is: " + odd);
	}
}
