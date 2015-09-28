package com.btrs.test;

import java.sql.SQLException;

import com.btrs.dao.EPayDAO;
import com.btrs.dao.UserDAO;
import com.btrs.model.User;

public class Test {

	public static void main(String[] args) throws SQLException {
		UserDAO dao = new UserDAO() ;
		EPayDAO e = new EPayDAO();
		User u = new User();
		u.setId(1);
		
	}

}
