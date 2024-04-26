package application;

import java.util.Locale;
import java.util.Scanner;

import entities.client;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		client client = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new client(holder, number, initialDeposit);
		}
		else if (response == 'n' || response == 'N') {
			client = new client(holder, number);
		}
		
		System.out.println();
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(client);
		
		sc.close();
	}

}
