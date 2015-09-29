package com.btrs.controller;

import java.io.Serializable;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.HttpSession;

import com.btrs.common.SessionUtil;
import com.btrs.model.EPay;
import com.btrs.model.User;
import com.btrs.service.EPayService;

@ManagedBean
@ViewScoped
public class EPayController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EPay ePay = new EPay();
	private EPayService ePayService= new EPayService();
	
	@PostConstruct
	public void init() {
		HttpSession session =  SessionUtil.getSession();
		User user = (User)session.getAttribute("currentUser");
		ePay.setUser(user);
	}
	
	public void balanceInquiry() {

		Long balance = null;
		
		try {
			balance = ePayService.balanceInquiry(ePay);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	System.out.println(balance);
		//return "";
		
	}

	public EPay getePay() {
		return ePay;
	}

	public void setePay(EPay ePay) {
		this.ePay = ePay;
	}
	
	
}
