package com.nanda.quiz.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.nanda.quiz.entity.Quiz;

public class QuizDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String titulo;
	private List<PerguntaDTO> perguntas;
	
	public QuizDTO() {
		super();
	}

	public QuizDTO(Integer id, String titulo, List<PerguntaDTO> perguntas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.perguntas = perguntas;
	}

	public QuizDTO(Quiz en) {
		super();
		id = en.getId();
		titulo = en.getTitulo();
		perguntas = en.getPerguntas().stream().map(x -> new PerguntaDTO(x)).collect(Collectors.toList());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<PerguntaDTO> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<PerguntaDTO> perguntas) {
		this.perguntas = perguntas;
	}
	
	
	
	
	

}
