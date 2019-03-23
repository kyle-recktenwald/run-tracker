package com.krecktenwald.app.dto;

import java.time.Duration;
import java.util.UUID;

public class RunRouteDto {
	
	UUID runRouteId;
    String name;
    double distance;
    Duration averagePace;
	
    public RunRouteDto(UUID runRouteId, String name, double distance, Duration averagePace) {
		super();
		this.runRouteId = runRouteId;
		this.name = name;
		this.distance = distance;
		this.averagePace = averagePace;
	}

	public UUID getRunRouteId() {
		return runRouteId;
	}

	public void setRunRouteId(UUID runRouteId) {
		this.runRouteId = runRouteId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Duration getAveragePace() {
		return averagePace;
	}

	public void setAveragePace(Duration averagePace) {
		this.averagePace = averagePace;
	}
    
    
	

}
