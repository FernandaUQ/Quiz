package com.nanda.quiz.dto;

import java.io.Serializable;

import com.nanda.quiz.entity.Alternativa;

public class AlternativaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer slot;
	private String descricao;
	private Integer gabarito;
	private PerguntaDTO pergunta;
	
	public AlternativaDTO() {
		}
	
	
	public AlternativaDTO(Integer id, Integer slot, String descricao, Integer gabarito, PerguntaDTO pergunta) {
		super();
		this.id = id;
		this.slot = slot;
		this.descricao = descricao;
		this.gabarito = gabarito;
		this.pergunta = pergunta;
	}

	public AlternativaDTO(Alternativa entity) {
		super();
		id = entity.getId();
		slot = entity.getSlot();
		descricao = entity.getDescricao();
		gabarito = entity.getGabarito();
		pergunta = entity.getPergunta();
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


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getGabarito() {
		return gabarito;
	}


	public void setGabarito(Integer gabarito) {
		this.gabarito = gabarito;
	}


	public PerguntaDTO getPergunta() {
		return pergunta;
	}


	public void setPergunta(PerguntaDTO pergunta) {
		this.pergunta = pergunta;
	}
	
	
	
	
	
}
