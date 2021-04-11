package com.hemebiotech.analytics;


import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;




public class AnalyticsCounter {

   static List<String> result= new ArrayList<String>();
   static Map<String, Integer> map= new HashMap<String, Integer>();
   static File Symptom= new File("C:\\Users\\yami0\\OneDrive\\Bureau\\Salesforce\\Projet 4\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application-master\\Project02Eclipse\\symptoms.txt");

    /**
     * This programme reads files,reorganize the strings alphabetically and count the number of string repetition
     * @author CHEURFA Yamine
     * @version version 1.1
     * @param args The main class runs the whole programme by calling all the following methods:
     * "ReadSymptomDataFromFile" that reads the file.
     * " CountOccurrences" that counts Occurrences from the list
     * "FileWriter" a method stores the symptoms alphabetically in the output, With number of occurrences
     */

    public static void main(String[]args) throws IOException{
       ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile(); // This calls a method that reads the file
       readSymptoms.GetSymptoms(Symptom,result);
        CountOccurrences occurrence = new CountOccurrences(); // this calls a methode that counts occurrences in the list
        occurrence.getOccur(result, map);
        FileWriter sort = new FileWriter(); // This method stores the symptoms alphabetically in the output, With number of occurrences.
        sort.GetFileWriter(map);
    }
}
