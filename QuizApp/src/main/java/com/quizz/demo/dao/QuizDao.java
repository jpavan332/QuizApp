package com.quizz.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quizz.demo.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
	
	

}
