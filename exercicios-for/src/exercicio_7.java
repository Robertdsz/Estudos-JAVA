import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		double num1, num2;
		for (double i=1; i<=num; i++) {
			num1 = Math.pow(i,2);
			num2 = Math.pow(i,3);
			System.out.printf("%.0f %.0f %.0f%n", i, num1, num2);
		}
		sc.close();
	}

}
