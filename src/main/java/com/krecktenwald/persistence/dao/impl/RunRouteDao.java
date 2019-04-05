package com.krecktenwald.persistence.dao.impl;


import com.krecktenwald.persistence.dao.common.AbstractHibernateDao;
import com.krecktenwald.persistence.dao.IRunRouteDao;
import com.krecktenwald.persistence.model.RunRoute;
import org.springframework.stereotype.Repository;

@Repository
public class RunRouteDao extends AbstractHibernateDao<RunRoute> implements IRunRouteDao {

	public RunRouteDao() {
		super();
		setClazz(RunRoute.class);
	}

	// API
}
