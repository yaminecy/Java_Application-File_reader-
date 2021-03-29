package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;



/**
 * FileWriter will change a Map in a Treemap it will be sort by key (alphabetical)
 * The file "result.out" will be filled with the data in the map
 * without duplication and sorted by key
 * @param  map Map<String, Integer>
 */
public class FileWriter {
    // next generate output
    static void GetFileWriter(Map<String, Integer> map) throws IOException { // @throws  Input Output exceptions

        Map<String, Integer> sortMap = new TreeMap<>(map);
        File resultOut = new File("result.out"); 	//	create the file

        BufferedWriter writeResult = null;
        try {
            writeResult = new BufferedWriter(new java.io.FileWriter(resultOut));
        } catch (IOException e) {											// throws Input Output exceptions
            System.out.println("Error: Unable to write the file!!!");
            e.printStackTrace();
        } System.out.println("Your file result.out has been created " + resultOut.getAbsolutePath());
        for (Map.Entry<String, Integer> saisie : sortMap.entrySet()) { 	// for each loop to read treeMap
            String clef = saisie.getKey();    							// get keys and values from the map
            Integer valeur = saisie.getValue();

            try {
                writeResult.write(clef + " : " + valeur + "\n");     // write keys and values in the file result.out
            } catch (IOException e) { 										// throws Input Output exceptions
                System.out.println("Error: Unable to write the result!!!");
                e.printStackTrace();
            }

        } System.out.println("Your file result.out has been Filled ");
        writeResult.flush();
        writeResult.close();
    }
}
