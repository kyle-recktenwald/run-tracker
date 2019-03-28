package com.krecktenwald.app.dao.impl;

import com.krecktenwald.app.dao.common.AbstractHibernateDao;
import com.krecktenwald.app.dao.IRunRouteDao;
import com.krecktenwald.app.model.RunRoute;
import org.springframework.stereotype.Repository;


@Repository
public class RunRecordDao extends AbstractHibernateDao<RunRoute> implements IRunRouteDao {

	public RunRecordDao() {
		super();
		setClazz(RunRoute.class);
	}

}

