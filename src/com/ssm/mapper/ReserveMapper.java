package com.ssm.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Accounts;
import com.ssm.model.Members;
import com.ssm.model.Reserve;
import com.ssm.model.Useinfo;



public interface ReserveMapper {

	public List<Reserve> selectByStatus();
	
	public List<Integer> getBilliardId();
	
	public List<Reserve> getReserve(@Param("reserve_status")Integer reserve_status);
	
	public void upReserve(@Param("reserve_id")Integer reserve_id);
	
	public void upReservesuccess(@Param("reserve_id")Integer reserve_id);
	
	public Double getPrice(@Param("billiard_id")Integer billiard_id);
	
	public Reserve getReserveinfo(@Param("reserve_id")Integer reserve_id);
	
	public void addAccount(@Param("member_id")String member_id,@Param("billiard_id")Integer billiard_id,
			@Param("account_start")Date account_start,@Param("account_end")Date account_end,
			@Param("duration")Double duration,@Param("price")Double price);
	
	
	public Members selectBalance(String member_id);
	
	public Double getDiscount(Integer grade);

	public int beginUse(Integer billiard,String user_name);
	
	public int MembeginUse(Integer billiard,String member_tel);
	
	public String getMem_name(String member_id);
	
	public void upUseinfo(Integer use_id);
	
	public int insertAccount(@Param("billard_id")Integer billard_id,@Param("user_name")String user_name,
			@Param("price")Double price,@Param("account_start")Date account_start,
					@Param("duration")Double duration);
	
	
	public Useinfo getUseruse(@Param("use_id")Integer use_id);
	
	public Accounts getMemuse(@Param("account_id")Integer account_id);
	
	public int upAccountsInfo(@Param("duration")Double duration,@Param("price")Double price,@Param("account_id")Integer account_id );
	
	
	public List<Reserve> getReservePage(@Param("reserve_status")Integer reserve_status,
			@Param("startPos")Integer startPos,@Param("pageSize")Integer pageSize);
	
	
}
