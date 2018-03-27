package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Reserve implements Serializable {

	private Integer reserve_id;
	private Integer billard_id;
	private Date reserve_start;
	private Integer reserve_status;
	private Date reserve_end;
	private String member_id;
	public Integer getReserve_id() {
		return reserve_id;
	}
	public void setReserve_id(Integer reserve_id) {
		this.reserve_id = reserve_id;
	}
	public Integer getBillard_id() {
		return billard_id;
	}
	public void setBillard_id(Integer billard_id) {
		this.billard_id = billard_id;
	}
	public Date getReserve_start() {
		return reserve_start;
	}
	public void setReserve_start(Date reserve_start) {
		this.reserve_start = reserve_start;
	}
	public Integer getReserve_status() {
		return reserve_status;
	}
	public void setReserve_status(Integer reserve_status) {
		this.reserve_status = reserve_status;
	}
	public Date getReserve_end() {
		return reserve_end;
	}
	public void setReserve_end(Date reserve_end) {
		this.reserve_end = reserve_end;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	

}
