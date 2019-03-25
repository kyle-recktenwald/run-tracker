
package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.dao.RunRouteDao;
import com.krecktenwald.app.dto.RunRouteDto;
import com.krecktenwald.app.model.RunRoute;
import com.krecktenwald.app.service.RunRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RunRouteServiceImpl implements RunRouteService {

    @Autowired
    private RunRouteDao runRouteDao;

    @Override
    public RunRoute findById(Long runRouteId) {
        RunRoute runRoute = runRouteDao.get(runRouteId);
        return runRoute;
    }

    @Override
    public RunRoute findByName(String runRouteName) {
        return null;
    }

    @Override
    public void save(RunRouteDto runRouteDto) {

    }

    @Override
    public List<RunRouteDto> getRunRoutes() {
        return null;
    }

    @Override
    public void delete(Long runRouteId) {

    }

    @Override
    public void update(RunRouteDto runRouteDto, Long runRouteId) {

    }
}

