package com.krecktenwald.app.service;

import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.dto.RunRouteDto;
import com.krecktenwald.app.model.RunRecord;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface RunRecordService {

	public RunRecord findById(Long id);
	public List<RunRecord> getRunRecords();
	public void delete(Long runRecordId);
	public void save(RunRecordDto runRecordDto);
	public void update(RunRecordDto runRecordDto, Long runRecordId);

}
