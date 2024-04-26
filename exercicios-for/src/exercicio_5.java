import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		int fat = 1;
		
		for (int i=1; i<=num; i++) {
			fat *= i;
		}
		System.out.println(fat);
		sc.close();
	}

}
