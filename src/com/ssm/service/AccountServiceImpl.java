package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.AccountMapper;
import com.ssm.model.Accounts;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Members;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public void upAccountStatus() {
		// TODO Auto-generated method stub
		accountMapper.upAccountStatus();
	}

	@Override
	public List<Accounts> getMemberInfo() {
		// TODO Auto-generated method stub
		List<Accounts> list = accountMapper.getMemberInfo();
		
		return list;
	}

	@Override
	public void accountMember(String member_id, Double balance) {
		// TODO Auto-generated method stub
		
		accountMapper.accountMember(member_id, balance);
		
	}

}
