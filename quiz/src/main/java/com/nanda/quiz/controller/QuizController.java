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

import com.nanda.quiz.dto.QuizDTO;
import com.nanda.quiz.entity.Quiz;
import com.nanda.quiz.service.QuizService;

@RestController
@RequestMapping(value = "/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	@GetMapping
	public ResponseEntity<List<QuizDTO>> findAll (){
		List<QuizDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<QuizDTO> findOne (@PathVariable Integer id){
		QuizDTO quiz = service.findQuiz(id);
		
		return ResponseEntity.ok().body(quiz);
	}
	
	@PostMapping
	public ResponseEntity<QuizDTO> insert (@RequestBody QuizDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);

	}
	
	@PutMapping("/{id}")
	public ResponseEntity<QuizDTO> insert (@PathVariable Integer id, @RequestBody QuizDTO quiz){
		QuizDTO dto = service.update(id, quiz);
		return ResponseEntity.ok().body(dto);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<QuizDTO> delete (@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}

}
