package com.albion.number.factorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorial() throws Exception {
        int input = 14;
        String expected = "87178291200";
        Factorial f = new Factorial();
        String actual = f.factorial(input);
        Assert.assertEquals(actual, expected);
    }
}