package casoDeTesteEmpregado;

public class Vendedor {
	private double horaextra;
	private double comissao;
	private double adicionalNoturno;
	private double salHora;
	
	public static double calcularComissao(double salHora, double valorVenda) {
		return salHora * valorVenda;
	}
	
	public static double calcularHoraExtra(double quantidadeHoras, double salHora) {
		return quantidadeHoras * salHora;
	}
	
	public static double calcularAdicionalNoturno(double quantidadeHoras, double salHora) {
		return quantidadeHoras * (salHora * 0.2);
	}
	
	public static String vendedorDoMes(double comissao, double comissao2, double comissao3) {
        if (comissao > comissao2 && comissao > comissao3) {
            return "Vendedor1 é o vendedor do mês!";
        } else if (comissao2 > comissao && comissao2 > comissao3) {
            return "Vendedor2 é o vendedor do mês!";
        } else if (comissao3 > comissao && comissao3 > comissao2) {
            return "Vendedor3 é o vendedor do mês!";
        }
          else {
            return "Nenhum vendedor é o vendedor do mês!";
        }
	}
}
