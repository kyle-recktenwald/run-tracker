package com.krecktenwald.app;
import java.util.UUID;

public class RunRecord {
    
    UUID id;
    String time;
    long route;
    String date;
    double distance;
    String notes;
    String weather;
    String pace;
    
    public RunRecord(UUID id, String time, long route, String date,
            double distance, String notes, String weather, String pace) {
        super();
        this.id = id;
        this.time = time;
        this.route = route;
        this.date = date;
        this.distance = distance;
        this.notes = notes;
        this.weather = weather;
        this.pace = pace;
    }
    
    public RunRecord() {
        super();
    }
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public long getRoute() {
        return route;
    }
    public void setRoute(long route) {
        this.route = route;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
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
    public String getPace() {
        return pace;
    }
    public void setPace(String pace) {
        this.pace = pace;
    }
    @Override
    public String toString() {
        return "RunRecord [id=" + id + ", time=" + time + ", route=" + route
                + ", date=" + date + ", distance=" + distance + ", notes="
                + notes + ", weather=" + weather + ", pace=" + pace + "]";
    }
}
