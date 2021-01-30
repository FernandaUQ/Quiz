package com.nanda.quiz.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nanda.quiz.dto.AlternativaDTO;
import com.nanda.quiz.entity.Alternativa;
import com.nanda.quiz.repositories.AlternativaRepository;

@Service
public class AlternativaService {

	@Autowired
	private AlternativaRepository repo;
	
	@Transactional(readOnly = true)
	public List<AlternativaDTO> findAll(){
		List<Alternativa> list = repo.findAll();
		
		return list.stream().map(x -> new AlternativaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public AlternativaDTO findAlternativa(Integer id) {
		Alternativa alternativa = repo.getOne(id);
		
		return new AlternativaDTO(alternativa);
	}
	
	@Transactional
	public AlternativaDTO insert(AlternativaDTO dto) {
		Alternativa alternativa = new Alternativa(null, dto.getDescricao(), dto.getPontuacao());
		
		alternativa = repo.save(alternativa);
		
		return new AlternativaDTO(alternativa);
	}
	
	@Transactional
	public AlternativaDTO update(@PathVariable Integer id, @RequestBody AlternativaDTO quiz) {
		Alternativa entity = repo.getOne(id);
		
		updateData(entity, quiz);
		
		entity =  repo.save(entity);
		return new AlternativaDTO(entity);
	}
	
	@Transactional
	private void updateData(Alternativa entity, AlternativaDTO quiz) {

		entity.setDescricao(quiz.getDescricao());
		entity.setPontuacao(quiz.getPontuacao());
		
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
