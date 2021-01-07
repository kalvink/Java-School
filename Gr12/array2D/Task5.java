package array2D;


/*
 * Task 5. 
 * Generates 2D array with random numbers and shows the final array and the amount of "5"s in each row.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task5 {
	public static void main(String[] args) {
		int[][] numArray = new int[6][6];
		int five = 0;
		int check = 0;

		do {
			check = 0;
			for (int i = 0; i < 6; i++) {
				for (int k = 0; k < 6; k++) {
					numArray[i][k] = (int) (Math.random() * ((5 - 1 + 1) + 1));
				}
			}
			// the numbers in array range from 0-5
			{
				for (int i = 0; i < 6; i++) {
					for (int k = 0; k < 6; k++) {
						if (numArray[i][k] == 5)
							check++;
					}
				}
			}

		} while (check != 10);

		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 6; k++) {
				System.out.print(numArray[i][k] + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < 6; i++) {
			five = 0;
			for (int k = 0; k < 6; k++) {

				if (numArray[i][k] == 5)
					five++;
			}

			System.out.println("The amount of 5 in row " + i + " is " + five);
		}

	}
}