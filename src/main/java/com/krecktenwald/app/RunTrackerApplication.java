package com.krecktenwald.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunTrackerApplication 
{	
	public static void main( String[] args ) throws SQLException
    {
		Database database = new Database();

    	MainClass mainClass = new MainClass();
        
        mainClass.run();
    }
}
