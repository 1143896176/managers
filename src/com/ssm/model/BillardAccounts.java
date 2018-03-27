package com.ssm.model;

import java.io.Serializable;

public class BillardAccounts implements Serializable {

	private Integer billiard_id;
	private Double member_price;
	private Double user_price;
	public Integer getBilliard_id() {
		return billiard_id;
	}
	public void setBilliard_id(Integer billiard_id) {
		this.billiard_id = billiard_id;
	}
	public Double getMember_price() {
		return member_price;
	}
	public void setMember_price(Double member_price) {
		this.member_price = member_price;
	}
	public Double getUser_price() {
		return user_price;
	}
	public void setUser_price(Double user_price) {
		this.user_price = user_price;
	}
	
}
