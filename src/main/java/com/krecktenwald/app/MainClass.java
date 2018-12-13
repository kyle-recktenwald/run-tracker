package com.krecktenwald.app;

import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import com.krecktenwald.app.converter.AppConversion;
import com.krecktenwald.app.dao.RunRecordDao;
import com.krecktenwald.app.dao.RunRouteDao;
import com.krecktenwald.app.domain.RunRecord;
import com.krecktenwald.app.domain.RunRoute;

public class MainClass {

	public MainClass() {
	}

	public void run() throws SQLException {

		Scanner scan = new Scanner(System.in);

		int userSelection = 0;

		System.out.println("Welcome to the Run Tracking Application.\nPlease select an option:");
		System.out.println("1. Record a Run");
		System.out.println("2. Create a Route");
		userSelection = scan.nextInt();
		scan.nextLine();

		if (userSelection == 1) {
			int count = 1;
			int routeSelection = 0;

			RunRouteDao runRouteDao = new RunRouteDao();
			RunRecord runRecord = new RunRecord();
			List<RunRoute> runRoutes = runRouteDao.findAll();
			AppConversion appConversion = new AppConversion();

			String time = "";

			//Run Duration
			System.out.println("What was the duration of your run? (HH:MM:SS)");
			String durationString = scan.nextLine();
			Duration duration = appConversion.stringToDuration(durationString);
			runRecord.setDuration(duration);

			//Run Route
			System.out.println("What was your route?");

			for (RunRoute curRunRoute : runRoutes) {
				System.out.print(count + ". ");
				System.out.println(curRunRoute.getName());
			}
			routeSelection = scan.nextInt();
			RunRoute curRunRoute = runRoutes.get(routeSelection - 1);
			
			runRecord.setRoute(curRunRoute);
						
			//Date and Time:
			runRecord.setDate(LocalDate.now());
			runRecord.setTimeOfDay(LocalTime.now());
			
			//Run Distance
			runRecord.setDistance(curRunRoute.getDistance());

			System.out.println("What was the temperature?");
			int temperature = scan.nextInt();
			runRecord.setTemperature(temperature);

			System.out.println("Recorded run:");
			System.out.println(runRecord);
			
			RunRecordDao runRecordDao = new RunRecordDao();
			
			runRecordDao.insertRunRecord(runRecord);
			
		} else if (userSelection == 2) {
			RunRouteDao runRouteDao = new RunRouteDao();
			RunRoute newRunRoute = new RunRoute();

			String curName = "";
			double curMiles = 0;

			System.out.println("Enter a name for your route:");
			curName = scan.nextLine();
			newRunRoute.setName(curName);

			System.out.println("Enter the distance (in miles) of your route:");
			curMiles = scan.nextDouble();
			newRunRoute.setDistance(curMiles);

			System.out.println("Added run route " + curName + ".");

			runRouteDao.insertRunRoute(newRunRoute);
		}

		System.out.println("Thank you for using run tracker!");

	}
}
