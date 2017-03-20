package com.albion.lists.plusone;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PlusOneTest {
    @Test
    public void testPlusOne() throws Exception {
        int[] input = {9,9,9};
        int[] expected = {1,0,0,0};
        PlusOne plus = new PlusOne();
        int[] actual = plus.plusOne(input);
        boolean result = Arrays.equals(actual, expected);
        Assert.assertTrue(result);
    }
}