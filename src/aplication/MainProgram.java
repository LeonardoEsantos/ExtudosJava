package aplication;

import java.util.*;
import entities.Account;

public class MainProgram {

	public static void main(String[] args) {

		String name;
		int number;
		char initDeposit;
		double value = 0;

		Locale.setDefault(Locale.US); //
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		name = sc.nextLine();

		do {
			System.out.print("Is there na initial deposit (y/n)?");
			initDeposit = sc.nextLine().charAt(0);
			if (initDeposit == 'y' || initDeposit == 'Y') {
				System.out.println("Enter initial deposit value: ");
				value = sc.nextDouble();
			} else if (initDeposit == 'n' || initDeposit == 'N') {
				value = 0;
			} else {
				System.out.println("invalid value, enter only Y/y or N/n!");

			}
		} while (initDeposit != 'y' && initDeposit != 'Y' && initDeposit != 'n' && initDeposit != 'N');

		Account account = new Account(number, name, value);

		System.out.println("Account data: ");
		System.out.println(account.toString());

		System.out.println("Enter a deposit value: ");
		value = sc.nextDouble();
		account.Deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		System.out.println("Enter a withdraw value ");
		value = sc.nextDouble();
		account.Withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		sc.close();

	}

}
