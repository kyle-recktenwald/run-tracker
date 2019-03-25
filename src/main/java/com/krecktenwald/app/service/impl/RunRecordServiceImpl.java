package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.dao.RunRecordDao;
import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.model.RunRecord;
import com.krecktenwald.app.service.RunRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RunRecordServiceImpl implements RunRecordService {

    @Autowired
    RunRecordDao runRecordDao;

    @Override
    public RunRecord findById(Long id) {
        return null;
    }

    @Override
    public List<RunRecord> getRunRecords() {
        return null;
    }

    @Override
    public void delete(Long runRecordId) {

    }

    @Override
    public void save(RunRecordDto runRecordDto) {

    }

    @Override
    public void update(RunRecordDto runRecordDto, Long runRecordId) {

    }
}
