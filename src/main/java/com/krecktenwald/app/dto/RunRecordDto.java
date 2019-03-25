package com.krecktenwald.app.dto;

import com.krecktenwald.app.model.RunRoute;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RunRecordDto {
	
	UUID runRecordId;
    Duration duration;
    RunRoute route;
    LocalDate date;
    LocalTime timeOfDay;
	double distance;
    String notes;
    String weather;
    int temperature;
	Duration pace;
    
    List<RunRecordDto> runRecordDtos = new ArrayList<RunRecordDto>();

	public RunRecordDto(UUID runRecordId, Duration duration, RunRoute route, LocalDate date, LocalTime timeOfDay,
			double distance, String notes, String weather, int temperature, Duration pace,
			List<RunRecordDto> runRecordDtos) {
		super();
		this.runRecordId = runRecordId;
		this.duration = duration;
		this.route = route;
		this.date = date;
		this.timeOfDay = timeOfDay;
		this.distance = distance;
		this.notes = notes;
		this.weather = weather;
		this.temperature = temperature;
		this.pace = pace;
		this.runRecordDtos = runRecordDtos;
	}

	public UUID getRunRecordId() {
		return runRecordId;
	}

	public void setRunRecordId(UUID runRecordId) {
		this.runRecordId = runRecordId;
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

	public LocalTime getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(LocalTime timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public double getDistance() {
		return distance;
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

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public Duration getPace() {
		return pace;
	}

	public void setPace(Duration pace) {
		this.pace = pace;
	}

	public List<RunRecordDto> getRunRecordDtos() {
		return runRecordDtos;
	}

	public void setRunRecordDtos(List<RunRecordDto> runRecordDtos) {
		this.runRecordDtos = runRecordDtos;
	}
	
	
    
    


}
