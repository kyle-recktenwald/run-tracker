package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.dao.IRunRecordDao;
import com.krecktenwald.app.dao.IRunRouteDao;
import com.krecktenwald.app.dao.common.IOperations;
import com.krecktenwald.app.model.RunRecord;
import com.krecktenwald.app.model.RunRoute;
import com.krecktenwald.app.service.IRunRecordService;
import com.krecktenwald.app.service.IRunRouteService;
import com.krecktenwald.app.service.common.AbstractHibernateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RunRecordService extends AbstractHibernateService<RunRecord> implements IRunRecordService {

    @Autowired
    @Qualifier("runRecordHibernateDao")
    private IRunRecordDao dao;

    public RunRecordService() {
        super();
    }

    // API

    @Override
    protected IOperations<RunRecord> getDao() {
        return dao;
    }

}
