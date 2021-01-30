package com.nanda.quiz.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_Resultado")
public class Resultado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String personagem;
	private String imgUrl;
	private Integer notaMin;
	private Integer notaMax;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_quiz")
	private Quiz quiz;

	public Resultado() {
	}

	public Resultado(Integer id, String personagem, String imgUrl, Integer NotaMin, Integer NotaMax) {
		this.id = id;
		this.personagem = personagem;
		this.imgUrl = imgUrl;
		this.notaMin = NotaMin;
		this.notaMax = NotaMax;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getNotaMin() {
		return notaMin;
	}

	public void setNotaMin(Integer notaMin) {
		this.notaMin = notaMin;
	}

	public Integer getNotaMax() {
		return notaMax;
	}

	public void setNotaMax(Integer notaMax) {
		this.notaMax = notaMax;
	}

	public Quiz getQuiz() {
		return quiz;
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
		Resultado other = (Resultado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resultado [id=" + id + ", personagem=" + personagem + ", imgUrl=" + imgUrl + "]";
	}

}
