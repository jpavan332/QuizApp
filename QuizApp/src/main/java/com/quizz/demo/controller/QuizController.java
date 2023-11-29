package com.quizz.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quizz.demo.model.Question;
import com.quizz.demo.model.QuestionWrapper;
import com.quizz.demo.model.Response;
import com.quizz.demo.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int nofQuestions, @RequestParam String title){
		
		
		return quizService.createQuiz(category,nofQuestions,title);
	}

	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id)
	{
		return quizService.getQuizQuestions(id);
		
	}
	
	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> getResult(@PathVariable Integer id, @RequestBody List<Response> response){
		
		
		return quizService.getResult(id,response);
		
	}
}
