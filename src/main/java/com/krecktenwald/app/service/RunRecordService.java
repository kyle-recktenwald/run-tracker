package com.krecktenwald.app.service;

import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.dto.RunRouteDto;

import java.util.List;
import java.util.UUID;

public interface RunRecordService {

	RunRecordDto getRunRecordById(UUID runRecordId);
    
	void saveRunRecord(RunRecordDto runRecordDto);
    
	List<RunRecordDto> getAllRunRecords();
}
