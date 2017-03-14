package com.albion.number.factorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTrailingZeroesTest {
    @Test
    public void testTrailingZeroes() throws Exception {
        int input = 10;
        int expected = 2;
        FactorialTrailingZeroes z = new FactorialTrailingZeroes();
        int actual = z.trailingZeroes(input);
        Assert.assertEquals(actual,expected);
    }
}