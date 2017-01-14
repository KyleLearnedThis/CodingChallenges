package com.albion.google.commonprefix;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongestCommonPrefixTest {

    @DataProvider(name = "data")
    public Object[][] makeDataProvider(){

        String[] s1 = {"abcd", "abcde", "abcdef", "abc"};
        String[] s2 = {"abab","aba","abc"};
        return new Object[][] {
                {s1, "abc"},
                {s2, "ab"}
        };
    }
    @Test(dataProvider = "data")
    public void testLongestCommonPrefix(String[] input, String expected) throws Exception {
        LongestCommonPrefix lc = new LongestCommonPrefix();
        String actual = lc.longestCommonPrefix(input);
        Assert.assertEquals(actual, expected);
    }

}