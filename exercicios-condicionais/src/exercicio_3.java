import java.util.Scanner;
public class exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero_1 = sc.nextInt();
		int numero_2 = sc.nextInt();
		
		if (numero_1 % numero_2 == 0 || numero_2 % numero_1 == 0) {
			System.out.println("MULTIPLOS");
		}
		else {
			System.out.println("NÃO MULTIPLOS");
		}
		sc.close();
	}

}
