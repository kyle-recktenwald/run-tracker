package com.krecktenwald.app.dao.impl;

import com.krecktenwald.app.dao.RunRecordDao;
import com.krecktenwald.app.model.RunRecord;

import java.util.ArrayList;
import java.util.List;

public class RunRecordDaoImpl implements RunRecordDao {

	private List<RunRecord> runRecords = new ArrayList<>();

	@Override
	public RunRecord get(Long id) {
		return runRecords.get(Math.toIntExact(id));
	}

	@Override
	public List<RunRecord> getAll() {
		return runRecords;
	}

	@Override
	public void save(RunRecord runRecord) {
		runRecords.add(runRecord);
	}

	@Override
	public void update(RunRecord runRecord, String[] params) {
/*		user.setName(Objects.requireNonNull(
				params[0], "Name cannot be null"));
		user.setEmail(Objects.requireNonNull(
				params[1], "Email cannot be null"));

		users.add(user);*/
	}

	@Override
	public void delete(RunRecord runRecord) {
		runRecords.remove(runRecord);
	}
}

