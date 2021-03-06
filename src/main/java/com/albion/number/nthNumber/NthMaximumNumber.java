package com.albion.number.nthNumber;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class NthMaximumNumber {
    public int thirdMax(int[] nums) {
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        Set<Integer> set = new LinkedHashSet<>(list);
        List<Integer> resultList = new ArrayList<>(set);
        int size = resultList.size();
        if(size < 3) {
            //The problem stated that to return maximum if this doesn't exist
            return resultList.get(0);
        } else {
            return resultList.get(2);
        }
    }

    /**
     * An phone screen question.
     * @param input
     * @param k
     * @return an array of K largest numbers.
     */
    public int[] largest(int[] input, int k) {
        int[] result = new int[k];
        int len = input.length;

        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            int index = len - k + i;
            result[i] = input[index];
        }
        return result;
    }

    public int max(int[] nums, int n) {
        Arrays.sort(nums);
        if(nums.length > n){
            return nums[n - 1];
        } else {
            return nums[nums.length - 1];
        }
    }
}
