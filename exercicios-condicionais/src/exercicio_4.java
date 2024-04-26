import java.util.Scanner;
public class exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int HoraInicial = sc.nextInt();
		int HoraFinal = sc.nextInt();
		int duracao;
		
		if (HoraInicial < HoraFinal) {
			duracao = HoraFinal - HoraInicial;
		}
		else {
			duracao = 24 - HoraInicial + HoraFinal;
		}
		System.out.printf("O JOGO DUROU %d HORAS", duracao);
		sc.close();
	}

}
