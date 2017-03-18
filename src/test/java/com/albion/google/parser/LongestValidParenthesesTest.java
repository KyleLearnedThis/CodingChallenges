package com.albion.google.parser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestValidParenthesesTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][] {
                {"(()", 2},
                {")()())", 4}
        };
    }
    @Test(dataProvider = "dp01")
    public void testLongestValidParentheses(String input, int expected) throws Exception {
        LongestValidParentheses l = new LongestValidParentheses();
        int actual = l.longestValidParentheses(input);
        Assert.assertEquals(actual, expected);
    }
}