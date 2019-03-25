package com.krecktenwald.app.service;

import com.krecktenwald.app.dto.RunRouteDto;
import com.krecktenwald.app.model.RunRoute;

import java.util.List;

public interface RunRouteService {

    public RunRoute findById(Long runRouteId);
    public RunRoute findByName(String runRouteName);
    public List<RunRouteDto> getRunRoutes();
    public void save(RunRouteDto runRouteDto);
    public void delete(Long runRouteId);
    public void update(RunRouteDto runRouteDto, Long runRouteId);

}
