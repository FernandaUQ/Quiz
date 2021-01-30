package com.nanda.quiz.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_quiz")
public class Quiz implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	
	@OneToMany (mappedBy = "quiz", targetEntity = Pergunta.class, cascade = CascadeType.ALL)
	private List<Pergunta> perguntas;
	
	@OneToMany(mappedBy = "quiz", targetEntity = Resultado.class, cascade = CascadeType.ALL)
	private List<Resultado> resultado;
	
	

	public Quiz() {
	}
	
	

	public Quiz(Integer id, String titulo, List<Pergunta> perguntas, List<Resultado> resultado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.perguntas = perguntas;
		this.resultado = resultado;
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

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public List<Resultado> getResultado() {
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Quiz other = (Quiz) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
