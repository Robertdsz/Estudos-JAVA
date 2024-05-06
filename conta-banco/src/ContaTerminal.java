import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BANCO TERMINAL");
		System.out.print("Digite o número da conta: ");
		int numeroDaConta = sc.nextInt();
		
		System.out.print("Digite a agência: ");
		String agencia = sc.next();
		
		System.out.print("Digite o nome do cliente: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Digite o valor do saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numeroDaConta, saldo);
		
		sc.close();
	}

}
