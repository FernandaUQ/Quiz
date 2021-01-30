package com.nanda.quiz.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nanda.quiz.dto.QuizDTO;
import com.nanda.quiz.entity.Quiz;
import com.nanda.quiz.repositories.QuizRepository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository repo;
	
	@Transactional(readOnly = true)
	public List<QuizDTO> findAll(){
		List<Quiz> list = repo.findAll();
		
		return list.stream().map(x -> new QuizDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public QuizDTO findQuiz(Integer id) {
		Quiz quiz = repo.getOne(id);
		
		return new QuizDTO(quiz);
	}
	
	@Transactional
	public QuizDTO insert(QuizDTO dto) {
		Quiz quiz = new Quiz(null, dto.getTitulo(), dto.getImgUrl());
		
		quiz = repo.save(quiz);
		
		return new QuizDTO(quiz);
	}
	
	@Transactional
	public QuizDTO update(@PathVariable Integer id, @RequestBody QuizDTO obj) {
		Quiz quiz = repo.getOne(id);
		QuizDTO entity = new QuizDTO(quiz);
		
		updateData(entity, obj);
		
		quiz =  repo.save(quiz);
		return new QuizDTO(quiz);
	}
	
	@Transactional
	private void updateData(QuizDTO entity, QuizDTO obj) {

		entity.setTitulo(obj.getTitulo());
		entity.setImgUrl(obj.getImgUrl());
	}
	
	@Transactional
	public void delete (Integer id) {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
	}
}
