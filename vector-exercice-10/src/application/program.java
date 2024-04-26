package application;

import java.util.Locale;
import java.util.Scanner;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] vectName = new String[n];
		double[] vectNote1= new double[n];
		double[] vectNote2 = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:%n", (i+1));
			sc.nextLine();
			vectName[i] = sc.nextLine();
			vectNote1[i] = sc.nextDouble();
			vectNote2[i] = sc.nextDouble();
		}
		System.out.println();
		System.out.println("Alunos Aprovados:");
		for(int i=0; i<n; i++) {
			if ((vectNote1[i] + vectNote2[i])/2 >= 6.0) {
				System.out.println(vectName[i]);
			}
			sc.close();
		}
		}

}
