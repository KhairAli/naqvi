package com.btrs.model;

import java.util.Date;

public class TicketReservation extends GenericModel {
	
	private String ticketSerialNo;
	private User user;
	private TravelTiming travelTiming;
	private Integer reserveSeats;
	private Long totalBill;
	private Date reservationDate ;
	public String getTicketSerialNo() {
		return ticketSerialNo;
	}
	public void setTicketSerialNo(String ticketSerialNo) {
		this.ticketSerialNo = ticketSerialNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public TravelTiming getTravelTiming() {
		return travelTiming;
	}
	public void setTravelTiming(TravelTiming travelTiming) {
		this.travelTiming = travelTiming;
	}
	public Integer getReserveSeats() {
		return reserveSeats;
	}
	public void setReserveSeats(Integer reserveSeats) {
		this.reserveSeats = reserveSeats;
	}
	public Long getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(Long totalBill) {
		this.totalBill = totalBill;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	} 
	
	

}
