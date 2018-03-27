package com.ssm.service;

import java.util.List;

import com.ssm.model.Accounts;
import com.ssm.model.Admin;
import com.ssm.model.Billiards;
import com.ssm.model.Members;
import com.ssm.model.Useinfo;

public interface AdminService {

	public Admin checkLogin(Admin admin);
	public Members checkByTel(String member_tel);
	public int regist(Members members);
	public Admin lock_ckeck(String admin_id,String lock_password);
	public  List<Members> membersBycondition(Members members);
	public List<Members> memberpage(String member_name,String member_tel,Integer grade,int startPos,int pageSize);
	
	public void upreserve();
	
	public List<Useinfo> getReserve();
	 
	 
	 public int addannoun(Integer billard_id,String announ_title,String announ_content);
	 
	 public int uplockpass(Integer billard_id,String admin_tel,String admin_name,String lock_password);
	 
	 public List<Billiards> getNoUseinfo();
	 
	 public List<Accounts> getAccounts(String member_tel,String YYYY,String MM,String DD);
	 
	 public List<Accounts> getAccountsBybillid(String member_tel,String YYYY,String MM,String DD,Integer billiard_id);
	 
	 public List<Accounts> getMemUseinfo();
	 
	 public int deleteById(String[] items);
}
