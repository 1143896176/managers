package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.service.AdminService;
import com.ssm.service.MessagesService;

@Controller
public class ReserveQuartz {
	
	
	@Autowired
	private AdminService adminService;
	

	
	
public void startBatch(){
	
	adminService.upreserve();
	}
}
