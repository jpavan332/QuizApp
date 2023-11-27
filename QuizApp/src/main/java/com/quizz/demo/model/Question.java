package com.quizz.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;



@Entity
public class Question {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int id;
		private String questionTitle;
		private String category;
		private String difficultyLevel;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		private String rightAnswer;
		public int getId() {
			return id;
		}
		public String getQuestionTitle() {
			return questionTitle;
		}
		public String getCategory() {
			return category;
		}
		public String getDifficultyLevel() {
			return difficultyLevel;
		}
		public String getOption1() {
			return option1;
		}
		public String getOption2() {
			return option2;
		}
		public String getOption3() {
			return option3;
		}
		public String getOption4() {
			return option4;
		}
		public String getRightAnswer() {
			return rightAnswer;
		}
		
		
		
}
