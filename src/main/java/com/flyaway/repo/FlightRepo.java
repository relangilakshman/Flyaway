package com.flyaway.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flyaway.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, String> {
	
	
	List <Flight> findBySourceIgnoreCaseAndDestIgnoreCaseAndDate(String source,String dest,String date);

}
