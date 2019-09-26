package com.puc.telegraf.matriculas.service;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.puc.telegraf.matriculas.operacoes.Operacoes;

@Service
public class MatriculasService {

	private Operacoes op = new Operacoes();

	public List<String> processarArquivo(MultipartFile file) {

		try {
//			ByteArrayInputStream stream = new ByteArrayInputStream(file.getBytes());
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File("matriculasComDigito.txt")));
			stream.write(file.getBytes());
			
			stream.
			String conteudo = new String(file.getBytes());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
//		adicionaDigito(Arrays.asList(file));
	}

	public List<String> adicionaDigito(List<String> matriculas) {

		for (int i = 0; i < matriculas.size(); i++) {
			matriculas.set(i, matriculas.get(i).concat("-" + op.definiDigito(matriculas.get(i))));
		}

		return matriculas;
	}

	public List<String> verificarMatricula(List<String> matriculas) {

		for (int i = 0; i < matriculas.size(); i++) {
			matriculas.set(i, matriculas.get(i)
					.concat(" " + (op.verificarMatricula(matriculas.get(i)) ? "verdadeiro" : "falso")));
		}

		return matriculas;
	}
}
