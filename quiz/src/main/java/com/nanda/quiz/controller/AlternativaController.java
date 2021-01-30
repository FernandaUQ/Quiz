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

import com.nanda.quiz.dto.AlternativaDTO;
import com.nanda.quiz.service.AlternativaService;

@RestController
@RequestMapping(value = "/alternativa")
public class AlternativaController {

	@Autowired
	private AlternativaService service;

	@GetMapping
	public ResponseEntity<List<AlternativaDTO>> findAll() {
		List<AlternativaDTO> list = service.findAll();

		return ResponseEntity.ok().body(list);

	}

	@GetMapping("/{id}")
	public ResponseEntity<AlternativaDTO> findOne(@PathVariable Integer id) {
		AlternativaDTO alternativa = service.findAlternativa(id);

		return ResponseEntity.ok().body(alternativa);
	}

	@PostMapping
	public ResponseEntity<AlternativaDTO> insert(@RequestBody AlternativaDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}

	@PutMapping("/{id}")
	public ResponseEntity<AlternativaDTO> insert(@PathVariable Integer id, @RequestBody AlternativaDTO quiz) {
		AlternativaDTO dto = service.update(id, quiz);
		return ResponseEntity.ok().body(dto);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<AlternativaDTO> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();

	}

}
