package bank;

public class Customer {
	private String firstName, lastName, street, city, state, zip;

	/**
	 * constructor pre: none post: A Customer object has been created. Customer
	 * data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s,
			String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}

	/**
	 * Change the city. pre: The city post: The city
	 */
	public static String changeCity(String c) {
		String city = c;
		return city;
	}

	/**
	 * Change the street. pre: The street post: The street
	 */
	public static String changeStreet(String s) {
		String street = s;
		return street;
	}

	/**
	 * Change the state. pre: The state post: The state
	 */
	public static String changeState(String s) {
		String state = s;
		return state;
	}

	/**
	 * Change the state. pre: The state post: The state
	 */
	public static String changeZip(String z) {
		String zip = z;
		return zip;
	}

	/**
	 * Returns a String that represents the Customer object. pre: none post: A
	 * string representing the Account object has been returned.
	 */
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + " " + zip + "\n";
		return (custString);
	}
}