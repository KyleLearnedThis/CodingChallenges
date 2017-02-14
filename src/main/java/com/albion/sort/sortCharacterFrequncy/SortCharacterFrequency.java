package com.albion.sort.sortCharacterFrequncy;

import java.util.*;


/**
 * https://leetcode.com/problems/sort-characters-by-frequency/
 */
public class SortCharacterFrequency {
    private Map<String, Integer> makeFrequencyMap(String magazine) {
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            String key = magazine.charAt(i) + "";
            if(map.isEmpty()) {
                map.put(key, 1);
            } else if(!map.containsKey(key)){
                map.put(key, 1);
            } else {
                map.put(key, map.get(key)+1);
            }
        }
        return map;
    }
    public String frequencySort(String s) {
        Map<String, Integer> map = makeFrequencyMap(s);
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        //Sort in descending order
        Collections.sort(list, (o1,o2)->(o2.getValue()).compareTo( o1.getValue()));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            for(int i = 0; i < value.intValue(); i++) {
                sb.append(key);
            }
        }

        String output = sb.toString();
        return output;
    }
}


