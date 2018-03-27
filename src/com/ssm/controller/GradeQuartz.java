package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.model.Members;
import com.ssm.service.MessagesServiceImpl;

@Controller
public class GradeQuartz {

	@Autowired
	private MessagesServiceImpl messagesServiceImpl;
	
	public void selectIntegrate(){
		
		List<Members> member = messagesServiceImpl.selectIntegrate();
		
		if(member!=null && member.size()>0){
			
			for(int i=0;i<member.size();i++){
				
				if(member.get(i).getIntegrate()>20000){
					
					Integer grade = 5;
					messagesServiceImpl.upGrade(grade, member.get(i).getMember_id());
				}else if(member.get(i).getIntegrate()>8000){
					
					Integer grade = 4;
					messagesServiceImpl.upGrade(grade, member.get(i).getMember_id());
				}else if(member.get(i).getIntegrate()>3000){
					
					Integer grade = 3;
					messagesServiceImpl.upGrade(grade, member.get(i).getMember_id());
				}else if(member.get(i).getIntegrate()>1000){
					
					Integer grade = 2;
					messagesServiceImpl.upGrade(grade, member.get(i).getMember_id());
				}
			}
		}
	}
}
