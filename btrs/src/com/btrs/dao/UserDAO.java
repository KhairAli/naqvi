package com.btrs.dao;

import java.sql.Connection;
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
	
	public void  addUser(User user) {
		String query ="Insert into User values ";
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
