package com.ssm.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.Accounts;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Members;

public interface AccountService {

	public void upAccountStatus();
	
	public List<Accounts> getMemberInfo();
	
	public void accountMember(String member_id,Double balance);
	

}
