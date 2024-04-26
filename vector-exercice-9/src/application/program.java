package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você irá digitar? ");
		int n = sc.nextInt();
		
		String[] vectNome = new String[n];
		int[] vectIdade = new int [n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n",(i+1));
			System.out.print("NOME: ");
			sc.nextLine();
			vectNome[i] = sc.nextLine();
			System.out.print("IDADE: ");
			vectIdade[i] = sc.nextInt();
		}
		
		int posicao = 0;
		int maiorIdade = 0;
			
		for(int i=0; i<n; i++) {
			if(vectIdade[i] > maiorIdade) {
				maiorIdade = vectIdade[i];
				posicao = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s",vectNome[posicao]);
		
		sc.close();
	}

}
