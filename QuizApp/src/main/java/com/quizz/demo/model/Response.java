package com.quizz.demo.model;

public class Response {
	
	private Integer id;
	private String response;
	
	public Response() {
		super();
	}
	public Response(Integer id, String response) {
		super();
		this.id = id;
		this.response = response;
	}
	public Integer getId() {
		return id;
	}
	public String getResponse() {
		return response;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setResponse(String response) {
		this.response = response;
	}

}
