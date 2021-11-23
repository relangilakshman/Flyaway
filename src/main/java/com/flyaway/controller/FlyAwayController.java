package com.flyaway.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyaway.model.SearchBean;

@Controller
@RequestMapping("/")
public class FlyAwayController {
	
	@Autowired
	SearchBean searchBean;
	
	@RequestMapping("/flyaway")
	public String home(Model model)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
		  Date date = new Date();  
		searchBean.setTraveldt(formatter.format(date));	
		System.out.println("Date ...."+searchBean.getTraveldt());
		model.addAttribute("searchBean", searchBean);
	return "home/home";	
	}

}
