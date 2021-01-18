package com.nanda.quiz.entity;

import java.util.List;

public class Pergunta {
	
	private int id;
	private int slot;
	private String corpo;
	
	private List<Alternativa> alternativas;

	public Pergunta(int id, int slot, String corpo) {
		super();
		this.id = id;
		this.slot = slot;
		this.corpo = corpo;
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

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public List<Alternativa> getAlternativas() {
		return alternativas;
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
		Pergunta other = (Pergunta) obj;
		if (id != other.id)
			return false;
		if (slot != other.slot)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pergunta [id=" + id + ", slot=" + slot + ", corpo=" + corpo + ", alternativas=" + alternativas + "]";
	}

}
