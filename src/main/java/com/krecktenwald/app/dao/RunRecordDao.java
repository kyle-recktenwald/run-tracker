package com.krecktenwald.app.dao;

import com.krecktenwald.app.model.RunRecord;

import java.util.List;

public interface RunRecordDao {
    public RunRecord get(Long id);
    public List<RunRecord> getAll();
    public void save(RunRecord runRecord);
    public void update(RunRecord runRecord, String[] params);
    public void delete(RunRecord runRecord);
}
