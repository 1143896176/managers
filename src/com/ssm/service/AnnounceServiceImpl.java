package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.AnnounceMapper;
import com.ssm.model.Announcement;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Billiards;

@Service
public class AnnounceServiceImpl implements AnnounceService {

	@Autowired
	private AnnounceMapper announceMapper;

	@Override
	public List<Announcement> getAnnoun() {
		// TODO Auto-generated method stub
		List<Announcement> announ = announceMapper.getAnnoun();
		return announ;
	}

	@Override
	public int adminBill(Billiards billiard) {
		// TODO Auto-generated method stub
		
		
		int m = announceMapper.adminBill(billiard);
		
		return m;
	}
	

	@Override
	public List<BillardAccounts> getBilliardAccounts() {
		// TODO Auto-generated method stub
		return announceMapper.getBilliardAccounts();
	}
}
