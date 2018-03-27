package com.ssm.model;

import java.io.Serializable;

public class Members implements Serializable {

	private String member_id;
	private Integer billard_id;
	private String member_name;
	private String member_tel;
	private String password;
	private Integer integrate;
	private Double balance;
	private Integer grade;
	private String member_idcard;
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Integer getBillard_id() {
		return billard_id;
	}
	public void setBillard_id(Integer billard_id) {
		this.billard_id = billard_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_tel() {
		return member_tel;
	}
	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getIntegrate() {
		return integrate;
	}
	public void setIntegrate(Integer integrate) {
		this.integrate = integrate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getMember_idcard() {
		return member_idcard;
	}
	public void setMember_idcard(String member_idcard) {
		this.member_idcard = member_idcard;
	}
}
