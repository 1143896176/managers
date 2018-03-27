package com.ssm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssm.mapper.ReserveMapper;
import com.ssm.model.Accounts;
import com.ssm.model.Members;
import com.ssm.model.Messages;
import com.ssm.model.Reserve;
import com.ssm.model.Useinfo;

@Component
public class ReserveServiceImpl implements ReserveService {
	
	@Autowired
	private ReserveMapper reserveMapper;

	@Override
	public List<Reserve> selectByStatus() {
		// TODO Auto-generated method stub
		List<Reserve> list = reserveMapper.selectByStatus();
		if(list!=null){
			return list;
		}
		return null;
	}

	@Override
	public List<Integer> getBilliardId() {
		// TODO Auto-generated method stub
		List<Integer> list = reserveMapper.getBilliardId();
		return list;
	}

	@Override
	public List<Reserve> getReserve(Integer reserve_status) {
		// TODO Auto-generated method stub
		List<Reserve> list = reserveMapper.getReserve(reserve_status);
		
		return list;
	}

	@Override
	public void upReserve(Integer reserve_id) {
		// TODO Auto-generated method stub
		
		reserveMapper.upReserve(reserve_id);
		
	}

	@Override
	public void upReservesuccess(Integer reserve_id) {
		// TODO Auto-generated method stub
		
		reserveMapper.upReservesuccess(reserve_id);
		
	}

	@Override
	public Reserve getReserveinfo(Integer reserve_id) {
		// TODO Auto-generated method stub
		
		Reserve reserve = reserveMapper.getReserveinfo(reserve_id);
		return reserve;
	}

	@Override
	public void addAccount(String member_id,Integer billiard_id,Date account_start,Date account_end,Double duration,Double price) {
		// TODO Auto-generated method stub
		reserveMapper.addAccount(member_id, billiard_id, account_start, account_end, duration, price);
	}

	@Override
	public Double getPrice(Integer billiard_id) {
		// TODO Auto-generated method stub
		
		Double price = reserveMapper.getPrice(billiard_id);
		return price;
	}

	@Override
	public Members selectBalance(String member_id) {
		// TODO Auto-generated method stub
		
		Members member = reserveMapper.selectBalance(member_id);
		return member;
	}

	@Override
	public Double getDiscount(Integer grade) {
		// TODO Auto-generated method stub
		
		Double discount =	reserveMapper.getDiscount(grade);
		return discount;
	}

	@Override
	public int beginUse(Integer billiard, String user_name) {
		// TODO Auto-generated method stub
		return reserveMapper.beginUse(billiard, user_name);
	}

	@Override
	public int MembeginUse(Integer billiard, String member_tel) {
		// TODO Auto-generated method stub
		return reserveMapper.MembeginUse(billiard, member_tel);
	}

	@Override
	public String getMem_name(String member_id) {
		// TODO Auto-generated method stub
		return reserveMapper.getMem_name(member_id);
	}

	@Override
	public void upUseinfo(Integer use_id) {
		// TODO Auto-generated method stub
		reserveMapper.upUseinfo(use_id);
	}

	@Override
	public int insertAccount(Integer billard_id,String user_name,Double price,Date account_start,Double duration) {
		// TODO Auto-generated method stub
		return reserveMapper.insertAccount(billard_id, user_name, price, account_start, duration);
	}

	@Override
	public Useinfo getUseruse(Integer use_id) {
		// TODO Auto-generated method stub
		return reserveMapper.getUseruse(use_id);
	}

	@Override
	public Accounts getMemuse(Integer use_id) {
		// TODO Auto-generated method stub
		return reserveMapper.getMemuse(use_id);
	}

	@Override
	public int upAccountsInfo( Double duration, Double price,
			Integer account_id) {
		// TODO Auto-generated method stub
		return reserveMapper.upAccountsInfo( duration, price, account_id);
	}

	@Override
	public List<Reserve> getReservePage(Integer reserve_status,
			Integer startPos, Integer pageSize) {
		// TODO Auto-generated method stub
		return reserveMapper.getReservePage(reserve_status, startPos, pageSize);
	}


	
}
