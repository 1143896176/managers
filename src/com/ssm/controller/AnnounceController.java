package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Announcement;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Billiards;
import com.ssm.service.AnnounceServiceImpl;

@Controller
public class AnnounceController {

	@Autowired
	private AnnounceServiceImpl announceServiceImpl;
	
	
	@RequestMapping("viewannounce")
	public String viewAnnoun(Model model){
		
	List<Announcement> announ =announceServiceImpl.getAnnoun();
		
	if(announ !=null){
		
		model.addAttribute("announce_list", announ);
	}
		return "viewannounce";
	}
	
	@RequestMapping("adminbill")
	public String adminBill(Billiards billiard,Model model){
		
	int m =announceServiceImpl.adminBill(billiard);
		
	if(m > 0 ){
		
		model.addAttribute("message", "添加成功");
	}
		return "addbilliard";
	}
	
	@RequestMapping("selectMontht")
	public String selectMontht(HttpServletRequest res){	
		
		List<BillardAccounts> list = announceServiceImpl.getBilliardAccounts();
		List<Integer> listX = new ArrayList<Integer>();
		List<Double> listMem = new ArrayList<Double>();
		List<Double> listUser = new ArrayList<Double>();
		
		for(BillardAccounts billaccounts:list){
			
			listX.add(billaccounts.getBilliard_id());
			listMem.add(billaccounts.getMember_price());
			listUser.add(billaccounts.getUser_price());
		}
	/*	String abc1 = JSONArray.fromObject(listX).toString();
		String abc =JSON.toJSONString(listAccoun);
		String abc =JSON.toJSONString(list);
		String abc1 = JSONArray.fromObject(list).toString();
		JSONObject json = new JSONObject();
		json.put("abc", abc);
		json.put("abc1", abc1);*/
		
		res.setAttribute("listX", JSONArray.fromObject(listX).toString());
		res.setAttribute("listMem", JSONArray.fromObject(listMem).toString());
		res.setAttribute("listUser", JSONArray.fromObject(listUser).toString());
		return "accountgrid";
	}

}
