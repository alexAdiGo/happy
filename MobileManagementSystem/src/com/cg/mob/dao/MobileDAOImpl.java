package com.cg.mob.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.mob.dto.Mobile;
import com.cg.mob.dto.PurchaseDetails;

@Repository
@Transactional
public class MobileDAOImpl implements IMobileDAO{

	
	@PersistenceContext
	private EntityManager entityManager;


	
	@Override
	public List<Mobile> getAllMobile() {

		Query q = entityManager.createNamedQuery("getAllMobile");
		return q.getResultList(); 
	}



	@Override
	public Mobile getMobileById(int mobId) {
		Query q = entityManager.createNamedQuery("getMobileById");
		q.setParameter("mid", mobId);
		
		Mobile mob = new Mobile();
		mob = (Mobile) q.getSingleResult();
		System.out.println("in DAO"+mob);
		return mob;
	}

	@Override
	public PurchaseDetails addPurchaseDetails(PurchaseDetails pDetail) {
		
		if(pDetail != null){
			entityManager.persist(pDetail);
		}
		return pDetail;
	}

	@Override
	public List<Integer> getAllMobileIds() {
		Query q = entityManager.createNamedQuery("getMobileIds");
		return q.getResultList(); 
	}



	@Override
	public void updateMobileQuantity(int bookedQuan, int mobileId) {
		
		
		Query q = entityManager.createQuery("UPDATE Mobile mob SET mob.quantity = mob.quantity - :bQuan WHERE mob.mobileId = :mobId ");
		q.setParameter("bQuan", bookedQuan);
		q.setParameter("mobId", mobileId);
		q.executeUpdate();
		System.out.println("Updated SuccessFully");
	}

	
}
