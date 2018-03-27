package com.ssm.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jxl.Workbook;
import jxl.format.Border;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.model.Accounts;
import com.ssm.model.Admin;
import com.ssm.model.Billiards;
import com.ssm.model.Members;
import com.ssm.model.Page;
import com.ssm.model.Useinfo;
import com.ssm.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@RequestMapping(value="login",method = RequestMethod.POST)
	public void getUser(Admin admin,HttpSession session,HttpServletResponse res){
		 admin = adminService.checkLogin(admin);
			 try {
				 if(admin!=null){
					 session.setAttribute("admin", admin);
				res.getWriter().print("1");
				}
				 else{
					 
					 res.getWriter().print("0");
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	@RequestMapping(value="login1",method = RequestMethod.POST)
	public void getUser1(Admin admin,HttpServletResponse res){
		 admin = adminService.checkLogin(admin);
			 try {
				 if(admin!=null){
				res.getWriter().print("1");
				}
				 else{
					 
					 res.getWriter().print("0");
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	
	@RequestMapping("uplockpass")
	public String uplockpass(Integer billard_id,String admin_tel,String admin_name,String lock_password,Model model) {
		
		int m = adminService.uplockpass(billard_id, admin_tel, admin_name, lock_password);
		
		if(m>0){
			model.addAttribute("error", "找回密码成功");
		}else{
			
			model.addAttribute("error", "输入信息有误");
		}
	return "lock";
}
		
		@RequestMapping("adminannoun")
		public String addannoun(Integer billard_id,String announ_title,String announ_content,Model model) {
			
			int m = adminService.addannoun(billard_id, announ_title, announ_content);
			
			if(m>0){
				model.addAttribute("message", "添加成功");
			}
		return "addannounce";
    }
		
		@RequestMapping("remove")
		public String loginOut(HttpServletRequest request) {
			// 清除session
			Enumeration<String> em = request.getSession().getAttributeNames();
			while (em.hasMoreElements()) {
				request.getSession().removeAttribute(em.nextElement().toString());
			}
			//request.getSession().removeAttribute(GlobalConstants.USER_SESSION);
			request.getSession().invalidate();
		return "index";
    }
		
		
		@RequestMapping("adminselect")
	    public String adminselect(Integer station,Integer billiardid,Model model,HttpSession session) throws UnsupportedEncodingException{
		
			int count =0;
			
			if(station==1){
				
				List<Billiards> nouseInfo = adminService.getNoUseinfo();
				
				if(nouseInfo!=null && nouseInfo.size()>0){
					
					if(billiardid==0){
						
						model.addAttribute("nouseInfo_list", nouseInfo);
					}else{
						
						for(Billiards billiard:nouseInfo){
				
					if(billiard.getBilliard_id()==billiardid){
						
						model.addAttribute("noUseinfo", billiard);
					}
				}
					}	
			}
			}
			if(station==2){
				
				List<Useinfo> list = adminService.getReserve();
				if(list!=null && list.size()>0){
					for(int i=0;i<list.size();i++){
						
						 if(billiardid==0){
							
							model.addAttribute("use_list", list);
						}else if(billiardid==list.get(i).getBillard_id()){
							count++;
							model.addAttribute("userinfo", list.get(i));
						}
					}
					
				if(billiardid!=0 && count==0){
					
					model.addAttribute("message", "暂无数据");
				}

			   }	else{
					
					model.addAttribute("message", "暂无数据");
				}
			}
			
			if(station ==3){
				int sum = 0;
				List<Accounts> list = adminService.getMemUseinfo();
				if(list!=null && list.size()>0){
					for(int i=0;i<list.size();i++){
						
						 if(billiardid==0){
							
							model.addAttribute("memUse_list", list);
						}else if(billiardid==list.get(i).getBilliard_id()){
							sum++;
							model.addAttribute("memUse", list.get(i));
						}
					}
					
				if(billiardid!=0 && sum==0){
					
					model.addAttribute("message", "暂无数据");
				}

			   }	else{
					
					model.addAttribute("message", "暂无数据");
				}
			}
			
			model.addAttribute("billiardid", billiardid);
			model.addAttribute("status", station);
			return "viewbilliard";
	    }
		
		
		
		
		
		
		
		
		
		
		@RequestMapping("export")
		public String export(HttpSession session,HttpServletResponse resp,Model model) throws Exception{
			

			resp.setHeader("Content-disposition", "attachment; filename="
					+ new String("结算信息表".getBytes("utf-8"), "iso-8859-1") + ".xls");
			resp.setHeader("pragma", "no-cache");
			resp.setContentType("application/msexcel");
			ServletOutputStream os = resp.getOutputStream();
			List<Accounts> list = (List<Accounts>) session.getAttribute("EXPORT_LIST");
			if (list == null || list.size()==0) {
				
				model.addAttribute("message", "没有数据");
			}
			
			else{
			try {
				WritableWorkbook workbook = Workbook.createWorkbook(os);
				WritableSheet ws = workbook.createSheet("结算信息表", 0);

				int rowNum = 0;

				WritableFont font1 = new WritableFont(WritableFont.TIMES, 16,
						WritableFont.BOLD);
				WritableCellFormat format1 = new WritableCellFormat(font1);
				Label cell = new Label(3, 0, "消费清单", format1);
				ws.addCell(cell);
				
				WritableCellFormat cellFormat2 = new WritableCellFormat();
				cellFormat2.setBorder(Border.ALL, jxl.format.BorderLineStyle.THIN);

				ws.setColumnView(7, 50);

				ws.addCell(new Label(0, 1, "消费单号" , cellFormat2));
				ws.addCell(new Label(1, 1, "消费者id" , cellFormat2));
				ws.addCell(new Label(2, 1, "台球桌号" , cellFormat2));
				ws.addCell(new Label(3, 1, "消费开始时间" , cellFormat2));
				ws.addCell(new Label(4, 1, "消费结束时间" , cellFormat2));
				ws.addCell(new Label(5, 1, "消费时长" , cellFormat2));
				ws.addCell(new Label(6, 1, "消费金额" , cellFormat2));
				
				
				rowNum = 2;
				for (int i = 0; i < list.size(); i++, rowNum++) {// 幨sheet
					Accounts tmp = list.get(i);

					ws.addCell(new Label(0, rowNum, tmp.getAccount_id() + "", cellFormat2));
					ws.addCell(new Label(1, rowNum, tmp.getMember_id(), cellFormat2));
					
					ws.addCell(new Label(2, rowNum, tmp.getBilliard_id()+"",
							cellFormat2));
					ws.addCell(new Label(3, rowNum, tmp.getAccount_start()+"",
							cellFormat2));
					ws.addCell(new Label(4, rowNum, tmp.getAccount_end()+"",
							cellFormat2));
					ws.addCell(new Label(5, rowNum, tmp.getDuration()+"",
							cellFormat2));
					ws.addCell(new Label(6, rowNum, tmp.getPrice()+"",
							cellFormat2));
				
				}
				workbook.write();
				workbook.close();
				os.close();
			} catch (RowsExceededException e) {
				throw new RuntimeException(e);
			} catch (WriteException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			}

			
			return "account";
		} 
		
		
		@RequestMapping(value="adminAccounts")
		public String adminAccounts(String member_tel,String YYYY,String MM,String DD,Model model,HttpSession session){
			List<Accounts> list =adminService.getAccounts(member_tel, YYYY, MM, DD);
		
			if(list!=null && list.size()>0){
				model.addAttribute("accounts_list",list);
				session.setAttribute("EXPORT_LIST", list);
			}
			
			else{
				model.addAttribute("message", "没有此信息");
			}
			model.addAttribute("YYYY", YYYY);
			model.addAttribute("MM", MM);
			model.addAttribute("DD", DD);
			
			session.setAttribute("yyyy", YYYY);
			session.setAttribute("mm", MM);
			session.setAttribute("dd", DD);
			session.setAttribute("membertel", member_tel);
			
				return "account";
			}
		
		@RequestMapping(value="billiardAccount")
		public String billiardAccount(Integer billiard,Model model,HttpSession session){
			
			String member_tel="";
			String YYYY="";
			String MM = "";
			String DD ="";
			
			if(session.getAttribute("yyyy")!=null){
				YYYY = session.getAttribute("yyyy").toString();
			}
			if(session.getAttribute("mm")!=null){
				MM = session.getAttribute("mm").toString();
			}
			if(session.getAttribute("dd")!=null){
				DD = session.getAttribute("dd").toString();
			}
			if(session.getAttribute("membertel")!=null){
				member_tel = session.getAttribute("membertel").toString();
			}
			
			
			List<Accounts> list = adminService.getAccountsBybillid(member_tel, YYYY, MM, DD, billiard) ;
			if(list!=null && list.size()>0){
			
					model.addAttribute("account_list", list);
				}else{
					model.addAttribute("message", "没有此信息");
				}
			  
			
			model.addAttribute("YYYY", YYYY);
			model.addAttribute("MM", MM);
			model.addAttribute("DD", DD);
			model.addAttribute("billiard_id", billiard);
				return "account";
			}
	@RequestMapping(value="lockcheck")
	public String getLockcheck( String billard_id,String lock_password,Model model){
		Admin admin = adminService.lock_ckeck(billard_id, lock_password);
		if(admin!=null){
			 return "redirect:initialize.do";
		}	
		model.addAttribute("error", "密码错误");
		return "lock";
	}
	
	@RequestMapping(value="check",method = RequestMethod.POST)
	public void getCheck(String member_tel,HttpServletResponse res){
		 Members member = adminService.checkByTel(member_tel);
			 try {
				 if(member!=null){
				res.getWriter().print("1");
				}
				 else{
					 
					 res.getWriter().print("0");
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
	@RequestMapping(value="select")
	public String getPage(Members members,HttpServletRequest req,Model model,HttpSession session){
			
		
		if(members.getGrade()!=null){
			
			
		}else{
			
			members = (Members) session.getAttribute("members");
		}
			List<Members> list = adminService.membersBycondition(members);
		
			Page page =null;
			String pageNow = req.getParameter("pageNow");
			
			if(pageNow ==null){
				
				 page = new Page(list.size(),1);
			}else{
		 	 page = new Page(list.size(),Integer.parseInt(pageNow));
			}
				
			List<Members> list2  = adminService.memberpage(members.getMember_name(),members.getMember_tel(),members.getGrade(),page.getStartPos(),page.getPageSize());
			
			if(list2!=null){
				model.addAttribute("page", page);
				model.addAttribute("members_list", list2);
			}
			session.setAttribute("members", members);
		return "viewmember";

	}
	
	@RequestMapping(value="checkdelete")
	public String checkdelete(String[] items,Model model){
		
		int m =adminService.deleteById(items);
		if(m>0){
			model.addAttribute("message", "删除成功");
		}
		return "redirect:select.do";
	}
	
	@RequestMapping(value="regist")
	public String getRegist(Members members,Model model){
		 int m = adminService.regist(members);
		 if(m>0){
			 model.addAttribute("message", "添加成功!");
			 return "addmember";
		 }
		return "error";

	}
	
	@RequestMapping(value="success")
	public String getIndex(){
		return "redirect:getbilliard.do";
	}
	
	@RequestMapping(value="{formName}")
	public String getRedirect(@PathVariable String formName){
		return formName;
	}
	
}
