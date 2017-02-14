package com.albion.lists.dupilcate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class ContainDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if(nums == null) {
            return result;
        }
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0){
                result.add(Math.abs(nums[i]));
            }else{
                nums[index] = -nums[index];
            }
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return result;
    }
}
