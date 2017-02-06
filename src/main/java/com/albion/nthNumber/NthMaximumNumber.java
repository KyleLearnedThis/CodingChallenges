package com.albion.nthNumber;

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
}
