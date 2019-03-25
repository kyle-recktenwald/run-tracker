package com.krecktenwald.app.service;

import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.dto.RunRouteDto;
import com.krecktenwald.app.model.RunRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface RunRecordService {

	public RunRecord getRunRecordById(Long id);
	public List<RunRecord> getRunRecords();
	public void deleteRunRecord(long id);

}
