package com.btrs.dao;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.btrs.model.City;
import com.btrs.model.Vehicle;
import com.btrs.util.DBUtil;

public class CityDAO implements Serializable {
	
	
	public void addCity(City city) throws SQLException {
		String query = "Insert into cities (c_name) values(?)";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setString(1, city.getCityName());
		ps.executeUpdate();
	}
	
	public List<City> getList() throws SQLException {
		String query = "Select * from cities";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ResultSet rs = ps.executeQuery();
		List<City> list = new ArrayList();
		while(rs.next()) {
			City city = new City();
			city.setId(rs.getInt(1));
			city.setCityName(rs.getString(2));
			list.add(city);
		}
		
		return list;
		
	}

	public void  delete(City city) throws SQLException {
		String query = "Delete From cities where c_id = ?";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setInt(1, city.getId());
		ps.executeUpdate();
	}

}
