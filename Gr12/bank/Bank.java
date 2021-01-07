/*
 * Bank Assignment - displays account info, withdraw & deposit money and change address
 * Kalvin Kao
 * ICS4U
 * October 9th 2012
 */

package bank;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
	public String street, city, state, zip;

	public static void main(String[] args) {

		Account munozAccount = new Account(250, "Maria", "Munoz",
				"110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(munozAccount);
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: "
				+ money.format(munozAccount.getBalance()));
		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: "
				+ money.format(munozAccount.getBalance()));
		System.out
				.println("Do you want to change your address? (0 = yes, 1 = no)");
		int ok = input.nextInt();

		if (ok == 0) {
			munozAccount.changeAddress();
		} else if (ok == 1) {
			System.out.println("Good bye!");
		}
		input.close();

	}
}
