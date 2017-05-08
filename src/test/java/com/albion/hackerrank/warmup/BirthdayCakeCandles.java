package com.albion.hackerrank.warmup;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */
public class BirthdayCakeCandles {
    public int countBirthdayCakeCandles(int[] height) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < height.length; i++) {
            int num = height[i];
            if(freq.containsKey(num)) {
                int val = freq.get(num);
                val = val + 1;
                freq.put(num, val);
            } else {
                freq.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        Collections.sort(list, (o1, o2)->o2.getValue()-o1.getValue());
        int result = list.get(0).getValue();
        return result;
    }
}
