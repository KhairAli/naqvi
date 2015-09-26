package com.btrs.dao;

import com.btrs.model.Vehicle;
import com.btrs.util.DBUtil;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO implements Serializable{
	
	
	public  void addVehicle(Vehicle vehicle) throws SQLException {
		String query = "insert into vehicle(v_no,v_type,v_seats) values (?,?,?)";
		PreparedStatement ps =  DBUtil.getPreparedStatement(query);
		ps.setString(1, vehicle.getVehicleNo());
		ps.setString(2, vehicle.getVehicleType());
		ps.setInt(3, vehicle.getVechicleSeats());
        ps.executeUpdate();
	}
	
	public List<Vehicle> getList() throws SQLException {
		String query  = "Select * from Vehicle";
		ResultSet rs = DBUtil.getResultSet(query);
		List<Vehicle>  list = new ArrayList<>();
		while(rs.next()) {
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleNo(rs.getString(2));
			vehicle.setVehicleType(rs.getString(3));
			vehicle.setVechicleSeats(rs.getInt(4));
			list.add(vehicle);
		}
		return list;
	}
	
	public void  delete(Vehicle vehicle) throws SQLException {
		String query = "Delete From Vehicle where v_no = ?";
		PreparedStatement ps = DBUtil.getPreparedStatement(query);
		ps.setString(1, vehicle.getVehicleNo());
		ps.executeUpdate();
	}
 
}
