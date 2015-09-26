package com.btrs.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.btrs.model.City;
import com.btrs.model.Vehicle;
import com.btrs.service.VehicleServie;

@ManagedBean(name = "mgtController")
@ViewScoped

public class ManagementController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Vehicle>  vehicleList = new ArrayList<>();
	private Vehicle vechicle = new Vehicle();
	private VehicleServie vService = new VehicleServie();; 

	private List<City> cityList = new ArrayList<>();
	private City city = new City();
	

	@PostConstruct
	public void init(){

		try {
			vehicleList = vService.getVehicleList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void saveVechile() throws SQLException {
		vService.addVehicle(vechicle);
		vehicleList = vService.getVehicleList();
	}

	public void deleteVehilce(Vehicle v) throws SQLException {
			vService.deleteVehicle(v);
			vehicleList = vService.getVehicleList();
	}
	
	
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public Vehicle getVechicle() {
		return vechicle;
	}

	public void setVechicle(Vehicle vechicle) {
		this.vechicle = vechicle;
	}



	public List<City> getCityList() {
		return cityList;
	}


	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
