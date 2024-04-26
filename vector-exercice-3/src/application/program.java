package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double mediaAltura = 0.0;
		double menoresDezesseis = 0.0;
		
		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		double[] vectAltura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados %da pessoa:%n", (i+1));
			System.out.print("NOME: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();
			System.out.print("IDADE: ");
			vectIdade[i] = sc.nextInt();
			System.out.print("ALTURA: ");
			vectAltura[i] = sc.nextDouble();
			
			mediaAltura += vectAltura[i];
			
			if (vectIdade[i] < 16) {
				menoresDezesseis += 1;
			}
		}
		double porcentMenoresDezesseis = (menoresDezesseis*100)/n;
		
		System.out.println();
		System.out.printf("ALTURA MÉDIA: %.2fm%n", (mediaAltura/n));
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f%%\n",porcentMenoresDezesseis);
		
		for (int i=0; i<n; i++) {
			if(vectIdade[i] < 16) {
				System.out.println(vectNome[i]);
			}
		}
		
		sc.close();
		
	}

}
