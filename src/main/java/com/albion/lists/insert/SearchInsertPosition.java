package com.albion.lists.insert;

/**
 * https://leetcode.com/problems/search-insert-position
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n = -1;
        if(nums != null && nums.length != 0) {
            for (int i = 0; i < nums.length; i++) {
                int x = nums[i];
                if(target <= x){
                    n = i;
                    break;
                } else {
                    if(i != nums.length - 1){
                        n++;
                    } else {
                        n = n + 2;
                    }
                }
            }
        }
        return n;
    }
}
