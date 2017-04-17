package com.albion.lists.single;

/**
 * https://leetcode.com/problems/single-element-in-a-sorted-array/
 */
public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n/2;
        while (low < high) {
            int m = (low + high) / 2;
            int even = 2 * m;
            int odd = 2 * m + 1;
            if (nums[even] != nums[odd]) {
                high = m;
            } else {
                low = m+1;
            }
        }
        return nums[2*low];
    }
}
