package com.albion.text.reverse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringV2Test {
    @Test
    public void testReverseStr() throws Exception {
        String input = "abcdefg";
        int k = 2;
        String expected = "bacdfeg";
        ReverseStringV2 v2 = new ReverseStringV2();
        String actual = v2.reverseStr(input, k);
        Assert.assertEquals(expected,actual);
    }
}