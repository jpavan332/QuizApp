package com.quizz.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quizz.demo.dao.*;
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
		
//		quiz.setId(nofQuestions);
		quiz.setTitle(title);
		
		List<Question> questions = questionDao.findRandomQuestionsByCategory(category,nofQuestions);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("Random questions generated",HttpStatus.CREATED);
	}


	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		
		Optional<Quiz> quiz = quizDao.findById(id);
		List<Question> questionFromDB = quiz.get().getQuestions();
		List<QuestionWrapper> questionToClients = new ArrayList<QuestionWrapper>();
		for(Question q : questionFromDB)
		{
			QuestionWrapper qw = new QuestionWrapper(id, q.getQuestionTitle(), q.getCategory(), q.getDifficultyLevel(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
			questionToClients.add(qw);
		}
		
		return new ResponseEntity<List<QuestionWrapper>>(questionToClients,HttpStatus.OK);
	}
	
	
	

}
