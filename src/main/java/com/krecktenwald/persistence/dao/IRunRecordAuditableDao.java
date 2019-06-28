package com.krecktenwald.persistence.dao;

import com.krecktenwald.persistence.dao.common.IAuditOperations;
import com.krecktenwald.persistence.model.RunRecord;

public interface IRunRecordAuditableDao extends IRunRecordDao, IAuditOperations<RunRecord> {
    //
}
