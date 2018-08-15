package com.krecktenwald.app;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainClass {
    
    public MainClass(){
        
    }
    
    public void run(){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int userSelection = 0;
    	
    	System.out.println("Welcome to the Run Tracking Application.\nPlease select an option:");
        System.out.println("1. Record a Run");
        userSelection = scan.nextInt();
        scan.nextLine();
        
        if(userSelection == 1){
        	
        	RunRecord runRecord = new RunRecord();
        	runRecord.setId(UUID.randomUUID());
        	String time = "";
        	
        	System.out.println("What was the time of your run? (HH:MM:SS)");
        	time = scan.nextLine();
        	runRecord.setTime(time);
        	
        	System.out.println("Recorded run:");
        	System.out.println(runRecord);
        	
        }
        
        
        
        System.out.println("Thank you for using run tracker!");

    }
    
    
    
}
