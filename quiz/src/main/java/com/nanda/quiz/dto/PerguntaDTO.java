package com.nanda.quiz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nanda.quiz.entity.Pergunta;

public class PerguntaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String corpo;
	private List<AlternativaDTO> alternativas = new ArrayList<>();
	
	@JsonIgnore
	private QuizDTO quiz;
	
	public PerguntaDTO() {
	}

	public PerguntaDTO(Integer id, String corpo) {
		super();
		this.id = id;
		this.corpo = corpo;
	}

	public PerguntaDTO(Pergunta en) {
		super();
		id = en.getId();
		corpo = en.getCorpo();
		alternativas = en.getAlternativas().stream().map(x -> new AlternativaDTO(x)).collect(Collectors.toList());
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public QuizDTO getQuiz() {
		return quiz;
	}

	
	
	
}
