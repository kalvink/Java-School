
import java.util.Scanner;

/* MethodTask1
 * Kalvin Kao
 * ICS4U
 * September 14th 2012
 * 
 * A java program with the following methods,       
 * ArRandom – to fill in an array with integer numbers
 * ArPrint – to print an array in a row
 * ArMax – to find max element in an array
 * ArMin - to find min element in an array
 * ArReverse – to reverse all elements in an array
 * ArSearch – to find if a number is in an array
 * 
 */

public class MethodTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length for the array.");
		int size = input.nextInt();
		System.out.println("Enter the number to check in the array.");
		int b = input.nextInt();
		input.close();
		int B[] = new int[size];
		B = ArRandom(size);
		ArPrint(B, size);
		System.out.println("\nThe maximum element in the array is: "
				+ ArMax(B, size));
		System.out.println("The minimum element in the array is: "
				+ ArMin(B, size));
		ArReverse(B, size);
		System.out.println("\nThe number of times " + b
				+ " is found in the array is: " + ArSearch(B, size, b));

	}

	/**
	 * ArRandom
	 * Purpose: to fill in an array with integer numbers
	 * Accepts: an array, and integer
	 * Returns: an array (full of random numbers)
	 */


	public static int[] ArRandom(int a) {
		int[] Array = new int[a];
		for (int i = 0; i < a; i++) {
			Array[i] = (int) (Math.random() * ((20 - 1 + 1) + 1));
		}
		return Array;

	}

	/**
	 * ArPrint
	 * Purpose: to print an array in a row
	 * Accepts: an array, and integer
	 * Returns: nothing
	 */


	public static void ArPrint(int array[], int a) {
		for (int i = 0; i < a; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * ArMax
	 * Purpose: to find max element in an array
	 * Accepts: an array, and integer
	 * Returns: an integer (the maximum in the array)
	 */


	public static int ArMax(int array[], int a) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * ArMin
	 * Purpose: to find min element in an array
	 * Accepts: an array, and integer
	 * Returns: an integer (the minimum in the array)
	 */


	public static int ArMin(int array[], int a) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * ArReverse
	 * Purpose: to reverse all elements in an array
	 * Accepts: an array and integer
	 * Returns: nothing
	 */

	public static void ArReverse(int array[], int a) {
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * ArSearch
	 * Purpose: to find if a number is in the array 
	 * Accepts: an array, and two integers
	 * Returns: an integer (amount of times the number is found)
	 */

	public static int ArSearch(int array[], int a, int b) {
		int search = 0;
		for (int i = 0; i < a; i++) {
			if (array[i] == b)
				search++;
		}
		return search;
	}

}