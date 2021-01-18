package com.nanda.quiz.entity;

public class Alternativa {
	
	private int id;
	private int slot;
	private String descricao;
	private Pergunta pergunta;
	private Gabarito gabarito;
	
	public Alternativa() {
	}

	public Alternativa(int id, int slot, String descricao, Pergunta pergunta, Gabarito gabarito) {
		this.id = id;
		this.slot = slot;
		this.descricao = descricao;
		this.pergunta = pergunta;
		this.gabarito = gabarito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
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

	public Gabarito getGabarito() {
		return gabarito;
	}

	public void setGabarito(Gabarito gabarito) {
		this.gabarito = gabarito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
