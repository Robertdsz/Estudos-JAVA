package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee x;
		x = new employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.printf("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+ x);
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: "+ x);
		
		sc.close();
	}

}
