package com.learn.projectonmvc;

public class Grade {
	
	private String name;
	private String position;
	private String score;
	
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(String name, String position, String score) {
		super();
		this.name = name;
		this.position = position;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Grade [name=" + name + ", position=" + position + ", score=" + score + "]";
	}
	
	
	

}
