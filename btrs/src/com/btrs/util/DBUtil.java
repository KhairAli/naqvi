package com.btrs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private static Connection connection = getConnection();

	private static Connection getConnection() {
		
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/btrs","root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
	}
	
	public  static  Connection buildConnection(){
		return connection;
	}
	
	public  static ResultSet  getResultSet(String query) {
		Statement statement =null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = statement.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public  static PreparedStatement  getPreparedStatement(String query) {
		PreparedStatement statement =null;
		Integer i = 0;
		try {
			statement = connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}

	public  static boolean  updateRecord(String query) {
		Statement statement =null;
		boolean flag = false;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			flag  =  statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	
}
