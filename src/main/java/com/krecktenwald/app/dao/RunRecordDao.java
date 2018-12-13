package com.krecktenwald.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Logger;

import com.krecktenwald.app.conversion.AppConversion;
import com.krecktenwald.app.domain.RunRecord;
import com.krecktenwald.app.domain.RunRoute;

public class RunRecordDao {
	
	public Connection conn;
	public Properties props;
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public RunRecordDao() throws SQLException{
		initializeDatabase();
	}
	
	public void initializeDatabase() throws SQLException{
		String url = "jdbc:postgresql://localhost/runtracker";
		props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","password");
		conn = DriverManager.getConnection(url, props);
	}
	
	public List<RunRecord> findAll() throws SQLException{		
		Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM RUN_RECORD");
		
		List<RunRecord> runRecords = new ArrayList<RunRecord>();
		RunRouteDao runRouteDao = new RunRouteDao();
		AppConversion appConversion = new AppConversion();
		
		while(resultSet.next()){
			RunRecord curRunRecord = new RunRecord();
			
			UUID curId = UUID.fromString(resultSet.getString(1));
			Duration curDuration = Duration.ofSeconds(resultSet.getInt(2));
			RunRoute curRunRoute = runRouteDao.findById(UUID.fromString(resultSet.getString(3)));
			LocalDate curDate = resultSet.getDate(4).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			LocalTime curTimeOfDay = resultSet.getTime(5).toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
			double curDistance = curRunRoute.getDistance();
			String curNotes = resultSet.getString(7);
			String curWeather = resultSet.getString(8);
			int curTemperature = resultSet.getInt(9);
			Duration curPace = appConversion.calculatePace(curDistance, curDuration);
			
			if(curId != null){
				curRunRecord.setId(curId);
			}
			if(curDuration != null){
				curRunRecord.setDuration(curDuration);
			}
			if(curRunRoute != null){
				curRunRecord.setRoute(curRunRoute);
			}
			if(curDate != null){
				curRunRecord.setDate(curDate);
			}
			if(curTimeOfDay != null){
				curRunRecord.setTimeOfDay(curTimeOfDay);
			}

			curRunRecord.setDistance(curDistance);

			if(curNotes != null){
				curRunRecord.setNotes(curNotes);
			}
			
			if(curWeather != null){
				curRunRecord.setWeather(curWeather);
			}
			
			curRunRecord.setTemperature(curTemperature);
			
			if(curPace != null){
				curRunRecord.setPace(curPace);
			}
			
			runRecords.add(curRunRecord);
		}
		
		return runRecords;
	}
	
	public void insertRunRecord(RunRecord runRecord){
		AppConversion appConversion = new AppConversion();
		PreparedStatement query;
	      try {

	    	/*UUID id;
	    	Duration duration;
    	    RunRoute route;
    	    LocalDate date;
    	    LocalTime timeOfDay;
    		double distance;
    	    String notes;
    	    String weather;
    	    int temperature;
    		Duration pace;*/
	    	  
	    	 conn.setAutoCommit(false);
	         LOGGER.info("Opened database successfully");

	         query = conn.prepareStatement("INSERT INTO RUN_RECORD (ID, DISTANCE, DURATION, ROUTE_ID, DATE, "
	         		+ "TIME_OF_DAY, TEMPERATURE, WEATHER, NOTES) VALUES (?,?,?,?,?,?,?,?,?)");
	         
	         query.setObject(1, (runRecord.getId()));
	         query.setDouble(2, runRecord.getDistance());
	         query.setLong(3, runRecord.getDuration().getSeconds());
	         query.setObject(4, runRecord.getRoute().getId());
	         query.setDate(5, appConversion.localDateToSqlDate(runRecord.getDate()));
	         query.setTime(6, appConversion.localTimeToSqlTime(runRecord.getTimeOfDay()));
	         query.setInt(7, runRecord.getTemperature());
	         query.setString(8, runRecord.getWeather());
	         query.setString(9, runRecord.getNotes());
	         
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
