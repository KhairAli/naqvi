package com.btrs.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.btrs.model.City;
import com.btrs.model.SourceDestination;
import com.btrs.model.Vehicle;
import com.btrs.service.CityService;
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
	private City source = new City();
	private City destination = new City();
	private CityService cService = new CityService();
	
	private List<SourceDestination> srcDestList = new ArrayList<>();
	private SourceDestination srcDest = new SourceDestination();
	
			
	

	@PostConstruct
	public void init(){

		try {
			vehicleList = vService.getVehicleList();
			cityList = cService.getCityList();
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
	
	
	public void saveCity() {
		
		try {
			cService.addCity(city);
			cityList = cService.getCityList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteCity(City c) throws SQLException {
		cService.deleteCity(c);
		cityList = cService.getCityList();
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



	public City getSource() {
		return source;
	}



	public void setSource(City source) {
		this.source = source;
	}



	public City getDestination() {
		return destination;
	}



	public void setDestination(City destination) {
		this.destination = destination;
	}



	public SourceDestination getSrcDest() {
		return srcDest;
	}



	public void setSrcDest(SourceDestination srcDest) {
		this.srcDest = srcDest;
	}



	public List<SourceDestination> getSrcDestList() {
		return srcDestList;
	}



	public void setSrcDestList(List<SourceDestination> srcDestList) {
		this.srcDestList = srcDestList;
	}
	
	
	

}
