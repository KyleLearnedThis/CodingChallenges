package com.albion.java;

import java.util.*;

/**
 * Note: TreeMap order by key, LinkedHashMap ordered by insertion sequence
 */
public class OrderedMap {
    public Map<Integer, Integer> sortMapByValue(Map<Integer, Integer> map) {
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(" key: " + key + " value: " + value);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> entry : entryList) {
            int key = entry.getKey();
            int value = entry.getValue();
            map.put(key, value);
        }
        return map;
    }
}
