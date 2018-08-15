package com.krecktenwald.app;

public class RunRoute {
    
    long id;
    String name;
    double miles;
    String averagePace;
    
    public RunRoute(long id, String name, double miles, String averagePace) {
        super();
        this.id = id;
        this.name = name;
        this.miles = miles;
        this.averagePace = averagePace;
    }
    
    public RunRoute() {
        super();
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setMiles(double miles) {
        this.miles = miles;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAveragePace() {
        return averagePace;
    }
    public void setAveragePace(String averagePace) {
        this.averagePace = averagePace;
    }
    @Override
    public String toString() {
        return "RunRoute [id=" + id + ", name=" + name + ", miles=" + miles
                + ", averagePace=" + averagePace + "]";
    }
    
    
    
    

}
