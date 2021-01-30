package com.nanda.quiz.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nanda.quiz.entity.Resultado;

public class ResultadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String personagem;
	private String imgUrl;
	private Integer notaMin;
	private Integer notaMax;
	
	@JsonIgnore
	private QuizDTO quiz;
	
	
	public ResultadoDTO() {
	}


	public ResultadoDTO(Integer id, String personagem, String imgUrl, Integer NotaMin, Integer NotaMax) {
		this.id = id;
		this.personagem = personagem;
		this.imgUrl = imgUrl;
		this.notaMin = NotaMin;
		this.notaMax = NotaMax;
	}
	
	
	public ResultadoDTO(Resultado en) {
		super();
		id = en.getId();
		personagem = en.getPersonagem();
		imgUrl = en.getImgUrl();
		notaMin = en.getNotaMin();
		notaMax = en.getNotaMax();	
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


	public QuizDTO getQuiz() {
		return quiz;
	}


	public void setQuiz(QuizDTO quiz) {
		this.quiz = quiz;
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
		ResultadoDTO other = (ResultadoDTO) obj;
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
