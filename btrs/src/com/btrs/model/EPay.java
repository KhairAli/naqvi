package com.btrs.model;

public class EPay extends GenericModel {
	
	private String ePayAcountNo ;
	private User user;
	private Long balance ;
	public String getePayAcountNo() {
		return ePayAcountNo;
	}
	public void setePayAcountNo(String ePayAcountNo) {
		this.ePayAcountNo = ePayAcountNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	

}
