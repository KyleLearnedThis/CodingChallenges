package com.albion.ransomNote;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RansomNoteTest {


    /**
     * canConstruct("a", "b") -> false
     * canConstruct("aa", "ab") -> false
     * canConstruct("aa", "aab") -> true
     */
    @DataProvider(name = "dp01")
    public Object[][] createDataProvider() {
        Object[][] retVal = new Object[][] {
                {"a", "b", false},
                {"aa", "aab", true},
                {"aa", "ab", false}
        };
        return retVal;
    }

    @Test(dataProvider = "dp01")
    public void testCanConstruct(String ransomNote, String magazine, boolean expected) throws Exception {
        RansomNote r = new RansomNote();
        boolean actual = r.canConstruct(ransomNote, magazine);
        Assert.assertEquals(actual, expected);
    }
}