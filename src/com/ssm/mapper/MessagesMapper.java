package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Members;
import com.ssm.model.Messages;


/**
 * Mapperӳ����
 * @author linbingwen
 * @time 2015.5.15
 */
public interface MessagesMapper {
	
	public List<Messages> selectByStatus();
	
	public List<Messages> selectByStatus2();
	
	public  Double selectPreference();
	
	public  Double selectPreference1(Integer grade);
	
	public List<Members> selectIntegrate();
	
	public void upGrade(@Param("grade")Integer grade,@Param("member_id")String member_id);
	
	public int upPreference(@Param("discount")Double discount,@Param("member_grade")Integer member_grade);
	
	public int upMessageStatus(@Param("message_id")Integer message_id);
}
