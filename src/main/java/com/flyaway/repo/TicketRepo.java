package com.flyaway.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyaway.model.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
