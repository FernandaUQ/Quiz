package com.nanda.quiz.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nanda.quiz.dto.PerguntaDTO;

@Entity
@Table(name = "tb_alternativa")
public class Alternativa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer slot;
	private String descricao;
	private Integer gabarito;
	
	@ManyToOne
	@JoinColumn(name = "id_pergunta")
	private Pergunta pergunta;
	
	public Alternativa() {
	}

	

	public Alternativa(Integer id, Integer slot, String descricao, Pergunta pergunta, Integer gabarito) {
		super();
		this.id = id;
		this.slot = slot;
		this.descricao = descricao;
		this.pergunta = pergunta;
		this.gabarito = gabarito;
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

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Integer getGabarito() {
		return gabarito;
	}

	public void setGabarito(Integer gabarito) {
		this.gabarito = gabarito;
	}

	@Override
	public int hashCode() {
		final Integer prime = 31;
		Integer result = 1;
		result = prime * result + id;
		result = prime * result + slot;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alternativa other = (Alternativa) obj;
		if (id != other.id)
			return false;
		if (slot != other.slot)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alternativa [id=" + id + ", slot=" + slot + ", descricao=" + descricao + ", pergunta=" + pergunta
				+ ", gabarito=" + gabarito + "]";
	}

	

}
