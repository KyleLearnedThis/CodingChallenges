package com.albion.google.mergeArray;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedArraysTest {
    @Test
    public void testMerge() throws Exception {
        int[] nums1 = new int [16];
        int[] nums2 = {3,6,14,16};
        for (int i = 0; i < 12; i++) {
            nums1[i] = i + 18;
        }
        MergeSortedArrays m = new MergeSortedArrays();
        m.merge(nums1, 12, nums2, 4);
        Arrays.stream(nums1).forEach(i->System.out.print(" " + i));
        System.out.println("");
    }

}