package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.print("VALORES =");
		
		for (int i=0; i<n; i++) {
			System.out.printf(" %.1f", vect[i]);
		}
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}
