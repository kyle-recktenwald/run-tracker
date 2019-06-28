package com.krecktenwald.persistence.service.impl;

import com.krecktenwald.persistence.dao.IRunRecordAuditableDao;
import com.krecktenwald.persistence.dao.IRunRecordDao;
import com.krecktenwald.persistence.dao.common.IAuditOperations;
import com.krecktenwald.persistence.dao.common.IOperations;
import com.krecktenwald.persistence.model.RunRecord;
import com.krecktenwald.persistence.service.IRunRecordAuditableService;
import com.krecktenwald.persistence.service.common.AbstractHibernateAuditableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RunRecordAuditableService extends AbstractHibernateAuditableService<RunRecord> implements IRunRecordAuditableService {

    @Autowired
    @Qualifier("barHibernateDao")
    private IRunRecordDao dao;

    @Autowired
    @Qualifier("barHibernateAuditableDao")
    private IRunRecordAuditableDao auditDao;

    public RunRecordAuditableService() {
        super();
    }

    // API

    @Override
    protected IOperations<RunRecord> getDao() {
        return dao;
    }

    @Override
    protected IAuditOperations<RunRecord> getAuditableDao() {
        return auditDao;
    }

}
