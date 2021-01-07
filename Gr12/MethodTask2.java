
import java.util.Scanner;

/* MethodTask2
 * Kalvin Kao
 * ICS4U
 * September 14th 2012
 * 
 * An application that simulates a grade book for a class with 12 students that each have 5 test scores with 4 methods.
 * 
 */

public class MethodTask2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your student number. (1-12)");
		int sn = input.nextInt() - 1;
		System.out.println("Enter your test number. (1-5)");
		int test = input.nextInt() - 1;
		input.close();
		int row = 12;
		int col = 5;
		int sn2 = sn + 1;
		int test2 = test + 1;
		int[][] B = new int[row][col];
		B = getGrades(row, col);
		System.out.println("All the grades in the gradebook.");
		showGrades(B, row, col);
		System.out.println("The average grade of student number " + sn2
				+ " is " + studentAvg(B, sn) + ".");
		System.out.println("The average grade of test number " + test2
				+ " is " + testAvg(B, test) + ".");
	}
	
	/**
	 * getGrades
	 * Purpose: fill the array with random numbers from 20 to 100
	 * Accepts: two integers (row and column)
	 * Returns: an array (full of random numbers from 20 to 100)
	 */
	
	public static int[][] getGrades(int r, int c) {
		int[][] Array = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int k = 0; k < c; k++) {
				Array[i][k] = (int) (Math.random() * (100 - 20 + 1) + 20);
			}
		}
		return Array;
	}
	
	/**
	 * showGrades
	 * Purpose: displays the array with the grades for the class
	 * Accepts: a 2D array and two integers (row and column)
	 * Returns: nothing
	 */

	public static void showGrades(int array[][], int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int k = 0; k < c; k++) {
				System.out.print(array[i][k] + " ");
			}
			System.out.println(" ");

		}
	}
	
	/**
	 * studentAvg
	 * Purpose: average grade for that student
	 * Accepts: a 2D array and one integer (student number)
	 * Returns: an integer (average grade of the student)
	 */

	public static int studentAvg(int[][] b, int r) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += b[r][i];
		}
		return sum / 5;
	}
	
	/**
	 * testAvg
	 * Purpose: average test grade for that test number
	 * Accepts: a 2D array and one integer (test number)
	 * Returns: an integer (average grade of the test)
	 */

	public static int testAvg(int[][] b, int r) {
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			sum += b[i][r];
		}
		return sum / 12;
	}
}
