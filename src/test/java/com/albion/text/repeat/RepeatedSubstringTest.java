package com.albion.text.repeat;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RepeatedSubstringTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData(){
        return new Object[][]{
                {"abab", true},
                {"aba", false},
                {"abcabcabcabc", true},
                {"abcabcabc", true}
        };
    }
    @Test(dataProvider = "dp01")
    public void testRepeatedSubstringPattern(String input, boolean expected) throws Exception {
        RepeatedSubstring rs = new RepeatedSubstring();
        boolean actual = rs.repeatedSubstringPattern(input);
        Assert.assertEquals(actual,expected);
    }

    @Test(dataProvider = "dp01")
    public void testRepeatedSubstringPatternKMP(String input, boolean expected) throws Exception {
        RepeatedSubstring rs = new RepeatedSubstring();
        boolean actual = rs.repeatedSubstringPatternKMP(input);
        Assert.assertEquals(actual,expected);
    }

}