package com.albion.sort.topK.v1;

import java.util.*;

public class TopKElements {
    public int topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(0);

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

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        // Collections.sort(list, (o1,o2)->(o2.getValue().compareTo(o1.getValue())));
        Collections.sort(list, (o1,o2)->(o2.getValue()-o1.getValue()));
        int result = list.get(k-1).getKey();
        return  result;
    }
}
