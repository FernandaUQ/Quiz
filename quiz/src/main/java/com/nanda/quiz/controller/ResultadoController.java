package com.nanda.quiz.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nanda.quiz.dto.ResultadoDTO;
import com.nanda.quiz.service.ResultadoService;

@RestController
@RequestMapping(value = "/resultado")
public class ResultadoController {
	
	@Autowired
	private ResultadoService service;
	
	@GetMapping
	public ResponseEntity<List<ResultadoDTO>> findAll (){
		List<ResultadoDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/quiz/{quizId}")
	public ResponseEntity<List<ResultadoDTO>> findByQuizId (@PathVariable Integer quizId){
		List<ResultadoDTO> resultado = service.findByQuizId(quizId);

		return ResponseEntity.ok().body(resultado);
	}
	
	@PostMapping("/save/{id}")
	public ResponseEntity<ResultadoDTO> insert (@RequestBody ResultadoDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResultadoDTO> insert (@PathVariable Integer id, @RequestBody ResultadoDTO quiz){
		ResultadoDTO dto = service.update(id, quiz);
		return ResponseEntity.ok().body(dto);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResultadoDTO> delete (@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();

	}

}
