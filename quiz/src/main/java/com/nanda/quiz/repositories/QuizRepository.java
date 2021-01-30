package com.nanda.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nanda.quiz.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{

}
