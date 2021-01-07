package class_and_objects;

public class TestCoin {
public static void main(String[] args){
	Coin nickel = new Coin();
	
	nickel.flipCoin();
	if (nickel.showFace() == 0) {
		System.out.println("Heads up!");
	} else {
		System.out.println("Tails up!");
	}
}
}
