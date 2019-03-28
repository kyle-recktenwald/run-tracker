package com.krecktenwald.app.service;

import com.krecktenwald.app.dao.common.IOperations;
import com.krecktenwald.app.dto.RunRecordDto;
import com.krecktenwald.app.dto.RunRouteDto;
import com.krecktenwald.app.model.RunRecord;
import com.krecktenwald.app.model.RunRoute;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface IRunRecordService extends IOperations<RunRecord> {


}
