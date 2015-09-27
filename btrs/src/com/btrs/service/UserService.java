package com.btrs.service;

import java.sql.SQLException;

import com.btrs.dao.UserDAO;
import com.btrs.model.User;

public class UserService {
	
	UserDAO uDAO = new UserDAO();
	
	public Integer registerUser(User user) throws SQLException {
		user.setUserType("User");
		return uDAO.addUser(user);
	}
	
	public User authenticateUser(User user) throws SQLException {
		return uDAO.getUser(user);
	}

}
