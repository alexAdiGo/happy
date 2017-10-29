package com.cg.mob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mob.dao.IMobileDAO;
import com.cg.mob.dto.Mobile;
import com.cg.mob.dto.PurchaseDetails;

@Service
public class MobileServiceImpl implements IMobileService{

	@Autowired
	private IMobileDAO mobDao;

	public IMobileDAO getMobDao() {
		return mobDao;
	}

	public void setMobDao(IMobileDAO mobDao) {
		this.mobDao = mobDao;
	}

	@Override
	public List<Mobile> getAllMobile() {
		return mobDao.getAllMobile();
	}

	@Override
	public Mobile getMobileById(int mobId) {
		return mobDao.getMobileById(mobId);
	}

	@Override
	public PurchaseDetails addPurchaseDetails(PurchaseDetails pDetail) {
		return mobDao.addPurchaseDetails(pDetail);
	}

	@Override
	public List<Integer> getAllMobileIds() {
		return mobDao.getAllMobileIds();
	}

	@Override
	public void updateMobileQuantity(int bookedQuan, int mobileId) {
		mobDao.updateMobileQuantity(bookedQuan,mobileId);
	}
	
	
	
	
}
