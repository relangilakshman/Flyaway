package com.flyaway.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyaway.model.Flight;
import com.flyaway.model.Ticket;
import com.flyaway.service.FlyawayService;

@Controller
@RequestMapping("/flyaway")
public class RegistrationController {
	
	@Autowired
	FlyawayService service;
	
	@RequestMapping("/bookFlight/{flightNo}")
	public String book(@PathVariable("flightNo") String flightNo, Model model)
	{
		Flight flight=null;
		Ticket ticket=new Ticket();
		System.out.println("input flightNo........."+flightNo);
		 flight=service.searchFlight(flightNo);
		System.out.println("output flightNo........."+flight.getFlightNo());
		model.addAttribute("flight", flight);
		model.addAttribute("ticket", ticket);
		return "register/registration";
	}
	
	@RequestMapping("/register")
	public String registration(Ticket ticket,String flno, Model model)
	{
		
		System.out.println("input nopasinger........."+ticket.getNopasinger());
		System.out.println("input fname........."+ticket.getFname());
		System.out.println("input lname........."+ticket.getLname());
		System.out.println("input idno........."+ticket.getIdno());
		System.out.println("input phno........."+ticket.getPhno());
		System.out.println("input email........."+ticket.getEmail());
		System.out.println("input flightNo........."+flno);
		Flight flight=service.searchFlight(flno);
		model.addAttribute("flight", flight);
		ticket.setFlight(flight);
		ticket=service.saveTicket(ticket);
		System.out.println("output FlightNo........."+ticket.getFlight().getFlightNo());
		model.addAttribute("ticket", ticket);
	
		return "/payment/payment";
	}
	
	@RequestMapping("/payment")
	public String payment( int ticketId,String amount, Model model)
	{
		
		System.out.println("input ticketId........."+ticketId);
		System.out.println("input amount........."+amount);
		Ticket ticket=service.findTicket(ticketId);
		ticket.setAmount(amount);
		ticket=service.saveTicket(ticket);
		System.out.println("output Amount........."+ticket.getAmount());
		System.out.println("output FlightNo........."+ticket.getFlight().getFlightNo());
		model.addAttribute("ticket", ticket);
		model.addAttribute("flight", ticket.getFlight());
		return "ticket/viewTicket";
	}

}
