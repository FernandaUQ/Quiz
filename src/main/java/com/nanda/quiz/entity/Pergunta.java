package com.nanda.quiz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tb_pergunta")
public class Pergunta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer slot;
	private String corpo;
	
	@OneToMany(mappedBy = "pergunta",
			targetEntity = Alternativa.class,
			cascade = CascadeType.ALL)
	private List<Alternativa> alternativas;
	
	@ManyToOne
	@JoinColumn(name="id_quiz")
	private Quiz quiz;

	public Pergunta(Integer id, Integer slot, String corpo) {
		super();
		this.id = id;
		this.slot = slot;
		this.corpo = corpo;
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

	public List<Alternativa> getAlternativas() {
		return alternativas;
	}
	

	public Quiz getQuiz() {
		return quiz;
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
