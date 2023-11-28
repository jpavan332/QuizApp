package com.quizz.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quizz.demo.model.Question;
import com.quizz.demo.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
	
	

}
