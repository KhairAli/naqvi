package com.btrs.service;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import com.btrs.dao.CityDAO;
import com.btrs.model.City;

public class CityService implements Serializable{
	
	private CityDAO cDAO = new CityDAO();
	
	public void addCity(City city) throws SQLException{
		
		cDAO.addCity(city);
		
	}
	
   public List<City> getCityList() throws SQLException {
	   return cDAO.getList();
   }

   public void  deleteCity(City city) throws SQLException {
	   cDAO.delete(city);
   }
}
