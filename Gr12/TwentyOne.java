/*
 * TwentyOne.java
 * A Blackjack Java application 
 * Kalvin Kao
 * ICS4U
 * September 11th 2012
 */



import java.io.*;
import java.lang.Math;

/*
 * The TwentyOne class initialises the game of Black Jack
 */

public class TwentyOne {
	// start class definition

	// initialise public variables
	public static String nextLine;
	public static int val;
	public static int col;
	public static int i = 0;
	public static boolean play = true;

	// declaring the main method
	public static void main(String[] args) throws IOException {

		// declaring variables
		int cscore = 0;
		int score = 0;
		int comcards = 0;
		System.out.println("Welcome to BlackJack");
		while (play) {
			// loops the game while the variable "play" is true
			int cardnum[];
			int n = 0;
			// a random integer between 0-36
			boolean a, b;
			cardnum = new int[36];
			// initialising an array for card numbers
			for (int i = 0; i < 36; i++)
				cardnum[i] = -1;
			for (int i = 0; i < 36; i++) {
				b = true;
				while (b) {
					n = (int) (Math.random() * 36);
					// set random numbers to variable n
					b = false;
					for (int j = 0; j < i; ++j)
						if (n == cardnum[j]) {
							b = true;
							break;
						}
				}
				cardnum[i] = n; // sets the random number into the array
			}
			int cc[], m;
			cc = new int[7]; // this is the cards for the computer
			m = 0; //
			String cardcolour[] = { "Spades", "Hearts", "Clubs", "Diamonds" };
			String cardname[] = { "6", "7", "8", "9", "10", "Jack", "Queen",
					"King", "Ace" };
			int cardvalue[] = { 6, 7, 8, 9, 10, 10, 10, 10, 11 };
			// different card values (6-11)
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			a = b = true;
			i = cscore = score = comcards = 0;

			while (a || b) {
				if (b) {
					System.out.println("Type hit or stand");
					// prompts the user to type or stand
					nextLine = br.readLine();
					// takes the input of the user into a variable
					if (nextLine.equals("stand"))
						// checks if the variable is equal to stand
						b = false;
					// if the user types "stand" b will be false.
					else if (nextLine.equals("hit")) {
						// otherwise if the user types "hit"
						val = cardnum[i] % 9;
						col = cardnum[i] / 9;
						i++;
						score = cardvalue[val] + score;
						if (score > 21)
							b = false;
						System.out.println("You draw a card");
						System.out.print("You got " + cardname[val] + " of "
								+ cardcolour[col]);
						System.out.println(", your score is " + score);
					}
				}
				if (nextLine.equals("hit") || nextLine.equals("stand")) {
					// checks if the input was hit or stand and draws a card or
					// stands
					if (a) {
						cc[m++] = cardnum[i];
						val = cardnum[i] % 9;
						col = cardnum[i] / 9;
						i++;
						cscore = cardvalue[val] + cscore;
						comcards = comcards + 1;
						System.out.print("Computer draws a card");
						System.out.print(", now it has " + comcards + " card");
						if (comcards == 1)
							System.out.println();
						else
							System.out.println("s");
					}
					if (a == false) {
					} else if (cscore > 15) {
						a = false;
						System.out.println("Computer says stand");
					}
				}
			}
			System.out.print("Computer's cards were: ");
			for (i = 0; i < m; i++) {
				val = cc[i] % 9;
				col = cc[i] / 9;
				System.out.print(cardname[val] + " of " + cardcolour[col]
						+ ", ");
			} // Checks the rules of the games and declares the results of the
				// game
			System.out.println("Computer's score is: " + cscore);
			if (score > 21 && cscore <= 21)
				System.out.println("You bust so computer wins");
			else if (cscore > 21 && score <= 21)
				System.out.println("Computer bust so you win");
			else if (cscore > 21 && score > 21)
				System.out.println("You both bust so it's a tie");
			else if (21 - score > 21 - cscore && cscore <= 21)
				System.out.println("Computer wins");
			else if (21 - cscore > 21 - score && score <= 21)
				System.out.println("You win");
			else
				System.out.println("It's a tie");
			System.out.println("Play again?");
			// asks the user if they want to play again
			nextLine = br.readLine();
			// reads what the user input
			if (nextLine.equals("yes")) {
				// if the user input "yes" it will loop again
			} else if (nextLine.equals("no")) {
				// if the user input "no" it will end the loop by making "play"
				// false.
				play = false;
			}
		} // end of while loop
	} // end main method
} // end class definition
