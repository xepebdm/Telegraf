package com.puc.telegraf.matriculas.operacoes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OperacoesTest {

	private Operacoes op = new Operacoes();
	
	@Test
	public void testBasicoIgualE() {
		String digito = op.definiDigito("9876");
		assertEquals("E", digito);
	}
	
	@Test
	public void testBasicoIgual0() {
		String digito = op.definiDigito("9992");
		assertEquals(String.valueOf(0), digito);
	}
	
	@Test
	public void testVerificarDIgitoValidoE() {
		assertTrue(op.verificarMatricula("9876-E"));
	}
	
	@Test
	public void testVerificarDIgitoValidoD() {
		assertTrue(op.verificarMatricula("1790-D"));
	}
	
	@Test
	public void testVerificarDIgitoValidoC() {
		assertTrue(op.verificarMatricula("5289-C"));
	}
	
	@Test
	public void testVerificarDIgitoValidoF() {
		assertTrue(op.verificarMatricula("7831-F"));
	}

	@Test
	public void testVerificarDigitoinvalido() {
		assertFalse(op.verificarMatricula("9992-0"));
	}
	
	@Test
	public void testVerificarDigitoinvalido8() {
		assertFalse(op.verificarMatricula("0902-8"));
	}
	
	@Test
	public void testVerificarDigitoinvalido2() {
		assertFalse(op.verificarMatricula("0924-2"));
	}
	
	@Test
	public void testVerificarDigitoinvalido9() {
		assertFalse(op.verificarMatricula("5548-9"));
	}
	
}
