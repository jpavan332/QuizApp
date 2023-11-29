package com.quizz.demo.model;

public class QuestionWrapper {
	private Integer id;
	private String questionTitle;
	private String category;
	private String difficultyLevel;
	private String option1;
	private String option2;
	private String option3;
	
	public QuestionWrapper(Integer id, String questionTitle, String category, String difficultyLevel, String option1,
			String option2, String option3, String option4) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		this.category = category;
		this.difficultyLevel = difficultyLevel;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	public Integer getId() {
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
	public void setId(Integer id) {
		this.id = id;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	private String option4;

}
