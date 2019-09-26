package com.puc.telegraf.matriculas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class MatriculasController {

	@PostMapping("/gerarDigito")
	private ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
		

        return null;
    }
}
