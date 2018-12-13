package com.krecktenwald.app.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.*;

public class RunRecordDaoTest {
	
	@Test
	public void testFindAll() throws SQLException{
		RunRecordDao runRecordDao = new RunRecordDao();
		
		System.out.println(runRecordDao.findAll());
	}
}
