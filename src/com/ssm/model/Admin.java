package com.ssm.model;

import java.io.Serializable;

public class Admin implements Serializable {

	private Integer billard_id;
	private String username;
	private String password;
	private String billard_name;
	private String synopsis;
	private String lock_password;
	private String admin_name;
	private String admin_tel;
	private String billard_address;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBillard_name() {
		return billard_name;
	}
	public void setBillard_name(String billard_name) {
		this.billard_name = billard_name;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getBillard_address() {
		return billard_address;
	}
	public void setBillard_address(String billard_address) {
		this.billard_address = billard_address;
	}
	
	public String getLock_password() {
		return lock_password;
	}
	public void setLock_password(String lock_password) {
		this.lock_password = lock_password;
	}
	public String getAdmin_tel() {
		return admin_tel;
	}
	public void setAdmin_tel(String admin_tel) {
		this.admin_tel = admin_tel;
	}
	public Integer getBillard_id() {
		return billard_id;
	}
	public void setBillard_id(Integer billard_id) {
		this.billard_id = billard_id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
