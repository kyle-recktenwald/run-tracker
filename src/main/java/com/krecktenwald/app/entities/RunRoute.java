package com.krecktenwald.app.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Entity
public class RunRoute  extends BaseEntity {

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
    private UUID runRouteId;

    @Column(name="name")
    private String name;

    @Column(name="distance")
    private double distance;

    @Column(name="pace")
    private BigInteger pace;


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

    public BigInteger getPace() {
        return pace;
    }

    public void setPace(BigInteger pace) {
        this.pace = pace;
    }
}
