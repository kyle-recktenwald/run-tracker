package com.krecktenwald.app.model;

import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class RunRoute  extends BaseEntity implements Persistable<Long> {

    /* PostGres Values:
     * uuid - id
     * text - name
     * numeric(4, 2) - distance
     * bigint - pace
     */

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Column(name="run_route_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long runRouteId;

    @Column(name="name")
    private String name;

    @Column(name="distance")
    private double distance;

    @Column(name="pace")
    private BigInteger pace;

    public RunRoute(String name, double distance, BigInteger pace){
        this.name = name;
        this.distance = distance;
        this.pace = pace;
    }

    public Long getId() {
        return runRouteId;
    }

    public void setRunRouteId(Long runRouteId) {
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

    public BigInteger getPace() {
        return pace;
    }

    public void setPace(BigInteger pace) {
        this.pace = pace;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
