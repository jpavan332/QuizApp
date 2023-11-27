package com.quizz.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizz.demo.dao.Questiondao;
import com.quizz.demo.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	Questiondao questionDao;

	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
//		List<Question> q1 = new ArrayList<Question>();
//		q1 = questionDao.findAll();
//		for(Question q2: q1)
//			System.out.println(q2);
		return questionDao.findAll();
		
	}

	
}
