package com.krecktenwald.persistence.service.impl;

import com.krecktenwald.persistence.dao.IRunRecordDao;
import com.krecktenwald.persistence.dao.common.IOperations;
import com.krecktenwald.persistence.model.RunRecord;
import com.krecktenwald.persistence.service.IRunRecordService;
import com.krecktenwald.persistence.service.common.AbstractHibernateService;
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
