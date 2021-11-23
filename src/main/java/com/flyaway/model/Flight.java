package com.flyaway.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Flight {
	
	@Id
	private String flightNo;
	private String flightName;
	private int vcSheets;
	private String source;
	private String dest;
	private String scTime;
	private String date;	
	private double ticketCost;
	
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getVcSheets() {
		return vcSheets;
	}
	public void setVcSheets(int vcSheets) {
		this.vcSheets = vcSheets;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getScTime() {
		return scTime;
	}
	public void setScTime(String scTime) {
		this.scTime = scTime;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	

}
