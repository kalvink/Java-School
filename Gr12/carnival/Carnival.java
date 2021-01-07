/*
 * Carnival.java
 * Kalvin Kao
 * ICS4U
 * October 19th 2012
 */

package carnival;

public class Carnival {
	public static void main(String[] args) {

		GameBooth balloonDartToss = new GameBooth(2, "tiger plush", "sticker");
		GameBooth ringToss = new GameBooth(2, "bear keychain", "pencil");
		GameBooth breakAPlate = new GameBooth(1.5, "pig plush",
				"plastic dinosaur");
		GameBooth ballToss = new GameBooth(1, "basket ball", "toy car");
		GameBooth duckGame = new GameBooth(2, "dog plush", "barbie doll");

		Player shonda = new Player(5); // $5 spending money
		Player luis = new Player(3); // $3 spending money
		Player bob = new Player(6); // $6 spending money
		Player sally = new Player(4); // $4 spending money
		Player kalvin = new Player(10); // $10 spending money

		System.out.print("Shonda goes to Balloon Dart Toss. ");
		System.out.println(shonda.play(balloonDartToss));
		System.out.println(shonda.toString());

		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(luis.play(ringToss));
		System.out.println(luis.toString());

		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(shonda.play(ringToss));
		System.out.println(shonda.toString());

		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play(breakAPlate));
		System.out.println(luis.toString());

		System.out.print("Bob goes to Ball Toss. ");
		System.out.println(bob.play(ballToss));
		System.out.println(bob.toString());

		System.out.print("Kalvin goes to Duck Game. ");
		System.out.println(kalvin.play(duckGame));
		System.out.println(kalvin.toString());

		System.out.print("Sally goes to Duck Game. ");
		System.out.println(sally.play(duckGame));
		System.out.println(sally.toString());

		System.out.print("Kalvin goes to Ring Toss. ");
		System.out.println(kalvin.play(ringToss));
		System.out.println(kalvin.toString());

		System.out.print("Bob goes to Balloon Dart Toss. ");
		System.out.println(bob.play(balloonDartToss));
		System.out.println(bob.toString());

		System.out.print("Sally goes to Ring Toss. ");
		System.out.println(sally.play(ringToss));
		System.out.println(sally.toString());

		// Displays all the prizes won
		System.out.println("Shonda won: " + shonda.showPrizes());
		System.out.println("Luis won: " + luis.showPrizes());
		System.out.println("Bob won: " + bob.showPrizes());
		System.out.println("Sally won: " + sally.showPrizes());
		System.out.println("Kalvin won: " + kalvin.showPrizes());

		// Displays total number of prizes won
		System.out.println(GameBooth.prizesAwarded());
	}
}