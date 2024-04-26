import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		for (int i=1; i<x; i+=2) {
			System.out.println(i);
		}
		sc.close();
	}

}
