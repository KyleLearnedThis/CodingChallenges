package com.albion.text.isomorphic;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsomorphicStringsTest {

    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][]{
                {"egg", "add", true},
                {"foo", "bar", false},
                {"paper", "title", true},
                {"abcde", "ppppp", false}
        };
    }

    @Test(dataProvider = "dp01")
    public void testIsIsomorphic(String s1, String s2, boolean expected) throws Exception {
        IsomorphicStrings iso = new IsomorphicStrings();
        boolean actual = iso.isIsomorphic(s1, s2);
        Assert.assertEquals(actual, expected);
    }

}