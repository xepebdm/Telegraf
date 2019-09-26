package com.puc.telegraf.matriculas.operacoes;

import java.util.Arrays;
import java.util.List;

public class Operacoes {

	private final List<Integer> OPERADORES = Arrays.asList(5, 4, 3, 2);
	private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	@SuppressWarnings("static-access")
	public String definiDigito(String valor) {
		
//		String valor = String.valueOf(integer);
		
		Integer soma =  0;
		
		for(int i = 0; i < OPERADORES.size(); i++) {
			
			int primeiro = Integer.parseInt(String.valueOf(valor.charAt(i)));
			int segundo = OPERADORES.get(i);
			
			soma += Math.multiplyExact(primeiro , segundo);
		}
		
		 return soma.toHexString(soma % 16).toUpperCase();
		
	}
	
	
	public boolean verificarMatricula(String matricula) {
		return ALFABETO.contains(String.valueOf(matricula.charAt(matricula.length() - 1)));
	}

	
}
