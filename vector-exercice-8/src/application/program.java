package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS ELEMENTOS TERÁ O VETOR? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("DIGITE UM NÚMERO: ");
			vect[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		int contaPares = 0;
		
		for(int i=0; i<n; i++) {
			if (vect[i] %2 == 0) {
				somaPares += vect[i];
				contaPares += 1;
			}
		}
		System.out.println();
		if (contaPares == 0) {
			System.out.println("NENHUM NÚMERO PAR!");
		}
		else {
			double mediaPares = (double) somaPares/contaPares;
			System.out.printf("MEDIA DOS PARES: %.1f", mediaPares);
		}
		
		sc.close();
	}

}
