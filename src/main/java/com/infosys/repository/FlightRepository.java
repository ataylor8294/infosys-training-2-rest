package com.infosys.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.infosys.beans.Flight;


@Repository

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	public List<Flight> findBySource(String source);
	public List<Flight> findByAirlines(String airline);

	
	

}
