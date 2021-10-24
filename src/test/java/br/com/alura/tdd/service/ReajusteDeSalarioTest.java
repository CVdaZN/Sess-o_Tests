package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReajusteDeSalarioTest {

	private ReajusteDeSalario rstest;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		this.rstest = new ReajusteDeSalario();
		this.funcionario = new Funcionario("Caio", LocalDate.now(), new BigDecimal("10000.00"));

	}

	@Test
	public void reajusteDe3porPorcentoQuantoDesempenhoForADesejar() {
		rstest.concederReajuste(funcionario, Desempenho.A_Desejar);

		assertEquals(new BigDecimal("10000.00"), rstest);
	}

	@Test
	public void reajusteDe15PorcentoQuantoDesempenhoForOtimo() {
		inicializar();
		rstest.concederReajuste(funcionario, Desempenho.Otimo);

		assertEquals(new BigDecimal("11500.00"), rstest);
	}

	@Test
	public void reajuste20DePorcentoQuantoDesempenhoForBom() {
		inicializar();
		rstest.concederReajuste(funcionario, Desempenho.Otimo);

		assertEquals(new BigDecimal("11500.00"), rstest);
	}

}