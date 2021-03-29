package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * This class reads the symptoms from a file line by line.
 * @return getSymptoms
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
    //
    @Override
    public List<String> GetSymptoms(File symptom, List<String> result) {
        if (symptom != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(symptom)); // read file

                String line = reader.readLine();

                while (line != null) {
                    result.add(line); // add Strings  to the list, line by line
                    line = reader.readLine();
                }
                reader.close();
                System.out.println(symptom + " has been ridden correctly!! ");
            }
            // catch input output exceptions
            catch (IOException e) {
                System.out.println("Error: Unable to read the file!!!");
                e.printStackTrace();
            }
        }
        return result;
    }
}
