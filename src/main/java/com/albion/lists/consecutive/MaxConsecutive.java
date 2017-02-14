package com.albion.lists.consecutive;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 *
 */
public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(count > max) {
                    max = count;
                }
                count = 0;
            } else {
                count++;
                if(count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}
