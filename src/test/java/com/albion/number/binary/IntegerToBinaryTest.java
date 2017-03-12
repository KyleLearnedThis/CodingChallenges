package com.albion.number.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerToBinaryTest {
    @Test
    public void testToBinaryString() throws Exception {
        String expected = "100";
        int input = 4;
        IntegerToBinary integerToBinary = new IntegerToBinary();
        String actual = integerToBinary.toBinaryString(input);
        Assert.assertEquals(actual, expected);
    }
}