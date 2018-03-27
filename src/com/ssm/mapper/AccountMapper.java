package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Accounts;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Members;

public interface AccountMapper {

	public void upAccountStatus();
	
	public List<Accounts> getMemberInfo();
	
	public void accountMember(@Param("member_id")String member_id,@Param("balance")Double balance);
	
	
}
