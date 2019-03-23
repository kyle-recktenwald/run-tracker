package com.krecktenwald.app.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.service.RunRecordService;
import com.krecktenwald.utils.Constants;

@RequestMapping("/run-record")
@RestController

public class RunRecordController {
        
	@Autowired
    RunRecordService runRecordService;

    @RequestMapping(Constants.GET_RUN_RECORD_BY_ID)
    public RunRecordDto getRunRecordById(@PathVariable UUID runRecordId) {
        return runRecordService.getRunRecordById(runRecordId);
    }

    @RequestMapping(Constants.GET_ALL_RUN_RECORDS)
    public List<RunRecordDto> getAllRunRecords() {
        return runRecordService.getAllRunRecords();
    }

    @RequestMapping(value= Constants.SAVE_RUN_RECORD, method= RequestMethod.POST)
    public void saveRunRecord(@RequestBody RunRecordDto runRecordDto) {
        runRecordService.saveRunRecord(runRecordDto);
    }
}
