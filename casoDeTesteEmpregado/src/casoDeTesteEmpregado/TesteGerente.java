package casoDeTesteEmpregado;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteGerente {

	@Test
	public void testeCalcularPremio() {
		assertEquals("Teste1", 5000, Gerente.calcularPremio(1200),0);
	}
}
