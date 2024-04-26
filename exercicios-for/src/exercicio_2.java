import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números serão digitados? ");
		int contador = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=0; i<contador; i++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.printf("%d in%n%d out", in, out);
		sc.close();
	}
}
