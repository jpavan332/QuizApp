package com.quizz.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizz.demo.model.Question;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {

	
}
