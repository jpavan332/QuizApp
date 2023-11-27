package com.quizz.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Question {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int id;
		private String questionTitle;
		private String category;
		private String difficultyLevel;
		private String rightAnswer;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		
		
}
