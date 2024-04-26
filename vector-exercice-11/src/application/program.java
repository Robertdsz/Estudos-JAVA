package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double shorterHeight, greaterHeight, heightTotalWomen = 0.0, averageHeightWomen;
		int quantityWomen = 0, quantityMen = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] vectHeight = new double[n];
		char[] vectGender = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("ALTURA DA %da PESSOA: ",(i+1));
			vectHeight[i] = sc.nextDouble();
			System.out.printf("GÊNERO DA %da PESSOA: ",(i+1));
			vectGender[i] = sc.next().charAt(0);
		}
		
		shorterHeight = vectHeight[0];
		greaterHeight = vectHeight[0];
		for(int i=0; i<n; i++) {
			if(vectHeight[i] < shorterHeight) {
				shorterHeight = vectHeight[i];
			}
			else if(vectHeight[i] > greaterHeight) {
				greaterHeight = vectHeight[i];
			}
		}
		for(int i=0; i<n; i++) {
			if(vectGender[i] == 'M') {
				quantityMen += 1;
			}
			else {
				quantityWomen += 1;
				heightTotalWomen += vectHeight[i];
			}
		}
		
		averageHeightWomen = heightTotalWomen/quantityWomen;
		
		System.out.printf("MENOR ALTURA: %.2f%n", shorterHeight);
		System.out.printf("MAIOR ALTURA: %.2f%n", greaterHeight);
		System.out.printf("MÉDIA DAS ALTURAS DAS MULHERES: %.2f%n", averageHeightWomen);
		System.out.printf("NÚMERO DE HOMENS: %d%n", quantityMen);
		
		sc.close();
	}

}