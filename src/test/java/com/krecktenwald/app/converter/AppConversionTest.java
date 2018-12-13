package com.krecktenwald.app.converter;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.*;

import com.krecktenwald.app.converter.AppConversion.TimeUnit;

public class AppConversionTest {

	@Test
	public void testStringToDuration() {
		AppConversion appConversion = new AppConversion();
		
		String durationString = "00:00:01";
		assertEquals(1, appConversion.stringToDuration(durationString).getSeconds());
		
		durationString = "00:01:00";
		assertEquals(60, appConversion.stringToDuration(durationString).getSeconds());
		
		durationString = "01:00:00";
		assertEquals(3600, appConversion.stringToDuration(durationString).getSeconds());
	}
	
	@Test
	public void testgetIntFromDurationString() {
		AppConversion appConversion = new AppConversion();
		String durationString = "01:02:03";
		
		assertEquals(1, appConversion.getIntFromDurationString(durationString, TimeUnit.HOUR));
		assertEquals(2, appConversion.getIntFromDurationString(durationString, TimeUnit.MINUTE));
		assertEquals(3, appConversion.getIntFromDurationString(durationString, TimeUnit.SECOND));
		
		durationString = "11:12:13";
		
		assertEquals(11, appConversion.getIntFromDurationString(durationString, TimeUnit.HOUR));
		assertEquals(12, appConversion.getIntFromDurationString(durationString, TimeUnit.MINUTE));
		assertEquals(13, appConversion.getIntFromDurationString(durationString, TimeUnit.SECOND));
		
	}
	
	@Test
	public void testCalculatePace() {
		AppConversion appConversion = new AppConversion();
		
		Duration duration = Duration.ofSeconds(10);
		
		assertEquals(5, appConversion.calculatePace(2, duration).getSeconds());
		
	}

}
