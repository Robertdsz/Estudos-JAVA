package casoDeTesteEmpregado;

import static org.junit.Assert.*;


import org.junit.Test;

public class TesteVendedor {
	@Test
	public void testeCalcularComissao() {
		Vendedor vendedor = new Vendedor();
		assertEquals("Teste1", 150, Vendedor.calcularComissao(10, 15),0);
	}
	@Test
	public void testeCalcularHoraExtra() {
		Vendedor vendedor = new Vendedor();
		assertEquals("Teste2", 1200, Vendedor.calcularHoraExtra(30, 40),0);
	}
	@Test
	public void testeCalcularAdicionalNoturno() {
		Vendedor vendedor = new Vendedor();
		assertEquals("Teste3", 200, Vendedor.calcularAdicionalNoturno(20, 50),0);
	}
	@Test
	public void testeVendedorDoMes() {
		assertTrue("Teste4", "Vendedor2 é o vendedor do mês!" == Vendedor.vendedorDoMes(1100, 2000, 1900));
	}


}
