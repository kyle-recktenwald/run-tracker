package com.krecktenwald.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

import com.krecktenwald.app.domain.RunRoute;

public class Database {
	
	public Connection conn;
	public Properties props;

	/**
	 * Initializes the database.
	 *
	 * @throws SQLException If an SQLException error occurs.
	 */
	public void Database() throws SQLException{
		//System.out.println("Initializing Database...");
		String url = "jdbc:postgresql://localhost/runtracker";
		props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","eagles123");
		conn = DriverManager.getConnection(url, props);
		
		//Test Connection with Query
		/*Statement statement = conn.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM RUN_RECORD");
		
		while (resultSet.next()){
			System.out.println("Run Record ID:");
			System.out.println(resultSet.getString(1));
		}*/
		//System.out.println("Done Initializing Database.");
	}
	
	public Connection getConnection(){
		return conn;
	}

}
