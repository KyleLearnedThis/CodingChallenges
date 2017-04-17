package com.albion.number.sums;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null || numbers.length<2) {
            return new int[]{0, 0};
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i]), i};
            }else{
                map.put(target-numbers[i], i);
            }
        }

        return new int[]{0,0};
    }
}
