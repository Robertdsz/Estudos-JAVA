package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("How many employess will be registred?");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employee emp = new employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idSearch = sc.nextInt();
		
		employee emp = list.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This ID does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(employee e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}

}
