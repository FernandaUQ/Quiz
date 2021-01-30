package com.nanda.quiz.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nanda.quiz.entity.Alternativa;

public class AlternativaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String descricao;
	private Integer pontuacao;
	
	@JsonIgnore
	private PerguntaDTO pergunta;
	
	public AlternativaDTO() {
		}
	
	
	public AlternativaDTO(Integer id, String descricao, Integer pontuacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pontuacao = pontuacao;
		}

	public AlternativaDTO(Alternativa entity) {
		super();
		id = entity.getId();
		descricao = entity.getDescricao();
		pontuacao = entity.getPontuacao();
		}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getPontuacao() {
		return pontuacao;
	}


	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	@Transient
	public PerguntaDTO getPergunta() {
		return pergunta;
	}

	
	
}
