package com.infosys.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infosys.beans.Flight;
import com.infosys.repository.FlightRepository;
@Component
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightRepository flightRepository;

	
	@Override
	public void addFlight(String airlines, String source, String destination, Double fare, Date journeyDate,
			Integer setCount) {
			flightRepository.addFlight(airlines, source, destination, fare, journeyDate, setCount);
	}

	@Override
	public void searchFlightBySource(String source) {
		// TODO Auto-generated method stub
		List<Flight> list =flightRepository.searchFlightBySrouve(source);
		for (Flight flight: list) {
			System.out.println(flight);
			
		}
	}

	@Override
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
}
