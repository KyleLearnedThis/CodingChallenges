package com.albion.lists.ranks;

import java.util.Map;
import java.util.TreeMap;

public class GenerateRanks {
    /**
     * https://leetcode.com/problems/relative-ranks/
     * Input: [5, 4, 3, 2, 1]
     * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
     * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
     * For the left two athletes, you just need to output their relative ranks according to their scores.
     * @param nums
     * @return
     */
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];

        TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2)->(o2.compareTo(o1)));
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int counter = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int index = entry.getValue();
            counter++;
            if(counter == 1) {
                result[index] = "Gold Medal";
            } else if(counter == 2) {
                result[index] = "Silver Medal";
            } else if(counter == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(counter);
            }
        }
        return result;
    }
}
