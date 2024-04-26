import java.util.Scanner;
public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valor;
		
		if(codigo == 1) {
			valor = (double) quantidade * 4.0;
		}
		else if (codigo == 2) {
			valor = (double) quantidade * 4.50;
		}
		else if (codigo == 3) {
			valor = (double) quantidade * 5.0;
		}
		else if (codigo == 4) {
			valor = (double) quantidade * 2.0;
		}
		else {
			valor = (double) quantidade * 1.50;
		}
		
		System.out.printf("TOTAL À PAGAR: R$%.2f", valor);
		sc.close();
	}

}
