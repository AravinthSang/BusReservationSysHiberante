package com.jspiders.BusReservartionSystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	private int ticketId;
	private String date;
	private int busId;
	private int seat;
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", date=" + date + ", busId=" + busId + ", seat=" + seat + "]";
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
}
