package com.krecktenwald.persistence.service;

import com.krecktenwald.persistence.dao.common.IAuditOperations;
import com.krecktenwald.persistence.model.RunRecord;

public interface IRunRecordAuditableService extends IRunRecordService, IAuditOperations<RunRecord> {
}
