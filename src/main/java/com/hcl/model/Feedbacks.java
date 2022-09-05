package com.hcl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="feedbks")
public class Feedbacks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String uname;
	public String title;
	public String feedback;
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Feedbacks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Feedbacks(String uname, String title, String feedback) {
		super();
		this.uname = uname;
		this.title = title;
		this.feedback = feedback;
	}
	
	
	@Override
	public String toString() {
		return "Feedbacks [uname=" + uname + ", title=" + title + ", feedback=" + feedback + "]";
	}
	
	
	
	
}
