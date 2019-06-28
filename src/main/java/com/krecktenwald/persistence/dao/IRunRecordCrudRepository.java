package com.krecktenwald.persistence.dao;

import java.io.Serializable;

import com.krecktenwald.persistence.model.RunRecord;
import org.springframework.data.repository.CrudRepository;

public interface IRunRecordCrudRepository extends CrudRepository<RunRecord, Serializable> {
    //
}