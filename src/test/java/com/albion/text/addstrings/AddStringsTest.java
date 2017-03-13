package com.albion.text.addstrings;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddStringsTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][]{
                {"109", "111", "220"},
                {"1000", "11", "1011"},
                {"9", "1", "10"},
                {"99", "1", "100"}
        };
    }
    @Test(dataProvider = "dp01")
    public void testAddStrings(String s1, String s2, String expected) throws Exception {
        AddStrings addStrings = new AddStrings();
        String actual = addStrings.addStrings(s1, s2);
        Assert.assertEquals(actual, expected);
    }
}