package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="answer123")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	int id;
	String answer;
	String postedBy;
	public Answer() {
		
	}
	
	public Answer(String answer, String postedBy) {
		super();
		this.answer = answer;
		this.postedBy = postedBy;
	}

	public Answer(int id, String answer, String postedBy) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	
	
}
