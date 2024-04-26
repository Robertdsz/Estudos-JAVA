package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pares = 0;
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS PARES:");
		for (int i=0; i<n; i++) {
			if (vect[i] %2 == 0) {
				System.out.printf(" %d",vect[i]);
				pares += 1;
			}
		}
		System.out.println();
		System.out.printf("%nQUANTIDADE DE PARES: %d", pares);
		
		sc.close();
	}

}
