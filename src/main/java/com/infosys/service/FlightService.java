package com.infosys.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.beans.Flight;
import com.infosys.repository.FlightRepository;

@Service
public interface FlightService {
	public void addFlight(String airlines, String source, String destination, Double fare, Date journeyDate, Integer setCount);
	public void searchFlightBySource(String source);
	public void searchFlightByDestination(String destination);
	public void searchFlightByDate(Date journeyDate);


	

}
