import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int parametroDois = sc.nextInt();
		sc.close();
		try

		{
			contar(parametroUm, parametroDois);
		} 
		catch (ParametrosInvalidosException exception) {
			System.out.println("O 2� par�metro deve ser maior que o 1�!");
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O 2� par�metro deve ser maior que o 1�!");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i<= contagem; i++) {
			System.out.println("Imprimindo o n�mero " + i);
		}
	}
}

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super(message);
	}
}