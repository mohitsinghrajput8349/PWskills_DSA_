package hashmap;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store the entries in sorted order by key
        Map<Integer, String> map = new TreeMap<>();

        // Add entries to the map
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");

        // Print the map
        System.out.println(map);
    }
}

