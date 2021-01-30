package com.nanda.quiz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nanda.quiz.entity.Pergunta;
import com.nanda.quiz.entity.Quiz;

public class PerguntaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer slot;
	private String corpo;
	private List<AlternativaDTO> alternativas = new ArrayList<>();
	private Quiz quiz;
	
	public PerguntaDTO() {
	}

	public PerguntaDTO(Integer id, Integer slot, String corpo, List<AlternativaDTO> alternativas, Quiz quiz) {
		super();
		this.id = id;
		this.slot = slot;
		this.corpo = corpo;
		this.alternativas = alternativas;
		this.quiz = quiz;
	}

	public PerguntaDTO(Pergunta en) {
		super();
		id = en.getId();
		slot = en.getSlot();
		corpo = en.getCorpo();
		alternativas = en.getAlternativas().stream().map(x -> new AlternativaDTO(x)).collect(Collectors.toList());
		quiz = quiz;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public List<AlternativaDTO> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<AlternativaDTO> alternativas) {
		this.alternativas = alternativas;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	
	
	
}
