package exercises.Gr11.src;

import java.io.IOException;

/**
 * PerfectInteger will displays all perfect integers up to 100. A perfect
 * integer is a number which is equal to the sum of all its factors except
 * itself.
 * 
 * @author Kalvin Kao
 * @version 1.0 April 18th, 2012
 */

public class PerfectIntegers {
	public static void main(String[] args) {
		int remainder = 0;
		int sum = 0;
		for (int starting = 1; starting <= 100; starting++) {
			for (int factor = 1; factor < starting; factor++) {
				remainder = starting % factor;
				if (remainder == 0)
					sum = sum + factor;
			}

			if (sum == starting) {
				System.out.println("Number " + starting + " is an perfect integer.");
			}
			sum = 0;
		}
	}
}
