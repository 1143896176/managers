package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Accounts implements Serializable {

	private Integer account_id;
	private String member_id;
	private Integer billiard_id;
	private Date account_start;
	private Date account_end;
	private Double duration;
	private Double price;
	private Members member;
	private Double discount;
	public Members getMember() {
		return member;
	}
	public void setMember(Members member) {
		this.member = member;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Integer getBilliard_id() {
		return billiard_id;
	}
	public void setBilliard_id(Integer billiard_id) {
		this.billiard_id = billiard_id;
	}
	public Date getAccount_start() {
		return account_start;
	}
	public void setAccount_start(Date account_start) {
		this.account_start = account_start;
	}
	public Date getAccount_end() {
		return account_end;
	}
	public void setAccount_end(Date account_end) {
		this.account_end = account_end;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

}
