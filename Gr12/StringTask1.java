import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* StringTask1
 * Kalvin Kao
 * ICS4U
 * September 17th 2012
 * 
 * A java program that will read a text file with a 6 digit number
 *  and find the sum of the first three digits and the sum of the last 
 * three digits. If they equal the same, the user has won the lottery,
 * if not they have lost.
 * 
 */
public class StringTask1 {

	public static void main(String[] args) throws IOException {
		String s;
		int digit1, digit2, digit3, digit4, digit5, digit6, sum, sum2;
		Scanner input = new Scanner(new FileReader("Gr12/dataTicket.txt"));
		s = input.nextLine();
		input.close();
		
		digit1 = Integer.parseInt(s.substring(0, 1));
		digit2 = Integer.parseInt(s.substring(1, 2));
		digit3 = Integer.parseInt(s.substring(2, 3));
		digit4 = Integer.parseInt(s.substring(3, 4));
		digit5 = Integer.parseInt(s.substring(4, 5));
		digit6 = Integer.parseInt(s.substring(5, 6));
		sum = digit1 + digit2 + digit3;
		sum2 = digit4 + digit5 + digit6;
		System.out.println("sum of first 3 digits is " + sum);
		System.out.println("sum of last 3 digits is "+ sum2);
		if (sum == sum2){
			System.out.println("Congratulations, you have won the lottery!");}
			else {
				System.out.println("You have lost the lottery.");
		}
	}
}
