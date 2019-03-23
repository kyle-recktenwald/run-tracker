package com.krecktenwald.app.service;

import com.krecktenwald.app.dto.RunRouteDto;

import java.util.List;

public interface RunRouteService {

    RunRouteDto getRunRouteById(Integer userId);
    
    void saveRunRoute(RunRouteDto runRouteDto);
    
    List<RunRouteDto> getAllRunRoutes();
}
