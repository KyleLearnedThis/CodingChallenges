package com.albion.text.roman;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanToIntTest {
    @Test
    public void testRomanToInt() throws Exception {
        String input = "MCMLXXXI";
        int expected = 1981;
        RomanToInt romanToInt = new RomanToInt();
        int actual = romanToInt.romanToInt(input);
        Assert.assertEquals(actual, expected);
    }
}