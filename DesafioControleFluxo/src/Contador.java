import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero:");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo n�mero:");
		int parametroDois = sc.nextInt();
	}

}
