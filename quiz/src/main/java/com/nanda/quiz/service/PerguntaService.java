package com.nanda.quiz.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nanda.quiz.dto.PerguntaDTO;
import com.nanda.quiz.entity.Pergunta;
import com.nanda.quiz.repositories.PerguntaRepository;

@Service
public class PerguntaService {

	@Autowired
	private PerguntaRepository repo;
	
	@Transactional(readOnly = true)
	public List<PerguntaDTO> findAll(){
		List<Pergunta> list = repo.findAll();
		
		return list.stream().map(x -> new PerguntaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public PerguntaDTO findPergunta(Integer id) {
		Pergunta pergunta = repo.getOne(id);
		
		return new PerguntaDTO(pergunta);
	}
	
	@Transactional
	public PerguntaDTO insert(PerguntaDTO dto) {
		Pergunta pergunta = new Pergunta(null, dto.getCorpo());
		
		pergunta = repo.save(pergunta);
		
		return new PerguntaDTO(pergunta);
	}
	
	@Transactional
	public PerguntaDTO update(@PathVariable Integer id, @RequestBody PerguntaDTO quiz) {
		Pergunta entity = repo.getOne(id);
		
		updateData(entity, quiz);
		
		entity =  repo.save(entity);
		return new PerguntaDTO(entity);
	}
	
	@Transactional
	private void updateData(Pergunta entity, PerguntaDTO quiz) {

		entity.setCorpo(quiz.getCorpo());
		
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
