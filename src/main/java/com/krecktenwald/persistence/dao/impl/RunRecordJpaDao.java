package com.krecktenwald.persistence.dao.impl;

import com.krecktenwald.persistence.dao.IRunRecordDao;
import com.krecktenwald.persistence.dao.common.AbstractJpaDao;
import com.krecktenwald.persistence.model.RunRecord;
import org.springframework.stereotype.Repository;

@Repository
public class RunRecordJpaDao extends AbstractJpaDao<RunRecord> implements IRunRecordDao {

    public RunRecordJpaDao() {
        super();

        setClazz(RunRecord.class);
    }

    // API

}