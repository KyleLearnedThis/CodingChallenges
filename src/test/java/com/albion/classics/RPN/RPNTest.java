package com.albion.classics.RPN;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RPNTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        String[] x1 = {"2", "1", "+", "3", "*"};
        int y1 = 9;
        String[] x2 = {"4", "13", "5", "/", "+"};
        int y2 = 6;
        return new Object[][] {
                {x1, y1},
                {x2, y2}
        };
    }

    @Test(dataProvider = "dp01")
    public void testEvalRPN(String[] input, int expected) throws Exception {
        RPN rpn = new RPN();
        int actual = rpn.evalRPN(input);
        Assert.assertEquals(actual, expected);
    }
}