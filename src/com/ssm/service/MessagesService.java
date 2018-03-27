package com.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Members;
import com.ssm.model.Messages;



public interface MessagesService {

	public List<Messages> selectByStatus();
	
	public List<Messages> selectByStatus2();
	
	public  Double selectPreference();
	
	public  Double selectPreference(Integer grade);
	
	public List<Members> selectIntegrate();
	
	public void upGrade(Integer grade,String member_id);
	
	public int upPreference(Double discount,Integer member_grade);
	
	public int upMessageStatus(Integer message_status);
}
