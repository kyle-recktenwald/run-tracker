package com.krecktenwald.app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.krecktenwald.app.domain.RunRoute;

public class CSVHandler {

    public ArrayList readCSV(String fileName) {
        String csvFile = fileName;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        String[] csvArray = null;
        ArrayList arrayOutput = new ArrayList();

        try {

            br = new BufferedReader(new FileReader(csvFile));

            //Skip the first line:
            br.readLine();

            while ((line = br.readLine()) != null) {

                // use comma as separator
                csvArray = line.split(cvsSplitBy);

                arrayOutput.add(csvArray);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayOutput;
    }

    public void exportCSV(String fileName, String columnNames, ArrayList<String[]> rows) throws IOException {
        //Output Unique Classifiers to CSV File:

        String fileLocation = "src/resources/";

        FileWriter writer = new FileWriter(fileLocation + fileName + ".csv");

        String newline = "\n";
        StringBuilder csvOutput = new StringBuilder(columnNames).append(newline);

        for (String[] row : rows){

            for(int i = 0; i < row.length; i++){
                csvOutput.append(row[i]);

                if(i < row.length - 1) {
                    csvOutput.append(",");
                }
            }

            csvOutput.append(newline);
        }

        writer.append(csvOutput);

        writer.flush();
        writer.close();
    }
    
    public ArrayList<RunRoute> runRoutes(){
        ArrayList<RunRoute> runRoutes = null;
        
        ArrayList<String[]> runningRoutesCSV = readCSV("src/resources/csvFiles/RunningRoutesCSV.csv");
        
        for(String[] runningRoute : runningRoutesCSV){
            
            RunRoute runRoute = new RunRoute();
            
            int id = Integer.parseInt(runningRoute[0]);
            String name = runningRoute[1];
            double miles = Double.parseDouble(runningRoute[2]);
            
            
        }
        
        return runRoutes;
        
    }
    
    
}
