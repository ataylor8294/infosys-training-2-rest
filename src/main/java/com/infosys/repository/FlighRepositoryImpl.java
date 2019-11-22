package com.infosys.repository;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.beans.Flight;
@Repository
public class FlighRepositoryImpl implements FlightRepository{
	List<Flight> listFlights;

	public List<Flight> searchFlightByDestination(String destination){
		List<Flight> results = new LinkedList<Flight>();
		System.out.println(results);
		for (Flight flight: listFlights) {
			if(flight.getDestination().equals(destination)) {
				results.add(flight);
			}
		}
		return results;
	}

	@Override
	public List<Flight> searchFlightBySrouve(String source) {
		List<Flight> results = new LinkedList<Flight>();
		for (Flight flight: listFlights) {
			if(flight.getJourneyDate().equals(source)) {
				results.add(flight);
			}
		}
		return results;
	}
	@Override
	public List<Flight> searchFlightbyDate(Date journeyDate) {
		List<Flight> results = new LinkedList<Flight>();
		for (Flight flight: listFlights) {
			if(flight.getJourneyDate().equals(journeyDate)) {
				results.add(flight);
			}
		}
		return results;
	}

	@Override
	public void addFlight(String airlines, String source, String destination, Double fare, Date journeyDate,
			Integer setCount) {
		if (listFlights==null) {
			listFlights = new LinkedList<Flight>();
			Flight flight = new Flight();
			flight.setAirlines(airlines);
			flight.setSource(source);
			flight.setDestination(destination);
			flight.setFare(fare);
			flight.setJourneyDate(journeyDate);
			flight.setSetCount(setCount);
			listFlights.add(flight);
			System.out.println(flight);
			
		}
		else {
			Flight flight = new Flight();
			flight.setAirlines(airlines);
			flight.setSource(source);
			flight.setDestination(destination);
			flight.setFare(fare);
			flight.setJourneyDate(journeyDate);
			flight.setSetCount(setCount);
			listFlights.add(flight);
		}

	}
}
