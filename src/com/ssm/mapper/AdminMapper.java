package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Accounts;
import com.ssm.model.Admin;
import com.ssm.model.Billiards;
import com.ssm.model.Members;
import com.ssm.model.Useinfo;

public interface AdminMapper {

	public Admin checkLogin(Admin admin);
	public Members checkByTel(String member_tel);
	public int regist(Members members);
	public Admin lock_ckeck(String admin_id,String lock_password);
	
	public  List<Members> membersBycondition(Members members);
	
	public List<Members> memberpage(@Param(value="member_name") String member_name,@Param(value="member_tel") String member_tel,@Param(value="grade") Integer grade ,@Param(value="startPos") int startPos,@Param(value="pageSize") int pageSize);

	public void upreserve();
	
	public List<Useinfo> getReserve();
	
	
	public int addannoun(@Param(value="billard_id")Integer billard_id,
			@Param(value="announ_title")String announ_title,@Param(value="announ_content")String announ_content);
	
	public int uplockpass(@Param(value="billard_id")Integer billard_id,@Param(value="admin_tel")String admin_tel,
			@Param(value="admin_name")String admin_name,@Param(value="lock_password")String lock_password);
	
	public List<Billiards> getNoUseinfo();
	
	public List<Accounts> getMemUseinfo();
	
	public List<Accounts> getAccounts(@Param("date")String date,@Param("member_tel")String member_tel);
	
	public List<Accounts> getAccountsBybillid(@Param("date")String date,
			
			@Param("billiard_id")Integer billiard_id,@Param("member_tel")String member_tel);
	
	public int deleteById(@Param(value="items")String[] items);
	
	
	
}
