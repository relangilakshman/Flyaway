package com.flyaway.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyaway.model.Flight;
import com.flyaway.model.SearchBean;
import com.flyaway.service.FlyawayService;

@Controller
public class SearchController {
	
	@Autowired
	FlyawayService service;
	
	@Autowired
	Flight flight;
	
	@RequestMapping("/flyaway/search")
	public String search(SearchBean searchBean,Model model)
	{
	
		System.out.println("Source ........."+searchBean.getSource());
		System.out.println("Destingation ........."+searchBean.getDest());
		System.out.println("TravelDate ........."+searchBean.getTraveldt());
		System.out.println("No Of Pasingers ........."+searchBean.getNop());
		String [] ud=searchBean.getTraveldt().split("-");
		
		String acdate=ud[2]+"/"+ud[1]+"/"+ud[0];
		System.out.println("updated TravelDate ........."+acdate);
	//List<Flight> flights=service.searchAllFlight();
		List<Flight> flights=null;
		
	    flights = service.searchAllFlights(searchBean.getSource(),searchBean.getDest(),acdate );
		
	System.out.println("Search Result size is...."+flights.size());
	//HttpSession session=request.getSession();
	model.addAttribute("flights", flights);
	
	return "home/home";	
	}

}
