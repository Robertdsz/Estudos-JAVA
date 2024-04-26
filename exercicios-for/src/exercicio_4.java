import java.util.Scanner;
import java.util.Locale;
public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.print("Digite o número de divisões a serem digitadas: ");
		int cont = sc.nextInt();
		
		for (int i=0; i<cont; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("Divisão impossível!");
			}
			else {
				double div =(double) x/y;
				System.out.printf("%d : %d = %.1f%n",x,y,div);
			}
		}
		sc.close();
	}

}
