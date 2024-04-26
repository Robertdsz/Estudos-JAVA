package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double somaNumeros = 0;
		double mediaNumeros = 0;
		
		for(int i=0; i<n; i++) {
			somaNumeros += vect[i];
		}
		
		mediaNumeros = somaNumeros/n;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR: %.3f%n", mediaNumeros);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for(int i=0; i<n; i++) {
			if(vect[i] < mediaNumeros) {
				System.out.printf("%.1f%n",vect[i]);
			}
		}
		
		sc.close();
	}

}
