package com.krecktenwald.app.converter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.sql.Date;
import java.sql.Time;
import java.util.logging.Logger;

public class AppConversion {
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	enum TimeUnit{
		HOUR, MINUTE, SECOND;
	}
	
	public static String formatDuration(Duration duration) {
	    long seconds = duration.getSeconds();
	    long absSeconds = Math.abs(seconds);
	    String positive = String.format(
	        "%d:%02d:%02d",
	        absSeconds / 3600,
	        (absSeconds % 3600) / 60,
	        absSeconds % 60);
	    return seconds < 0 ? "-" + positive : positive;
	}
	
	public Duration stringToDuration(String durationString){
		Duration duration = Duration.ZERO;
		
		long hours = getIntFromDurationString(durationString, TimeUnit.HOUR);
		long minutes = getIntFromDurationString(durationString, TimeUnit.MINUTE);
		long seconds = getIntFromDurationString(durationString, TimeUnit.SECOND);
		
		duration = duration.plusHours(hours);
		duration = duration.plusMinutes(minutes);
		duration = duration.plusSeconds(seconds);
		
		return duration;
	}
	
	public int getIntFromDurationString(String durationString, TimeUnit timeUnit){
		int unitDuration = -1;
		
		switch (timeUnit){
			case HOUR:
				unitDuration = Integer.parseInt(durationString.substring(0, 2));
				break;
			case MINUTE:
				unitDuration = Integer.parseInt(durationString.substring(3, 5));
				break;
			case SECOND:
				unitDuration = Integer.parseInt(durationString.substring(6, 8));
				break;
			default:
				LOGGER.warning("Incorrect Format Entered for Duration String");
				break;
		}
		
		return unitDuration;
	}
	
	
	/**
	 * Calculates the pace in java.time.Duration from the given distance and duration of run.
	 * 
	 * @param distance the distance of the run
	 * @param duration the duration of the run
	 * @return pace overall pace of the run
	 */
	public Duration calculatePace(double distance, Duration duration){
		Duration pace = Duration.ZERO;
		
		double durationInSeconds = duration.getSeconds();
		
		double paceInSeconds = durationInSeconds / distance;
		
		long paceInSecondsLong = (long)paceInSeconds;
		pace = Duration.ofSeconds((paceInSecondsLong));
		
		return pace;
	}
	
	/**
	 * Converts a java.time.LocalDate object to a java.sql.Date object.
	 * Java -> PostGreSQL
	 * 
	 * @param localDate a java.sqlDate object (PostGresql)
	 * @return date java.sql.Date object for Java object
	 */
	public Date localDateToSqlDate(LocalDate localDate){
		Date date = Date.valueOf(localDate);
		return date;
	}
	/**
	 * Converts a java.sql.Date object to a java.time.LocalDate object.
	 * PostGreSQL -> Java
	 * 
	 * @param date java.sql.Date object for Java object
	 * @return localDate a java.sql.Date object (PostGresql)
	 */
	public LocalDate sqlDateToLocalDate(Date date){
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return localDate;
	}
	
	/**
	 * Converts a java.time.LocalTime object to a java.sql.Time object.
	 * Java -> PostGreSQL
	 * 
	 * @param localDate a java.sqlTime object (PostGresql)
	 * @return date java.sql.Time object for Java object
	 */
	public Time localTimeToSqlTime(LocalTime localTime){
		Time time = Time.valueOf(localTime);
		return time;
	}
	/**
	 * Converts a java.sql.Time object to a java.time.LocalDate object.
	 * PostGreSQL -> Java
	 * 
	 * @param time java.sql.Date object for Java object
	 * @return localTime a java.sql.Date object (PostGresql)
	 */
	public LocalTime sqlTimeToLocalTime(Time time){
		LocalTime localTime = time.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		return localTime;
	}

}
