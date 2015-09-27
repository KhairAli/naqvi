package com.btrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btrs.model.User;
import com.btrs.util.DBUtil;

public class UserDAO {
	
	
	public  User  findUser(Integer id){
		
		return null;
	}
	
	public  User getUser(User user) throws SQLException {
		String query = "Select * from Users where u_login = ? and u_password = ?";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setString(1, user.getUserLogin());
		ps.setString(2, user.getUserPassword());
		ResultSet rs =  ps.executeQuery();
		User u = null;
		while(rs.next()) {
			u = new User();
			u.setId(rs.getInt(1));
			u.setUserLogin(rs.getString(2));
			u.setUserPassword(rs.getString(3));
			u.setUserName(rs.getString(4));
			u.setUserCell(rs.getString(5));
			u.setUserAddress(rs.getString(6));
			u.setUserType(rs.getString(7));
		}
		return u;
	}
	
	public Integer  addUser(User user) throws SQLException {
		String query ="Insert into Users(u_login,u_password,u_name,u_cell,u_address,u_type) values(?,?,?,?,?,?) ";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setString(1, user.getUserLogin());
		ps.setString(2,user.getUserPassword());
		ps.setString(3,user.getUserName());
		ps.setString(4, user.getUserCell());
		ps.setString(5, user.getUserAddress());
		ps.setString(6, user.getUserType());
		
		return ps.executeUpdate();
		
	}
	
	
	
	
	
	public   List<User> getAllUser() throws SQLException {
		List<User> list = new ArrayList<>();
		ResultSet rs = DBUtil.getResultSet("Select * from Users ");
		while(rs.next()) {
			User u =new User();
			
			list.add(u);
		}
		return list;
	}

}
