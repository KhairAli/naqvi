package com.btrs.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.btrs.model.EPay;
import com.btrs.model.User;
import com.btrs.util.DBUtil;

public class EPayDAO {
	
	
	
	public  Long  getBalance(EPay ePay) throws SQLException {
		String query = "Select * from e_pay where u_id = ? and ep_account_no"; 
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setInt(1, ePay.getUser().getId());
		ps.setString(1, ePay.getePayAcountNo());
		
		ResultSet rs = ps.executeQuery();
		Long balance = null;
		while(rs.next()) {
			balance  = rs.getLong("ep_balance");
		}
		return balance;
	}
	
	public void updateBalance(EPay ePay) throws SQLException {
		String query = "Update e_pay set ep_balance = ? where u_id = ?";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setInt(1, ePay.getUser().getId());
		ps.executeUpdate();
	}

}
