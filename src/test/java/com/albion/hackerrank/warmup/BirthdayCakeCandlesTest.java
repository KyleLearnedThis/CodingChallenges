package com.albion.hackerrank.warmup;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BirthdayCakeCandlesTest {
    @Test
    public void testBirthdayCakeCandles() throws Exception {
        int[] input = {3,2,1,3};
        BirthdayCakeCandles b = new BirthdayCakeCandles();
        int actual = b.countBirthdayCakeCandles(input);
        Assert.assertEquals(actual, 2);
    }
}