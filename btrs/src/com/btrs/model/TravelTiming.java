package com.btrs.model;

import java.util.Date;

public class TravelTiming extends GenericModel {
	
	private SrcDest srcDest ; 
	private Date time;
	private Vehicle vehicle;
	private Long rent;
	public SrcDest getSrcDest() {
		return srcDest;
	}
	public void setSrcDest(SrcDest srcDest) {
		this.srcDest = srcDest;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Long getRent() {
		return rent;
	}
	public void setRent(Long rent) {
		this.rent = rent;
	}
	
	
	

}
