package com.infosys.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infosys.beans.Flight;
import com.infosys.repository.FlightRepository;
@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightRepository flightRepository;

	
	@Override
	public void addFlight(Flight flight) {
			flightRepository.save(flight);
	}

	@Override
	public List<Flight> searchFlightBySource(String source) {
		// TODO Auto-generated method stub
		List<Flight> list = flightRepository.findBySource(source);
		return list;
		
		
	}
	@Override
	public List<Flight> searchAllFlights(){
		List<Flight> flights  = flightRepository.findAll();
		return flights;
	}
	/*@Override
	public void searchFlightByDestination(String destination) {
		// TODO Auto-generated method stub
		List<Flight> list =flightRepository.searchFlightByDestination(destination);
		for (Flight flight: list) {
			System.out.println(flight);
			
		}
	}

	@Override
	public void searchFlightByDate(Date journeyDate) {
		List<Flight> list =flightRepository.searchFlightbyDate(journeyDate);
		for (Flight flight: list) {
			System.out.println(flight);
			
		}
	}
	*/
	@Override
	public List<Flight> searchByAirline(String airline){
		return flightRepository.findByAirlines(airline);
	}

	@Override
	public void delete(Flight flight) {
		flightRepository.delete(flight);
		
	}

	@Override
	public void update(Flight flight) {
		if (flightRepository.existsById(flight.getFlightId())) {
			Flight flights = flightRepository.getOne(flight.getFlightId());
			flights.setSource(flight.getSource());
			flights.setDestination(flight.getDestination());
			flightRepository.save(flights);
		}
		
	}
}
