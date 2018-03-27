package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssm.mapper.MessagesMapper;
import com.ssm.model.Members;
import com.ssm.model.Messages;


@Component
public class MessagesServiceImpl implements MessagesService {

	@Autowired
	private MessagesMapper messagesMapper;

	@Override
	public List<Messages> selectByStatus() {
		// TODO Auto-generated method stub
		List<Messages> list = messagesMapper.selectByStatus();
		if(list!=null){
			return list;
		}
		return null;
	}

	@Override
	public Double selectPreference() {
		// TODO Auto-generated method stub
		
		Double pre = messagesMapper.selectPreference();
		return pre;
	}

	@Override
	public Double selectPreference(Integer grade) {
		// TODO Auto-generated method stub
		
		Double  peference = messagesMapper.selectPreference1(grade);
		
		return peference;
	}

	@Override
	public List<Members> selectIntegrate() {
		// TODO Auto-generated method stub
		List<Members> member = messagesMapper.selectIntegrate();
		return member;
	}

	@Override
	public void upGrade(Integer grade, String member_id) {
		// TODO Auto-generated method stub
		messagesMapper.upGrade(grade, member_id);
	}

	@Override
	public int upPreference(Double discount,Integer member_grade) {
		// TODO Auto-generated method stub
		return messagesMapper.upPreference(discount,member_grade);
	}

	@Override
	public int upMessageStatus(Integer message_status) {
		// TODO Auto-generated method stub
		return messagesMapper.upMessageStatus(message_status);
	}

	@Override
	public List<Messages> selectByStatus2() {
		// TODO Auto-generated method stub
		return messagesMapper.selectByStatus2();
	}


	
}
