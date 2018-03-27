package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Useinfo implements Serializable {

	private Integer use_id;
	private String user_name;
	private Integer billard_id;
	private Double price;
	private Date use_start;
	private Integer use_status;
	public Integer getUse_status() {
		return use_status;
	}
	public void setUse_status(Integer use_status) {
		this.use_status = use_status;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Integer getBillard_id() {
		return billard_id;
	}
	public void setBillard_id(Integer billard_id) {
		this.billard_id = billard_id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getUse_start() {
		return use_start;
	}
	public void setUse_start(Date use_start) {
		this.use_start = use_start;
	}
	public Integer getUse_id() {
		return use_id;
	}
	public void setUse_id(Integer use_id) {
		this.use_id = use_id;
	}
}
