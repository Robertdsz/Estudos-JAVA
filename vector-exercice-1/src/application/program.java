package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vocÊ vai digitar? ");
		int n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i=0; i<n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
