package com.albion.lists.merge;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeSortedDataTest {
    @Test
    public void testMergeSortedArray() throws Exception {
        int[] x1 = {2,3,4,5};
        int[] x2 = {4,5,6,7,8};
        int[] expected = {2,3,4,4,5,5,6,7,8};
        MergeSortedData m = new MergeSortedData();
        int[] actual = m.mergeSortedArray(x1, x2);
        Assert.assertEquals(actual, expected);
    }
}