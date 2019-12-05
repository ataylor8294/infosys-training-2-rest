package com.infosys.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.beans.Flight;
import com.infosys.repository.FlightRepository;

@Service
public interface FlightService {
	public void addFlight(Flight flight);
	public List<Flight> searchFlightBySource(String source);
	public List<Flight> searchAllFlights();
	public List<Flight> searchByAirline(String airline);
	public void delete(Flight flight);
	public void update(Flight flight);

	

}
