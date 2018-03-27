package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable {

	private Integer announce_id;
	private Integer billard_id;
	private String announce_title;
	private Date announce_date;
	private String announce_content;
	public Integer getAnnounce_id() {
		return announce_id;
	}
	public void setAnnounce_id(Integer announce_id) {
		this.announce_id = announce_id;
	}
	public Integer getBillard_id() {
		return billard_id;
	}
	public void setBillard_id(Integer billard_id) {
		this.billard_id = billard_id;
	}
	public String getAnnounce_title() {
		return announce_title;
	}
	public void setAnnounce_title(String announce_title) {
		this.announce_title = announce_title;
	}
	public Date getAnnounce_date() {
		return announce_date;
	}
	public void setAnnounce_date(Date announce_date) {
		this.announce_date = announce_date;
	}
	public String getAnnounce_content() {
		return announce_content;
	}
	public void setAnnounce_content(String announce_content) {
		this.announce_content = announce_content;
	}

}
