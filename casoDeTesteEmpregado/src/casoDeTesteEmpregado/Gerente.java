package casoDeTesteEmpregado;

public class Gerente {
	private int premio;
	private double salariohora;
	
	public static double calcularPremio(double comissao) {
		if (comissao > 1000) {
			return 5000;
		}
		else {
			return 0;
		}
}
}