package com.albion.lists.maxsub;

import com.albion.graphs.highway.Assert;
import org.testng.annotations.Test;

public class MaxSumSubArrayTest {
    @Test
    public void testMaxSubArray() throws Exception {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        MaxSumSubArray m = new MaxSumSubArray();
        int actual = m.maxSubArray(input);
        Assert.assertEquals(expected,actual);
    }
}