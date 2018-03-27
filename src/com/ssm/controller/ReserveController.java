package com.ssm.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Accounts;
import com.ssm.model.Members;
import com.ssm.model.Messages;
import com.ssm.model.Page;
import com.ssm.model.Reserve;
import com.ssm.model.Useinfo;
import com.ssm.service.AccountServiceImpl;
import com.ssm.service.MessagesServiceImpl;
import com.ssm.service.ReserveServiceImpl;



@Controller
public class ReserveController {

	@Autowired
	private ReserveServiceImpl reserveServiceImpl;
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	
	@RequestMapping("getbilliard")
	public String getId(HttpSession session){
		List<Integer> list= reserveServiceImpl.getBilliardId();
			
		if(list!=null){
			
			session.setAttribute("billiard_list",list);
		}
		return "manage";
	}



	
	@RequestMapping("reserves")
	public String initialize(HttpSession session){
		
		List<Reserve> list = reserveServiceImpl.selectByStatus();
		if(list!=null){
			System.out.print(list.size());
			session.setAttribute("reserve_list", list);
		}
		return "redirect:getbilliard.do";
	}
	
	
	@RequestMapping("noreserve")
	public String noReserve(Integer reserve_id,Model model){
		reserveServiceImpl.upReserve(reserve_id);
		model.addAttribute("message", "操作成功");
		return "reserve";
	}
	@RequestMapping("beginUse")
	public String beginUse(Integer billiard,String user_name,HttpSession session){
		
		
		reserveServiceImpl.beginUse(billiard, user_name);
		
		return "viewbilliard";
	}
	
	
	@RequestMapping("getMemaccount")
	public String getMemaccount(Integer account_id,HttpSession session,Model model){
		
				Accounts account = reserveServiceImpl.getMemuse(account_id);
		
		
		Date now = new Date();
	
		double dur = now.getTime()-account.getAccount_start().getTime();
	
			double tim =dur/(60*60*1000);
		
		Double acc = tim*account.getPrice()*account.getDiscount();


		String durationString =new java.text.DecimalFormat("#.00").format(tim);
		
		String PriceString = new java.text.DecimalFormat("#.00").format(acc);
		
		if(account.getMember().getBalance()<acc){
			model.addAttribute("message", "余额不足");
		}else{
			accountServiceImpl.accountMember(account.getMember_id(), new Double(PriceString));
			
			reserveServiceImpl.upAccountsInfo( new Double(durationString), new Double(PriceString), account_id);
		model.addAttribute("message", "操作成功");
		}
		
		
		return "viewbilliard";
	}

	
	@RequestMapping("getaccount")
	public String getAccount(Integer use_id,Model model,HttpSession session){
		
				Useinfo useinfo = reserveServiceImpl.getUseruse(use_id);
		
		
		Date now = new Date();
	
		double dur = now.getTime()-useinfo.getUse_start().getTime();
	
			double tim =dur/(60*60*1000);
		
		Double acc = tim*useinfo.getPrice();


		String durationString =new java.text.DecimalFormat("#.00").format(tim);
		
		String PriceString = new java.text.DecimalFormat("#.00").format(acc);
		reserveServiceImpl.upUseinfo(use_id);
		reserveServiceImpl.insertAccount(useinfo.getBillard_id(), useinfo.getUser_name(), new Double(PriceString), useinfo.getUse_start(),new Double(durationString));
		
		model.addAttribute("start", useinfo.getUse_start());
		model.addAttribute("end", now);
		model.addAttribute("during", new Double(durationString));
		model.addAttribute("price", new Double(PriceString));
		return "viewbilliard";
	}
	@RequestMapping("MembeginUse")
	public String MembeginUse(Integer billiard,String member_tel,HttpSession session){
		
		
		reserveServiceImpl.MembeginUse(billiard, member_tel);
		
		return "viewbilliard";
	}
	
	@RequestMapping("checkMemberid")
	public void checkMemberid(String member_id,HttpServletResponse res){
		
		
		String member_name = reserveServiceImpl.getMem_name(member_id);
		
		try {
			if(member_name!=null){
				res.setCharacterEncoding("utf-8");
			res.getWriter().print(member_name);
			}
			else{
				res.getWriter().print("");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("beginuse")
	public String beginUse(Integer reserve_id,Model model){
		
		
		Reserve reserve = reserveServiceImpl.getReserveinfo(reserve_id);
		
		Double price = reserveServiceImpl.getPrice(reserve.getBillard_id());
		
		double time =reserve.getReserve_end().getTime()-reserve.getReserve_start().getTime();
		
		Members member = reserveServiceImpl.selectBalance(reserve.getMember_id());
		
		Double discount =reserveServiceImpl.getDiscount(member.getGrade());
		
		if(discount==null){
			discount=1.0;
		}
		Double balance =member.getBalance();

		  double tim =time/(60*60*1000);
		  
		  double acc = tim*price*discount;
		
		  String durationString =new java.text.DecimalFormat("#.00").format(tim);
		  
		  String accountString =new java.text.DecimalFormat("#.00").format(acc);
	
				if(balance<acc){
					model.addAttribute("message", "余额不足");
				}else{
					reserveServiceImpl.upReservesuccess(reserve_id);
					
					reserveServiceImpl.addAccount(reserve.getMember_id(), reserve.getBillard_id(), reserve.getReserve_start(),
				reserve.getReserve_end(), new Double(durationString), new Double(accountString));
				model.addAttribute("message", "操作成功");
				}
		
		
		return "reserve";
	}
	
	
	@RequestMapping("selectreserve")
	public String selectReserve(Integer reserve_status,Model model,HttpSession session,HttpServletRequest req){	
		
		if(reserve_status!=null){
				
				
			}else{
				
				reserve_status = (Integer) session.getAttribute("status");
			}	
		
		
		List<Reserve> list = reserveServiceImpl.getReserve(reserve_status);
		
		
		
		if(list!=null && list.size()>0){
			model.addAttribute("dataSize", list.size());
			
			Page page =null;
			String pageNow = req.getParameter("pageNow");
			
			if(pageNow ==null){
				
				 page = new Page(list.size(),1);
			}else{
		 	 page = new Page(list.size(),Integer.parseInt(pageNow));
			}
				
			List<Reserve> list2 = reserveServiceImpl.getReservePage(reserve_status,page.getStartPos(),page.getPageSize());
			
			if(list2!=null){
				model.addAttribute("page", page);
				model.addAttribute("reserve1_list", list2);
				}
			}else{
				model.addAttribute("message", "没有数据");
			}
			model.addAttribute("reserve_status", reserve_status);
			session.setAttribute("status", reserve_status);
			
		return "reserve";
	}
	

	
}
