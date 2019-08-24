package com.hcl.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iduser")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="credit_score")
	private String credit_score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getCredit_score() {
		return credit_score;
	}

	public void setCredit_score(String credit_score) {
		this.credit_score = credit_score;
	}

	public User(int id, String name, String ssn, String credit_score) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.credit_score = credit_score;
	}
	
	
}
