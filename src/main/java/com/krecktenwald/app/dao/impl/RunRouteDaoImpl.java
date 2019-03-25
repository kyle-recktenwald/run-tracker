package com.krecktenwald.app.dao.impl;


import com.krecktenwald.app.dao.RunRouteDao;
import com.krecktenwald.app.model.RunRoute;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRouteDaoImpl implements RunRouteDao {

	private List<RunRoute> runRoutes = new ArrayList<>();

	@Override
	public RunRoute get(Long id) {
		return runRoutes.get(Math.toIntExact(id));
	}

	@Override
	public List<RunRoute> getAll() {
		return runRoutes;
	}

	@Override
	public RunRoute findByName(String name) {
		return null;
	}

	@Override
	public void save(RunRoute runRoute) {
		runRoutes.add(runRoute);
	}

	@Override
	public void update(RunRoute runRoute, String[] params) {

	}

	@Override
	public void delete(RunRoute runRoute) {
		runRoutes.remove(runRoute);
	}
}
