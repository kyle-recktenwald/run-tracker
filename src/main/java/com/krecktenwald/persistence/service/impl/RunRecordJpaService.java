package com.krecktenwald.persistence.service.impl;

import com.krecktenwald.persistence.dao.IRunRecordDao;
import com.krecktenwald.persistence.dao.common.IOperations;
import com.krecktenwald.persistence.model.RunRecord;
import com.krecktenwald.persistence.service.IRunRecordService;
import com.krecktenwald.persistence.service.common.AbstractJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RunRecordJpaService extends AbstractJpaService<RunRecord> implements IRunRecordService {

    @Autowired
    @Qualifier("barJpaDao")
    private IRunRecordDao dao;

    public RunRecordJpaService() {
        super();
    }

    // API

    @Override
    protected IOperations<RunRecord> getDao() {
        return dao;
    }

}