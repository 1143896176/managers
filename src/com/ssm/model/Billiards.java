package com.ssm.model;

import java.io.Serializable;

public class Billiards implements Serializable {

	private Integer billiard_id;
	private String origin;
	private Double price;
	private String location;
	private Reserve reserve;
	public Reserve getReserve() {
		return reserve;
	}
	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
	}
	public Integer getBilliard_id() {
		return billiard_id;
	}
	public void setBilliard_id(Integer billiard_id) {
		this.billiard_id = billiard_id;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	 
	
	
}
