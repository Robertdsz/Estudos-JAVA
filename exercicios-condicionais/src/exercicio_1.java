import java.util.Scanner;
public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("Número NEGATIVO");
		}
		else {
			System.out.println("Número POSITIVO");
		}
		sc.close();
	}

}
