package com.nanda.quiz.entity;

public class Gabarito {
	
	private Alternativa alternativa;
	private int nota;
	
	public Gabarito() {
	}

	public Gabarito(Alternativa alternativa, int nota) {
		this.alternativa = alternativa;
		this.nota = nota;
	}

	public Alternativa getAlternativa() {
		return alternativa;
	}

	public void setAlternativa(Alternativa alternativa) {
		this.alternativa = alternativa;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
}
