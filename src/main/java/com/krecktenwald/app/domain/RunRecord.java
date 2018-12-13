package com.krecktenwald.app.domain;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

import com.krecktenwald.app.conversion.AppConversion;

public class RunRecord {
    
    UUID id;
    Duration duration;
    RunRoute route;
    LocalDate date;
    LocalTime timeOfDay;
	double distance;
    String notes;
    String weather;
    int temperature;
	Duration pace;
    
    public RunRecord(UUID id, Duration duration, RunRoute route, LocalDate date, LocalTime timeOfDay,
            double distance, String notes, int temperature, String weather, Duration pace) {
        super();
        this.id = id;
        this.duration = duration;
        this.route = route;
        this.date = date;
        this.timeOfDay = timeOfDay;
        this.distance = distance;
        this.notes = notes;
        this.temperature = temperature;
        this.weather = weather;
        this.pace = pace;
    }
    
    public RunRecord() {
        super();
        this.id = UUID.randomUUID();
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }
    public RunRoute getRoute() {
        return route;
    }
    public void setRoute(RunRoute route) {
        this.route = route;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getDistance() {
        return distance;
    }
    public LocalTime getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(LocalTime timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public Duration getPace() {
        return pace;
    }
    public void setPace(Duration pace) {
        this.pace = pace;
    }
    
    @Override
    public String toString() {
        AppConversion appConversion = new AppConversion();
    	
    	return "RunRecord [id=" + id + ", duration=" + appConversion.formatDuration(duration) + ", route=" 
    			+ route.getName() + ", date=" + date + ", time of day=" + timeOfDay + ", distance=" + distance + 
    			", notes=" + notes + ", weather=" + weather + ", pace=" + pace + "]";
    }
}
