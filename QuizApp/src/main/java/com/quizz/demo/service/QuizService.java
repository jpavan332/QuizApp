package com.quizz.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quizz.demo.dao.*;
import com.quizz.demo.model.Quiz;
import com.quizz.demo.model.*;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;
	@Autowired
	Questiondao questionDao;
	
	
	public ResponseEntity<String> createQuiz(String category, int nofQuestions, String title) {
		// TODO Auto-generated method stub
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		List<Question> questions = questionDao.findRandomQuestionsByCategory(category,nofQuestions);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("Random questions generated",HttpStatus.CREATED);
	}
	
	
	

}
