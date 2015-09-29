package com.btrs.service;

import java.io.Serializable;
import java.sql.SQLException;

import com.btrs.dao.EPayDAO;
import com.btrs.model.EPay;

public class EPayService implements Serializable{

	private EPayDAO epDAO = new EPayDAO();
	
	public  Long   balanceInquiry(EPay ePay) throws SQLException {
		return epDAO.getBalance(ePay);
	}
	
	public  Integer deductBalance(EPay ePay,Integer bill) throws SQLException {
		Long totalBalance = epDAO.getBalance(ePay);
		totalBalance = totalBalance - bill;
		if(totalBalance < 0){
			return 0;
		}else {
			epDAO.updateBalance(ePay);
			return 1;
		}
		
	}
	
	
	
	
}
