package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangle  x;
		x = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		System.out.printf("AREA = %.2f%n"
				+ "PERIMETER = %.2f%n"
				+ "DIAGONAL = %.2f", area, perimeter, diagonal);
		sc.close();
	}

}
