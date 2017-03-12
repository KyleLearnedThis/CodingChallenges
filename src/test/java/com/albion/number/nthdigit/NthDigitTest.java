package com.albion.number.nthdigit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NthDigitTest {
    @Test
    public void testFindNthDigit() throws Exception {
        int n = 10000000;
        int expected = 7;
        NthDigit nthDigit = new NthDigit();
        int actual = nthDigit.findNthDigit(n);
        Assert.assertEquals(actual, expected);
    }
}