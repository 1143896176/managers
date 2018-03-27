package com.ssm.model;

import java.io.Serializable;
import java.util.Date;

public class Messages implements Serializable {

	private Integer message_id;
	private String message_name;
	private Integer message_status;
	private String message_content;
	private Date message_date;
	private String member_id;
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public String getMessage_name() {
		return message_name;
	}
	public void setMessage_name(String message_name) {
		this.message_name = message_name;
	}
	public Integer getMessage_status() {
		return message_status;
	}
	public void setMessage_status(Integer message_status) {
		this.message_status = message_status;
	}
	public String getMessage_content() {
		return message_content;
	}
	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}
	public Date getMessage_date() {
		return message_date;
	}
	public void setMessage_date(Date message_date) {
		this.message_date = message_date;
	}

}
