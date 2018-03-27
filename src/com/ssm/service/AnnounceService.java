package com.ssm.service;

import java.util.List;

import com.ssm.model.Announcement;
import com.ssm.model.BillardAccounts;
import com.ssm.model.Billiards;

public interface AnnounceService {

	public List<Announcement> getAnnoun();
	
	public int adminBill(Billiards billiard);
	
	public List<BillardAccounts> getBilliardAccounts();
}
