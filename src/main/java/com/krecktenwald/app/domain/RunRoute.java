package com.krecktenwald.app.domain;

import java.time.Duration;
import java.util.UUID;

public class RunRoute {
    
    UUID id;
    String name;
    double distance;
    Duration averagePace;
    
    public RunRoute(UUID id, String name, double distance, Duration averagePace) {
        super();
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.averagePace = averagePace;
    }
    
    public RunRoute() {
        super();
        this.id = UUID.randomUUID();
        this.averagePace = Duration.ZERO;
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public void setDistance(double miles) {
        this.distance = miles;
    }
    
    public double getDistance(){
    	return distance;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAveragePace(Duration averagePace) {
        this.averagePace = averagePace;
    }
    
    public Duration getAveragePace(){
    	return averagePace;
    }
    
    @Override
    public String toString() {
        return "RunRoute [id=" + id + ", name=" + distance + ", miles=" + distance
                + ", averagePace=" + averagePace + "]";
    }
    
    
    
    

}
