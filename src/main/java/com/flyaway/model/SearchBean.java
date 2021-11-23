package com.flyaway.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SearchBean {
	
	private String source;
	private String dest;
	private int nop;
	private String traveldt;
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
	public int getNop() {
		return nop;
	}
	public void setNop(int nop) {
		this.nop = nop;
	}
	public String getTraveldt() {
		return traveldt;
	}
	public void setTraveldt(String traveldt) {
		this.traveldt = traveldt;
	}
	
	
	

}
