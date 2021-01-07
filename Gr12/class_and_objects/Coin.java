package class_and_objects;

public class Coin {

	private int faceUp;

	/**
	 * Flips the coin by changing the value 0 / 1 randomly. pre: none post: Face
	 * of coin is changed.
	 */

	public void flipCoin() {
		faceUp = (int) (Math.random() * ((1 - 0 + 1) + 0));

	}

	/**
	 * Shows the value of coin (head/tail) pre: none post: The face of the coin
	 * has been returned.
	 * 
	 */

	public int showFace() {
		return faceUp;
	}
}