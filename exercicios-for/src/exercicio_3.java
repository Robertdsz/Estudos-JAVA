import java.util.Scanner;
import java.util.Locale;
public class exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de casos: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a*2.0 + b*3.0 + c*5.0)/10;
			
			System.out.printf("%.1f%n",media);
		}
		sc.close();
	}

}
