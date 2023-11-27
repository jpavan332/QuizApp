package com.quizz.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizz.demo.model.Question;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);

	
}
