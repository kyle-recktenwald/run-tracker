package com.krecktenwald.persistence.dao.impl;

import com.krecktenwald.persistence.dao.IRunRecordDao;
import com.krecktenwald.persistence.dao.common.AbstractHibernateDao;
import com.krecktenwald.persistence.dao.IRunRouteDao;
import com.krecktenwald.persistence.model.RunRecord;
import com.krecktenwald.persistence.model.RunRoute;
import org.springframework.stereotype.Repository;


@Repository
public class RunRecordDao extends AbstractHibernateDao<RunRecord> implements IRunRecordDao {

	public RunRecordDao() {
		super();
		setClazz(RunRecord.class);
	}

}

