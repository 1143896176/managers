package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Accounts;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Members;
import com.ssm.service.AccountServiceImpl;

@Controller
public class AccountController {

	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	
	public void selectAccount(){
		
		List<Accounts> accounts = accountServiceImpl.getMemberInfo();
		
		if(accounts!=null && accounts.size()>0){
			
			for(int i=0;i<accounts.size();i++){
				
				accountServiceImpl.accountMember(accounts.get(i).getMember_id(), accounts.get(i).getPrice());
			}
			accountServiceImpl.upAccountStatus();
		}
		
	}




	
}
