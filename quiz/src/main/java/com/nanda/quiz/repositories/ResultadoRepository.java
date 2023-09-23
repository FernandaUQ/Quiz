package com.nanda.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanda.quiz.entity.Resultado;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResultadoRepository extends JpaRepository<Resultado, Integer>, JpaSpecificationExecutor<Resultado> {

}
