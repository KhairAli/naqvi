package com.btrs.model;

public class Vehicle extends GenericModel {
	
	private String vehicleNo ; 
	private String vehicleType;
	private Integer vechicleSeats;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Integer getVechicleSeats() {
		return vechicleSeats;
	}
	public void setVechicleSeats(Integer vechicleSeats) {
		this.vechicleSeats = vechicleSeats;
	}
	
	

}
