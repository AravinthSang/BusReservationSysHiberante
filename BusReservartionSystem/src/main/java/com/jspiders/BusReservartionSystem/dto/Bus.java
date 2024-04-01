package com.jspiders.BusReservartionSystem.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {
	@Id
	private int busId;
	private Boolean isAc;
	private String busNo;
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", isAc=" + isAc + ", busNo=" + busNo + "]";
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public Boolean getIsAc() {
		return isAc;
	}
	public void setIsAc(Boolean isAc) {
		this.isAc = isAc;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
}
