import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número:");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo número:");
		int parametroDois = sc.nextInt();
	}

}
