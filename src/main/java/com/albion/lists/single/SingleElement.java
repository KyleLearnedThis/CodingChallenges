package com.albion.lists.single;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            x = x ^ nums[i];
        }
        return x;
    }
}
