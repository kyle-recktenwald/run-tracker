package com.krecktenwald.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
public class RunRecord extends BaseEntity implements Serializable {

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

    @Column(name="run_record_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private UUID runRouteId;

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


	

}
