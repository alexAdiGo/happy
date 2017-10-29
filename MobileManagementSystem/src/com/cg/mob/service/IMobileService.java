package com.cg.mob.service;

import java.util.List;

import com.cg.mob.dto.Mobile;
import com.cg.mob.dto.PurchaseDetails;

public interface IMobileService {

	List<Mobile> getAllMobile();

	Mobile getMobileById(int mobId);

	PurchaseDetails addPurchaseDetails(PurchaseDetails pDetail);

	List<Integer> getAllMobileIds();

	void updateMobileQuantity(int bookedQuan, int mobileId);

}
