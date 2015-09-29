package com.btrs.service;

import java.sql.SQLException;
import java.util.List;

import com.btrs.dao.VehicleDAO;
import com.btrs.model.Vehicle;

public class VehicleServie implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VehicleDAO vDAO = new VehicleDAO();
	
	public void addVehicle(Vehicle v) throws SQLException {
		vDAO.addVehicle(v);
	}
	
	public  List<Vehicle>  getVehicleList() throws SQLException {
		return vDAO.getList();
	}
	
	public void deleteVehicle(Vehicle v) throws SQLException {
		vDAO.delete(v);
	}

}
