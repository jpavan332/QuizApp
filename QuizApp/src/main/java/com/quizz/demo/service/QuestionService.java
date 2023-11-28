package com.quizz.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quizz.demo.dao.Questiondao;
import com.quizz.demo.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	Questiondao questionDao;

	public ResponseEntity<List<Question>> getAllQuestions() {
		// TODO Auto-generated method stub
//		List<Question> q1 = new ArrayList<Question>();
//		q1 = questionDao.findAll();
//		for(Question q2: q1)
//			System.out.println(q2);
		
		try {
		return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}

	public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
		// TODO Auto-generated method stub
		try {
		return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
		
	}

	public ResponseEntity<String> addQuestion(Question question) {
		// TODO Auto-generated method stub
		
//		System.out.println(question.getId());
//		System.out.println(question.getQuestionTitle());
		
		
		
		//questionDao.flush();
		try {
		questionDao.save(question);
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("not added", HttpStatus.BAD_REQUEST);
	}

	public ResponseEntity<String> delQuestion(Question question) {
		// TODO Auto-generated method stub
		
		
		try {
			questionDao.delete(question);
			return new ResponseEntity<String>("Deleted", HttpStatus.OK);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return new ResponseEntity<>("not deleted", HttpStatus.BAD_REQUEST);
	}
	
	

	
}
