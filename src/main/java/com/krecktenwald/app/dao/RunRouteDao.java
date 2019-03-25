package com.krecktenwald.app.dao;


import com.krecktenwald.app.model.RunRoute;

import java.util.List;

public interface RunRouteDao {

    public RunRoute get(Long id);
    public List<RunRoute> getAll();
    public RunRoute findByName(String name);
    public void save(RunRoute runRecord);
    public void update(RunRoute runRecord, String[] params);
    public void delete(RunRoute runRecord);

}
