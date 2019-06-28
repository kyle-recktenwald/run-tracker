package com.krecktenwald.persistence.service.impl;

import java.io.Serializable;

import com.krecktenwald.persistence.dao.IRunRecordCrudRepository;
import com.krecktenwald.persistence.model.RunRecord;
import com.krecktenwald.persistence.service.IRunRecordService;
import com.krecktenwald.persistence.service.common.AbstractSpringDataJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class RunRecordSpringDataJpaService extends AbstractSpringDataJpaService<RunRecord> implements IRunRecordService {

    @Autowired
    private IRunRecordCrudRepository dao;

    public RunRecordSpringDataJpaService() {
        super();
    }

    @Override
    protected CrudRepository<RunRecord, Serializable> getDao() {
        return dao;
    }

}
