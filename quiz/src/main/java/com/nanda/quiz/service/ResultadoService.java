package com.nanda.quiz.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nanda.quiz.dto.ResultadoDTO;
import com.nanda.quiz.entity.Resultado;
import com.nanda.quiz.repositories.ResultadoRepository;

@Service
public class ResultadoService {

	@Autowired
	private ResultadoRepository repo;
	
	@Transactional(readOnly = true)
	public List<ResultadoDTO> findAll(){
		List<Resultado> list = repo.findAll();
		
		return list.stream().map(x -> new ResultadoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ResultadoDTO findResultado(Integer id) {
		Resultado resultado = repo.getOne(id);
		
		return new ResultadoDTO(resultado);
	}
	
	@Transactional
	public ResultadoDTO insert(ResultadoDTO dto) {
		Resultado resultado = new Resultado(null, dto.getPersonagem(), dto.getImgUrl(), dto.getNotaMax(), dto.getNotaMin());
		
		resultado = repo.save(resultado);
		
		return new ResultadoDTO(resultado);
	}
	
	@Transactional
	public ResultadoDTO update(@PathVariable Integer id, @RequestBody ResultadoDTO quiz) {
		Resultado entity = repo.getOne(id);
		
		updateData(entity, quiz);
		
		entity =  repo.save(entity);
		return new ResultadoDTO(entity);
	}
	
	@Transactional
	private void updateData(Resultado entity, ResultadoDTO quiz) {

		entity.setPersonagem(quiz.getPersonagem());
		entity.setImgUrl(quiz.getImgUrl());
		entity.setNotaMin(quiz.getNotaMin());
		entity.setNotaMax(quiz.getNotaMax());
		
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
