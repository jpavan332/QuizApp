package com.quizz.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quizz.demo.model.Question;

@Repository
public interface Questiondao extends JpaRepository<Question, Integer> {

	List<Question> findByCategory(String category);

	
	
	@Query(value = "SELECT FROM question WHERE category = :category ORDER BY RAND() LIMIT :nofQuestions;", nativeQuery=true)
	List<Question> findRandomQuestionsByCategory(String category, int nofQuestions);

	
}
