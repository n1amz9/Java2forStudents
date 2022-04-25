package lesson_03.examples;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("Russia", "Moscow");
        newMap.put("India", "Delhi");
        newMap.put("England", "London");

        System.out.println();

        Collection<String> values = newMap.values();
        Set<String> keySet = newMap.keySet();
        for (Map.Entry<String, String> pair : newMap.entrySet()) {
            System.out.println("key = " + pair.getKey() + " and value is: " + pair.getValue());
        }
    }


}
