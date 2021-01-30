package com.nanda.quiz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "tb_pergunta")
public class Pergunta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String corpo;
	
	@OneToMany(mappedBy = "pergunta",
			targetEntity = Alternativa.class)
	private List<Alternativa> alternativas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_quiz")
	private Quiz quiz;
	
	public Pergunta() {
	}

	public Pergunta(Integer id, String corpo) {
		super();
		this.id = id;
		this.corpo = corpo;
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
		return true;
	}

	@Override
	public String toString() {
		return "Pergunta [id=" + id + ", corpo=" + corpo + ", alternativas=" + alternativas + "]";
	}

}
