package class_and_objects;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	int months;
	Scanner input = new Scanner(System.in);

	public Person(String myName, int myAge) {
		name = myName;
		age = myAge;
	}

	public void grow() {
		age++;
	}
	
	public boolean isAdult() {
		return age > 21;
	}
	
	public int monthspassed() {
		System.out.println("How many months passed from your previous birthday?");
		months = input.nextInt();		
		return ((age*12)+months);

	}
}
