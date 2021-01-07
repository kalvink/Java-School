package exercises.Gr11.src;


import java.io.*;

/**
 * Nim generates random number of stones between 15 and 30. Player and a
 * computer alternate turns and on each turn may take either 1, 2, or 3 stones
 * from the pile. The player forced to take the last stone loses.
 * 
 * @author Kalvin Kao
 * @version 1.0, April 18th, 2012
 */

public class Nim {

	public static void main(String[] args) throws IOException {
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(inStream);
		String data;
		int playerloss;
		int comploss;

		for (int stone = 15 + (int) ((Math.random() * 16)); stone >= 0;) {
			System.out.println("There are " + stone + " stones.");
			System.out.println("How many stones would you like to take?");
			data = stdin.readLine();
			playerloss = Integer.parseInt(data);
			while (Nim.validEntry(playerloss, stone) == false) {
				System.out.println("Please enter an appropriate amount:");
				data = stdin.readLine();
				playerloss = Integer.parseInt(data);
			}

			System.out.println("\nYou have taken " + playerloss + " stones.");
			stone = stone - playerloss;
			if (stone <= 0)
				System.out.println("Computer has beaten the player.");
			int computerloss = Nim.drawStone();
			stone = stone - computerloss;
			System.out.println("Computer has taken " + computerloss + "stones.\n");
			if (stone <= 0)
				System.out.println("Player has beaten the computer.");
		}
	}

	public static int drawStone() {
		int computerloss = 1 + (int) ((Math.random() * 3));
		return computerloss;
	}

	public static boolean validEntry(int loss, int stone) {
		

		return loss <= 3 && loss <= stone;
	}
}