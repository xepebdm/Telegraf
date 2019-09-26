package com.puc.telegraf.matriculas.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MatriculasServiceTest {

	@Autowired
	private MatriculasService service;

	private List<String> matriculasSemDigito = Arrays.asList("9876", "1790", "3186", "4573", "5732", "5752", "8381","9369", "9639", "9854");
	private List<String> matriculasComDigito = Arrays.asList("0902-8", "0924-2", "1790-D", "5289-C", "5339-0", "5548-9","7076-4", "7831-F", "9343-C", "9734-B");

	@Test
	void testAdicionaDigitoNaMatricula() {
		List<String> lista = service.adicionaDigito(matriculasSemDigito);
		assertEquals("9876-E", lista.get(0));
	}

	@Test
	void testAdicionaDigitoNaMatricula2() {
		List<String> lista = service.adicionaDigito(matriculasSemDigito);
		assertEquals("1790-C", lista.get(1));
	}
	
	@Test
	public void testComDigitoVerificadorVerdadeiro() {
		List<String> lista = service.verificarMatricula(matriculasComDigito);
		assertTrue(lista.get(2).contains("verdadeiro"));
	}
	
	@Test
	public void testComDigitoVerificadorFalso() {
		List<String> lista = service.verificarMatricula(matriculasComDigito);
		assertTrue(lista.get(0).contains("falso"));
	}

}
