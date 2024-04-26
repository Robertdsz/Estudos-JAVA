package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double maiorValor = 0;
		int posicao = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		maiorValor = vect[0];
		
		for (int i=1; i<n; i++) {				
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR: %.1f%n", maiorValor);
		System.out.printf("POSIÇÃO DO MAIOR VALOR: %d", posicao);
		
		sc.close();
	}

}
