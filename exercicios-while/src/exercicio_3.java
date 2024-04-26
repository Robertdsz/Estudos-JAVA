import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.printf("Digite um código%n1: Alcool | 2: Gasolina | 3: Diesel | 4: Fim%n");
		int combustivel = sc.nextInt();
		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool += 1;
				combustivel = sc.nextInt();
			}
			else if (combustivel == 2) {
				gasolina += 1;
				combustivel = sc.nextInt();
			}
			else if (combustivel == 3) {
				diesel += 1;
				combustivel = sc.nextInt();
			}
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
