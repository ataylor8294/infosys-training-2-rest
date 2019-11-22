package com.infosys.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.infosys.beans.Flight;


public interface FlightRepository {
	
	public void addFlight(String airlines, String source, String destination, Double fare, Date journeyDate, Integer setCount);

	public List<Flight> searchFlightBySrouve(String source );
	public List<Flight> searchFlightByDestination(String destination);
	public List<Flight> searchFlightbyDate(Date journeyDate);
	
	

}
