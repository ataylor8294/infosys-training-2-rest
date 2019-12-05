package com.infosys.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "flight")
public class Flight {
	@Id
	@Column(name="flightid")
	@JsonProperty("flight_id")
	private Integer flightId;
	@Column(name="airlines")
	@JsonProperty("airlines")
	private String airlines;
	@Column(name="source")
	@JsonProperty("source")
	private String source;
	@Column(name="destination")
	@JsonProperty("destination")
	private String destination;
	@Column(name="capacity")
	@JsonProperty("capacity")
	private Integer setCount;
	public Integer getFlightId() {
		return flightId;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlines=" + airlines + ", source=" + source + ", destination="
				+ destination + ", setCount=" + setCount + "]";
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getSetCount() {
		return setCount;
	}
	public void setSetCount(Integer setCount) {
		this.setCount = setCount;
	}
}
