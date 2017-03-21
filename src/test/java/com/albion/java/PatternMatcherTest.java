package com.albion.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PatternMatcherTest {
    @Test
    public void testExtractValue() throws Exception {
        String input = "abc98765defg";
        int expected = 98765;
        PatternMatcher pm = new PatternMatcher();
        int actual = pm.extractValue(input);
        Assert.assertEquals(actual,expected);
    }
}