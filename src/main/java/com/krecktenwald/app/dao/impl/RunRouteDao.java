package com.krecktenwald.app.dao.impl;


import com.krecktenwald.app.dao.common.AbstractHibernateDao;
import com.krecktenwald.app.dao.IRunRouteDao;
import com.krecktenwald.app.model.RunRoute;
import org.springframework.stereotype.Repository;

@Repository
public class RunRouteDao extends AbstractHibernateDao<RunRoute> implements IRunRouteDao {

	public RunRouteDao() {
		super();
		setClazz(RunRoute.class);
	}

	// API
}
