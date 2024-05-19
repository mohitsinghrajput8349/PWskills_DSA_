package hashmap;

import java.util.*;

public class SortedMapByValue {
    public static void main(String[] args) {
        // Create a HashMap to store the initial entries
        Map<Integer, String> map = new HashMap<>();
        
        // Add entries to the map
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");
        
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        
        // Sort the list using a comparator comparing by values
        list.sort(Map.Entry.comparingByValue());
        
        // Create a LinkedHashMap to store the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        
        // Populate the LinkedHashMap with sorted entries
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        
        // Print the sorted map
        System.out.println(sortedMap);
    }
}

