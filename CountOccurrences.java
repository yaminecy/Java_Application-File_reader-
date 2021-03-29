package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * CountOccurrences counts the number of each repeated String in the list and gives the sum of each.

 * A method that will count occurrence in a list
 *  The important part is, the map Map , which is a map filled (key and value) with the strings in the list
 *  without duplication
 *
 * @param  result list List<String>  and a map Map<String, Integer>
 *
 */

public class CountOccurrences {
    static void getOccur(List<String> result, Map<String, Integer> map) {

        for (String symptom : result) { // for each loop to read the list
            map.merge(symptom, 1, Integer::sum); // give symptom to the key if  == null add 1 to value else sum the values
        }
        System.out.println("Occurrence count completed successfully");
    }
}


