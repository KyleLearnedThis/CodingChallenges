package com.albion.numbersDisappeared;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Note that original problem didn't mention if empty set, it wants to return empty list.
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return output;
        }
        List<Integer> input = IntStream.of(nums).boxed().collect(Collectors.toList());
        Collections.sort(input);
        int size = input.size();
        int lastVal = input.get(size - 1);
        lastVal = Math.max(size, lastVal);

        List<Integer> allNumbers = new ArrayList<>();
        for(int i = 1; i <= lastVal; i++) {
            allNumbers.add(i);
        }

        Set<Integer> a = new HashSet<>(input);
        Set<Integer> b = new HashSet<>(allNumbers);
        b.removeAll(a);
        output = new ArrayList<>(b);

        return output;
    }
}
