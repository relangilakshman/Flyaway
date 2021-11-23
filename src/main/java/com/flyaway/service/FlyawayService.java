package com.flyaway.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyaway.model.Admin;
import com.flyaway.model.Flight;
import com.flyaway.model.Ticket;
import com.flyaway.repo.AdminRepo;
import com.flyaway.repo.FlightRepo;
import com.flyaway.repo.TicketRepo;

@Service
public class FlyawayService {
	@Autowired
	FlightRepo flightrepo;
	
	@Autowired
	TicketRepo ticketrepo;
	
	@Autowired
	AdminRepo adminrepo;
	
	@Autowired
	Flight flight;
	
	public List<Flight> searchAllFlight()
	{
		
		return (List<Flight>) flightrepo.findAll();
	}
	
	public List<Flight> searchAllFlights(String source,String dest,String date)
	{
		System.out.println("Source ........."+source);
		System.out.println("Destingation ........."+dest);
		System.out.println("TravelDate ........."+date);
		return (List<Flight>) flightrepo.findBySourceIgnoreCaseAndDestIgnoreCaseAndDate(source, dest,date);
	}
	
	public Flight searchFlight(String flightNo)
	{
		
		Flight flight=flightrepo.findById(flightNo).orElse(new Flight());
		
		return flight;
	}
	

	public Ticket saveTicket(Ticket ticket)
	{
		
		 ticket=ticketrepo.save(ticket);
		
		return ticket;
	}
	
	public Ticket findTicket(int ticketId)
	{
		
		Ticket ticket=ticketrepo.findById(ticketId).orElse(new Ticket());
		
		return ticket;
	}
	
	
	public Flight saveFlight(Flight fligh)
	{
		
		Flight flight=flightrepo.save(fligh);
		
		return flight;
	}
	
	public Admin updateAdmin(Admin admin)
	{
		
		Admin adm=adminrepo.findById(admin.getUserId()).orElse(new Admin());
		adm.setPassword(admin.getPassword());
		int i=adminrepo.updatPasswordByUserId(admin.getPassword(), admin.getUserId());
		return adm;
	}

}
