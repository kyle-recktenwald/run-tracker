package com.krecktenwald.app.dao;

import java.sql.SQLException;

import com.krecktenwald.app.dao.impl.RunRecordDao;
import org.junit.*;

public class RunRecordDaoTest {
	
	@Test
	public void testFindAll() throws SQLException{
		RunRecordDao runRecordDaoImpl = new RunRecordDao();
		
		System.out.println(runRecordDaoImpl.findAll());
	}
}
