package com.hcl.mortgage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class Application {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idapplication")
	private int aid;
	
	@Column(name="user_id")
	private int uid;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="purpose")
	private String purpose;
	
	@Column(name="status")
	private String status;
	
	@Column(name="ssn")
	private String ssn;
	
	@Column(name="comments")
	private String comments;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Application(int aid) {
		this.aid = aid;
	}

}
