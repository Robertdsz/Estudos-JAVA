package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas e de colunas respectivamente: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] vect = new int[l][c];
		
		System.out.println("Digite os números da matriz abaixo: ");
		
		for(int i=0; i<vect.length; i++) {
			for(int j=0; j<vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite o número que deseja encontrar: ");
		int search = sc.nextInt();
		for(int i=0; i<vect.length; i++) {
			for(int j=0; j<vect[i].length; j++) {
				if(vect[i][j] == search) {
					System.out.println("POSITION: "+ i + "," + j);
					if(i > 0) {
						System.out.println("UP: " + vect[i-1][j]);
					}
					if (j < vect[i].length-1) {
						System.out.println("RIGHT: " + vect[i][j+1]);	
					}
					if (i < vect.length-1) {
						System.out.println("DOWN: " + vect[i+1][j]);	
					}
					if (j > 0) {
						System.out.println("LEFT: " + vect[i][j-1]);							
					}
				}
			}
		}
		sc.close();
	}

}
