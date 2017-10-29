package com.cg.mob.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name="Mobile")
@NamedQueries({@NamedQuery(name = "getAllMobile", query = "SELECT mob FROM Mobile mob"),
	@NamedQuery(name="getMobileById", query = "SELECT mob FROM Mobile mob WHERE mob.mobileId = :mid"),
	@NamedQuery(name="getMobileIds", query = "SELECT mob.mobileId FROM Mobile mob"),
})

public class Mobile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mobile_id")
	private int mobileId;
	
	@Column(name="m_name")
	private String mobName;
	private int price;
	private int quantity;
	
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobName=" + mobName
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
}
