package com.ssm.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Messages;
import com.ssm.service.MessagesServiceImpl;



@Controller
public class MessagesController {

	@Autowired
	private MessagesServiceImpl messagesServiceImpl;
	
	
	@RequestMapping("manage")
	public String manage(HttpSession session){
		
		
		return "redirect:initialize.do";
	}
	
	
	@RequestMapping("initialize")
	public String initialize(HttpSession session){
		
		List<Messages> list = messagesServiceImpl.selectByStatus();
		if(list!=null){
			System.out.print(list.size());
			session.setAttribute("messages_list", list);
		}
		return "redirect:reserves.do";
	}
	
	@RequestMapping("message")
	public String message(Model model){
		
		List<Messages> list = messagesServiceImpl.selectByStatus();
		if(list!=null && list.size()>0){
			
			model.addAttribute("message_list", list);
		}
		return "message";
	}
	
	@RequestMapping("messageread")
	public String messageread(Model model){
		
		List<Messages> list = messagesServiceImpl.selectByStatus2();
		if(list!=null && list.size()>0){
			
			model.addAttribute("messageread_list", list);
		}
		return "messageread";
	}
	@RequestMapping("readmessage")
	public String readmessage(Integer message_id,Model model){
		
		int m = messagesServiceImpl.upMessageStatus(message_id);
		if(m<0){
			
			model.addAttribute("message", "失败");
			return "message";
		}
		return "redirect:message.do";
	}
	
	
	
	@RequestMapping("getPreference")
	public void preference(HttpServletResponse res){
		
		Double prefenrence = messagesServiceImpl.selectPreference();
		
		try {
			
			if(prefenrence == null){
				
				res.getWriter().print("");
			}else{
			res.getWriter().print(prefenrence);}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("preferen")
	public String preferen(Double discount,Integer member_grade,Model model){
		
		int m = messagesServiceImpl.upPreference(discount, member_grade);
		if(m>0){
			
			model.addAttribute("message", "修改成功");
		}else{
			model.addAttribute("message", "修改失败");
		}
		return "preference";
	}
	
	
	
	@RequestMapping("getPreference1")
	public void preference1(Integer grade,HttpServletResponse res){
		
		Double prefenrence = messagesServiceImpl.selectPreference(grade);
		
		try {
			
			if(prefenrence == null){
				
				res.getWriter().print("");
			}else{
			res.getWriter().print(prefenrence);}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
}
