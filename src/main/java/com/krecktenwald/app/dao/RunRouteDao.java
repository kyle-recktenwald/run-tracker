package com.krecktenwald.app.dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import com.krecktenwald.app.Database;
import com.krecktenwald.app.domain.RunRoute;

public class RunRouteDao {
	
	public Connection conn;
	public Properties props;
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public RunRouteDao() throws SQLException{
		initializeDatabase();
	}
	
	public void initializeDatabase() throws SQLException{
		String url = "jdbc:postgresql://localhost/runtracker";
		props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","password");
		conn = DriverManager.getConnection(url, props);
	}
	
	public List<RunRoute> findAll() throws SQLException{		
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM RUN_ROUTE");
		
		List<RunRoute> runRoutes = new ArrayList<RunRoute>();
		
		while(resultSet.next()){
			RunRoute curRunRoute = new RunRoute();
			
			UUID currentId = UUID.fromString(resultSet.getString(1));
			String curName = resultSet.getString(2);
			double curDistance = resultSet.getDouble(3);
			Duration curAveragePace = Duration.ofSeconds(resultSet.getInt(4));
			
			if(currentId != null){
				curRunRoute.setId(currentId);
			}
			
			if(curName != null){
				curRunRoute.setName(curName);
			}
			
			curRunRoute.setDistance(curDistance);
			
			curRunRoute.setAveragePace(curAveragePace);
			
			runRoutes.add(curRunRoute);
		}
		
		return runRoutes;
	}
	
	public RunRoute findById(UUID id) throws SQLException{
		
		RunRoute curRunRoute = new RunRoute();
		
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM RUN_ROUTE WHERE ID =" + id);
		
		UUID currentId = UUID.fromString(resultSet.getString(1));
		String curName = resultSet.getString(2);
		double curDistance = resultSet.getDouble(3);
		Duration curAveragePace = Duration.ofSeconds(resultSet.getInt(4));
		
		if(currentId != null){
			curRunRoute.setId(currentId);
		}
		
		if(curName != null){
			curRunRoute.setName(curName);
		}
		
		curRunRoute.setDistance(curDistance);
		
		curRunRoute.setAveragePace(curAveragePace);
		
		return curRunRoute;
	}
	
	public void insertRunRoute(RunRoute runRoute){
		PreparedStatement query;
	      try {

	         conn.setAutoCommit(false);
	         LOGGER.info("Opened database successfully");

	         query = conn.prepareStatement("INSERT INTO RUN_ROUTE (ID, NAME, DISTANCE, AVERAGE_PACE ) VALUES (?,?,?,?);");
	         
	         query.setObject(1, (runRoute.getId()));
	         query.setString(2, runRoute.getName());
	         query.setDouble(3, runRoute.getDistance());
	         query.setLong(4, runRoute.getAveragePace().getSeconds());
	        	         
	         query.executeUpdate();

	         query.close();
	         conn.commit();
	         conn.close();
	      } catch (Exception e) {
	         LOGGER.warning( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      LOGGER.info("Records created successfully");
	}

}