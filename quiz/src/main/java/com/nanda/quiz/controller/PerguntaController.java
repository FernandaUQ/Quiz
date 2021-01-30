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

import com.nanda.quiz.dto.PerguntaDTO;
import com.nanda.quiz.service.PerguntaService;

@RestController
@RequestMapping(value = "/pergunta")
public class PerguntaController {
	
	@Autowired
	private PerguntaService service;
	
	@GetMapping
	public ResponseEntity<List<PerguntaDTO>> findAll (){
		List<PerguntaDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PerguntaDTO> findOne (@PathVariable Integer id){
		PerguntaDTO pergunta = service.findPergunta(id);
		
		return ResponseEntity.ok().body(pergunta);
	}
	
	@PostMapping
	public ResponseEntity<PerguntaDTO> insert (@RequestBody PerguntaDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PerguntaDTO> insert (@PathVariable Integer id, @RequestBody PerguntaDTO quiz){
		PerguntaDTO dto = service.update(id, quiz);
		return ResponseEntity.ok().body(dto);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<PerguntaDTO> delete (@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}

}
