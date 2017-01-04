package com.albion.sortCharacterFrequncy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SortCharacterFrequencyTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][] {
                {"tree", "eert"},
        };
    }
    @Test(dataProvider = "dp01")
    public void testFrequencySort(String input, String expected) throws Exception {
        SortCharacterFrequency s = new SortCharacterFrequency();
        String actual = s.frequencySort(input);
        Assert.assertEquals(actual, expected);
    }
}