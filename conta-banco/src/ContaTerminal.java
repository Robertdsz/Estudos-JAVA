import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BANCO TERMINAL");
		System.out.print("Digite o n�mero da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.print("Digite a ag�ncia: ");
		String agencia = sc.next();
		
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Digite o valor do saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco, sua ag�ncia � %s, conta %d e seu saldo R$ %.2f j� est� dispon�vel para saque.", nome, agencia, numeroDaConta, saldo);
		
		sc.close();
	}

}
