package com.albion.text.ransomNote;

import java.util.Map;
import java.util.TreeMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> map = makeFrequencyMap(magazine);

        for(int i = 0; i < ransomNote.length(); i++){
            String look = ransomNote.charAt(i) + "";
            if(!map.containsKey(look)){
                return false;
            } else {
                int val = map.get(look);
                val = val - 1;
                map.put(look, val);
                if(val < 0) {
                    return false;
                }
            }
        }
        return true;
    }

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
}
