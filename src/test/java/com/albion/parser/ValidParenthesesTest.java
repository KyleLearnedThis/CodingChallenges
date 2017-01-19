package com.albion.parser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidParenthesesTest {

    @DataProvider(name = "data01")
    public Object[][] testIsValidSyntaxData() {
        Object[][] val = {
                {"((()))", true},
                {"(((", false},
                {"(()())", true},

                {"{{{}}}", true},
                {"{{{", false},
                {"{{}{}}", true},

                {"[[[]]]", true},
                {"[[[", false},
                {"[[][]]", true},

                {"({[]})", true},
                {"({[", false},
                {"([]{})", true},
        };
        return val;
    }

    @Test(dataProvider = "data01")
    public void testIsValid(String input, boolean expectation) throws Exception {
        ValidParentheses v = new ValidParentheses();
        boolean actual = v.isValid(input);
        Assert.assertEquals(actual, expectation);
    }
}
