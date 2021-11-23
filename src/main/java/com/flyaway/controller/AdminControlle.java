package com.flyaway.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyaway.model.Admin;
import com.flyaway.model.Flight;
import com.flyaway.service.FlyawayService;

@Controller
@RequestMapping("/admin")
public class AdminControlle {
	
	private String npassword;
	private String rpassword;
	
	@Autowired
	Admin admin;
	
	@Autowired
	FlyawayService service;
	
	public String getNpassword() {
		return npassword;
	}



	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}



	public String getRpassword() {
		return rpassword;
	}



	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}



	@RequestMapping("/login")
	public String admin(Model model)
	{
		System.out.println("Admi.......");
	model.addAttribute("admin", admin);	
	return "admin/login";	
	}
	
	@RequestMapping("/signin")
	public String signin(Model model)
	{
		model.addAttribute("admin", admin);
	return "admin/home";	
	}
	
	
	@RequestMapping("/addFlight")
	public String add(Flight flight,Model model)
	{
		System.out.println("AddFlight.......");
		System.out.println("input flightNo........."+flight.getFlightNo());
		System.out.println("input flightName........."+flight.getFlightName());
		System.out.println("input Source........."+flight.getSource());
		System.out.println("input Dest........."+flight.getDest());
		System.out.println("input Date........."+flight.getDate());
		System.out.println("input sc_time........."+flight.getScTime());
		System.out.println("input vc_sheets........."+flight.getVcSheets());
		service.saveFlight(flight);
		model.addAttribute("admin", admin);
	return "admin/home";	
	}
	
	
	@RequestMapping("/changePassword")
	public String changePassword(Model model)
	{
		model.addAttribute("admin", admin);
	return "admin/changePassword";	
	}
	
	@RequestMapping("/updatePassword")
	public String updatePassword(Admin admin,String npassword, Model model)
	{
	System.out.println("Admin userId ..."+admin.getUserId());	
	System.out.println("Admin password ..."+admin.getPassword());
	System.out.println("Admin npassword ..."+npassword);
	admin.setPassword(npassword);
	service.updateAdmin(admin);
	return "admin/changePassword";	
	}

}
