package com.nanda.quiz.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nanda.quiz.entity.Pergunta;

public class PerguntaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer slot;
	private String corpo;
	private List<AlternativaDTO> alternativas = new ArrayList<>();
	private QuizDTO quiz;
	
	public PerguntaDTO() {
	}

	public PerguntaDTO(Integer id, Integer slot, String corpo, List<AlternativaDTO> alternativas, QuizDTO quiz) {
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
		quiz = new QuizDTO(en.getQuiz());
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

	public QuizDTO getQuiz() {
		return quiz;
	}

	
	
	
}
