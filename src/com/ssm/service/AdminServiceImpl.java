package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.AdminMapper;
import com.ssm.model.Accounts;
import com.ssm.model.Admin;
import com.ssm.model.Billiards;
import com.ssm.model.Members;
import com.ssm.model.Useinfo;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public Admin checkLogin(Admin admin) {
		// TODO Auto-generated method stub
		admin = adminMapper.checkLogin(admin);
		if(admin!=null){
			return admin;
		}
		return null;
	}
	@Override
	public Members checkByTel(String member_tel) {
		// TODO Auto-generated method stub
		Members member = adminMapper.checkByTel(member_tel);
		if(member!=null){
			return member;
		}
		return null;
	}
	@Override
	public int regist(Members members) {
		// TODO Auto-generated method stub
		int m= adminMapper.regist(members);
		
		if(m>0){
			
			return m;
		}
		return 0;
	}
	@Override
	public Admin lock_ckeck(String admin_id, String lock_password) {
		// TODO Auto-generated method stub
		Admin admin = adminMapper.lock_ckeck(admin_id, lock_password);
		return admin;
	}
	@Override
	public List<Members> membersBycondition(Members members) {
		// TODO Auto-generated method stub
		
		List<Members> list = adminMapper.membersBycondition(members);
		return list;
	}
	@Override
	public List<Members> memberpage(String member_name,String member_tel,Integer grade ,int startPos, int pageSize) {
		// TODO Auto-generated method stub
		List<Members> list =adminMapper.memberpage(member_name,member_tel,grade,startPos, pageSize);
		return list;
	}
	@Override
	public void upreserve() {
		// TODO Auto-generated method stub
		adminMapper.upreserve();
	}
	@Override
	public List<Useinfo> getReserve() {
		// TODO Auto-generated method stub
		List<Useinfo> list = adminMapper.getReserve();
		return list;
	}

	@Override
	public int addannoun(Integer billard_id, String announ_title,
			String announ_content) {
		// TODO Auto-generated method stub
		int m = adminMapper.addannoun(billard_id, announ_title, announ_content);
		return m;
	}
	@Override
	public int uplockpass(Integer billard_id, String admin_tel,
			String admin_name, String lock_password) {
		// TODO Auto-generated method stub
		int m = adminMapper.uplockpass(billard_id, admin_tel, admin_name, lock_password);
		return m;
	}
	@Override
	public List<Billiards> getNoUseinfo() {
		// TODO Auto-generated method stub
		return adminMapper.getNoUseinfo();
	}
	@Override
	public List<Accounts> getMemUseinfo() {
		// TODO Auto-generated method stub
		return adminMapper.getMemUseinfo();
	}
	@Override
	public List<Accounts> getAccounts(String member_tel, String YYYY,
			String MM, String DD) {
		String date = getDate(YYYY,MM,DD);
		
		// TODO Auto-generated method stub
		return adminMapper.getAccounts(date,member_tel);
	}
	

	
	public String getDate(String YYYY,String MM, String DD) {
		StringBuilder sbl = new StringBuilder(200);
		if(!YYYY.equals("0")){
			
			sbl.append(YYYY);
			
				if(!MM.equals("0")){
					if(MM.length()<2){
						MM="0"+MM;
					}
					sbl.append(MM);
					
						if(!DD.equals("0")){
							
							if(DD.length()<2){
								DD="0"+DD;
							}
							sbl.append(DD);
				}
			}
		}
		
		
		

			return  sbl.toString();
		
	}
	@Override
	public int deleteById(String[] items) {
		// TODO Auto-generated method stub
		return adminMapper.deleteById(items);
	}
	@Override
	public List<Accounts> getAccountsBybillid(String member_tel, String YYYY,
			String MM, String DD, Integer billiard_id) {
		// TODO Auto-generated method stub
		String date = getDate(YYYY,MM,DD);
		return adminMapper.getAccountsBybillid(date, billiard_id,member_tel);
	}

	
}
