package com.albion.lists.kdiff;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        //Build frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                int num = entry.getKey();
                int key = num + k;
                if (freq.containsKey(key)) {
                    count++;
                }
            }
        }

        return count;
    }
}
