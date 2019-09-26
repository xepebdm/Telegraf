package com.puc.telegraf.matriculas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.puc.telegraf.matriculas.service.MatriculasService;

public class MainTeste {

	public static void main(String[] args) {

		try {

			MatriculasService service = new MatriculasService();
			FileReader arq = new FileReader("matriculasSemDv.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			List<String> lista = new ArrayList<>();

			String linha = lerArq.readLine(); // lê a primeira linha

			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {

				lista.add(linha);
				linha = lerArq.readLine(); // lê da segunda até a última linha
			}

			lista = service.adicionaDigito(lista);
			lista.forEach(System.out::println);
			
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		
	}

}
