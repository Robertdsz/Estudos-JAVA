import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}
			else {
				System.out.println("Terceiro Quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Valores inválidos!");
		
		sc.close();
	}

}
