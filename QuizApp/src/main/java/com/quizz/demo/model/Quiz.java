package com.quizz.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private String title;
	
	// this is to add many to many relation with the db
	
	@ManyToMany
	private List<Question> questions;
	
	
//	public Integer getId() {
//		return quiz_id;
//	}
	public String getTitle() {
		return title;
	}
	
//	public void setId(Integer id) {
//		this.quiz_id = id;
//	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	

}
