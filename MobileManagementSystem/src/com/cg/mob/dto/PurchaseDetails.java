package com.cg.mob.dto;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

@Entity
public class PurchaseDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purchaseId;
	
	@Column(name="cname")
	@NotEmpty
	@Pattern(regexp="[A-Z].*",message="Should start with capital letter")
	private String custName;
	
	@NotEmpty
	private String mailId;
	
	@NotEmpty
	private String phoneNo;
	
	@Past
	private Date purchaseDate;
	
	@NotNull
	private int mobileId;
	
	@NotNull 
	private double totalAmt;
	
	@NotNull 
	private int bookedQuan;
	
	
	public int getBookedQuan() {
		return bookedQuan;
	}
	public void setBookedQuan(int bookedQuan) {
		this.bookedQuan = bookedQuan;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", custName="
				+ custName + ", mailId=" + mailId + ", phoneNo=" + phoneNo
				+ ", purchaseDate=" + purchaseDate + ", mobileId=" + mobileId
				+ ", totalAmt=" + totalAmt + ", bookedQuan=" + bookedQuan + "]";
	}
	
}
