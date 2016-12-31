package com.albion.topK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
    	Map<Integer, Integer> freq = new HashMap<Integer, Integer>(0);

        for(int i = 0; i < nums.length; i++){
            int key = nums[i];
            if(freq.containsKey(key)) {
                int val = freq.get(key);
                val++;
                freq.put(key, val);
            } else {
                freq.put(key, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<Map.Entry<Integer, Integer>>( freq.entrySet());

        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 ){
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

        List<Integer> result = new ArrayList<Integer>();

        for(int i =0; i < k; i++){
            Map.Entry<Integer, Integer> entry = list.get(i);
            int key = entry.getKey();
            result.add(key);
        }
        return result;
    }
}
