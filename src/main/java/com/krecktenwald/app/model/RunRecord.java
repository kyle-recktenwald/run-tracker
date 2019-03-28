package com.krecktenwald.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class RunRecord extends BaseEntity implements Persistable<Long> {

    /* PostGres Values:
     * uuid - id
     * numeric(4,2)- distance
     * bigint - duration
     * uuid - route_id
     * date - date
     * time without time zone - time_of_day
     * integer - temperature
     * text - weather
     * text - notes
     */

    public RunRecord(){}

    public RunRecord(double distance, BigInteger duration, RunRoute runRoute, LocalDate date, LocalTime timeOfDay,
              int temperature, String weather, String notes){

        this.distance = distance;
        this.duration = duration;
        this.runRoute = runRoute;
        this.date = date;
        this.timeOfDay = timeOfDay;
        this.temperature = temperature;
        this.weather = weather;
        this.notes = notes;
    }

    @Column(name="run_record_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long runRouteId;

    @Column(name="distance")
    private double distance;

    @Column(name="duration")
    private BigInteger duration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "run_route_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private RunRoute runRoute;

    @Column(name="date")
    private LocalDate date;

    @Column(name="time_of_day")
    private LocalTime timeOfDay;

    @Column(name="temperature")
    private int temperature;

    @Column(name="weather")
    private String weather;

    @Column(name="notes")
    private String notes;

    public Long getId() {
        return runRouteId;
    }

    @Override
    public boolean isNew() {
        return false;
    }

    public void setId(Long runRouteId) {
        this.runRouteId = runRouteId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public RunRoute getRunRoute() {
        return runRoute;
    }

    public void setRunRoute(RunRoute runRoute) {
        this.runRoute = runRoute;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
