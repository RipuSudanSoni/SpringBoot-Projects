package com.example.quize.quize.service.entites;






public class Question{

	private Long questionId;
	
	private String sub;
	
	private String question;
	
	private Long quizeId;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Long questionId, String sub, String question) {
		super();
		this.questionId = questionId;
		this.sub = sub;
		this.question = question;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public Long getQuizeId() {
		return quizeId;
	}

	public void setQuizeId(Long quizeId) {
		this.quizeId = quizeId;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", sub=" + sub + ", question=" + question + "]";
	}
	
	

}
