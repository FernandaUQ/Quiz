package com.nanda.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanda.quiz.entity.Pergunta;

public interface PerguntaRepository extends JpaRepository<Pergunta, Integer>{

}
