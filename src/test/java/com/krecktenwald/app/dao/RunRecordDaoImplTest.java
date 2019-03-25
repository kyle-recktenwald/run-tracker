package com.krecktenwald.app.dao;

import java.sql.SQLException;

import com.krecktenwald.app.dao.impl.RunRecordDaoImpl;
import org.junit.*;

public class RunRecordDaoImplTest {
	
	@Test
	public void testFindAll() throws SQLException{
		RunRecordDaoImpl runRecordDaoImpl = new RunRecordDaoImpl();
		
		System.out.println(runRecordDaoImpl.findAll());
	}
}
