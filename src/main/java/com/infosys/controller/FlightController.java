package com.infosys.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.infosys.beans.Flight;
import com.infosys.service.FlightService;

@Controller
@RequestMapping(value="/flights")
public class FlightController {
	Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	FlightService flightService;
	@PostMapping(value = "/add", consumes="application/json")
	public ResponseEntity addFlight(@RequestBody Flight flight) {
		//log.info(flight.getFlightId().toString());
		log.info(flight.toString());
		flightService.addFlight(flight);
		return new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping(value = "/search/airline/{airline}")
	@ResponseBody
	public List<Flight> searchFlightByAriline(@PathVariable String airline) {
		return flightService.searchByAirline(airline);
	}
	@GetMapping(value="/search/all")
	@ResponseBody
	public List<Flight> allFlights(){
		List<Flight> flights = flightService.searchAllFlights();
		for(Flight flight: flights){
			log.info(flight.toString());
		}
		return flights;
	}
	@GetMapping(value = "/search/source/{source}")
	@ResponseBody
	public List<Flight> searchBySource(@PathVariable String source){
		return flightService.searchFlightBySource(source);
	}
	@PostMapping(value="/delete")
	
	public ResponseEntity delete(@RequestBody Flight flight) {
		flightService.delete(flight);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@PostMapping(value="/update", consumes="application/json")
	public ResponseEntity update(@RequestBody Flight flight) {
		flightService.update(flight);
		return new ResponseEntity(HttpStatus.OK);
	}
	

}
