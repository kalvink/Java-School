package class_and_objects;

public class TestPerson {
	public static void main(String[] args) {

		Person kalvin = new Person("Kalvin", 17);
		Person bob = new Person("Bob", 18);
		Person john = new Person("John", 26);

		System.out.println("Total number of months in your life is "
				+ kalvin.monthspassed() + "\n");
		if (kalvin.isAdult()) {
			System.out.println("You can buy a drink in LCBO!");
		} else {
			System.out.println("Sorry, you can't buy a drink in LCBO!");
			kalvin.grow();
			System.out.println("After few years...");
			System.out.println("Total number of months in your life is "
					+ kalvin.monthspassed() + "\n");
		}

		System.out.println("Total number of months in your life is "
				+ bob.monthspassed() + "\n");
		if (bob.isAdult()) {
			System.out.println("You can buy a drink in LCBO!");
		} else {
			System.out.println("Sorry, you can't buy a drink in LCBO!");
			bob.grow();
			System.out.println("After few years...");
			System.out.println("Total number of months in your life is "
					+ bob.monthspassed() + "\n");
		}

		System.out.println("Total number of months in your life is "
				+ john.monthspassed() + "\n");
		if (john.isAdult()) {
			System.out.println("You can buy a drink in LCBO!");
		} else {
			System.out.println("Sorry, you can't buy a drink in LCBO!");
			john.grow();
			System.out.println("After few years...");
			System.out.println("Total number of months in your life is "
					+ john.monthspassed() + "\n");
		}
	}
}
