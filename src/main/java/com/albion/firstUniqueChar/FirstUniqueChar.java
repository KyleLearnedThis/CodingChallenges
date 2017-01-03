package com.albion.firstUniqueChar;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        if(s == null || s.isEmpty()) {
            return -1;
        }
        Map<String, Integer> map = makeMap(s);
        for (int i = 0; i < s.length(); i++) {
            String cur = s.charAt(i) + "";
            int val = map.get(cur);
            if(val == 1) {
                return i;
            }
        }

        return -1;
    }

    private Map<String, Integer> makeMap(String input){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            String key = input.charAt(i) + "";
            if(map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value+1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }

}
