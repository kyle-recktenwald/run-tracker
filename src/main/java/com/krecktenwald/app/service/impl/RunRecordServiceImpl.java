package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.service.RunRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RunRecordServiceImpl implements RunRecordService {

    @Autowired
    RunRecordDto runRecordDto;

    @Override
    public RunRecordDto getRunRecordById(UUID runRecordId) {
        return null;
    }

    @Override
    public void saveRunRecord(RunRecordDto runRecordDto) {

    }

    @Override
    public List<RunRecordDto> getAllRunRecords() {
        return null;
    }
}
