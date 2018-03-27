package com.ssm.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Accounts;
import com.ssm.model.Members;
import com.ssm.model.Reserve;
import com.ssm.model.Useinfo;

public interface ReserveService {

	public List<Reserve> selectByStatus();
	
	public List<Integer> getBilliardId();
	
	public List<Reserve> getReserve(Integer reserve_status);
	
	public void upReserve(Integer reserve_id);
	
	public Double getPrice(Integer billiard_id);
	
	public void upReservesuccess(Integer reserve_id);
	
	public Reserve getReserveinfo(Integer reserve_id);
	
	public void addAccount(String member_id,Integer billiard_id,Date account_start,Date account_end,Double duration,Double price);
	
	public Members selectBalance(String member_id);
	
	public Double getDiscount(Integer grade);
	
	public int beginUse(Integer billiard,String user_name);
	
	public int MembeginUse(Integer billiard,String member_tel);
	
	public String getMem_name(String member_id);
	
	public void upUseinfo(Integer use_id);
	
	public int insertAccount(Integer billard_id,String user_name,Double price,Date account_start,Double duration);
	
	public Useinfo getUseruse(Integer use_id);
	
	public Accounts getMemuse(Integer account_id);
	
	public int upAccountsInfo(Double duration,Double price,Integer account_id );
	
	public List<Reserve> getReservePage(Integer reserve_status,
			Integer startPos,Integer pageSize);
	
}
