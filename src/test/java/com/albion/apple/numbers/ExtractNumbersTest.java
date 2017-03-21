package com.albion.apple.numbers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtractNumbersTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][]{
                {"abs234hkfd1lojf", 235},
                {"qwertyuiio", 0},
                {"1000w100w10w1", 1111},
                {"12345678", 12345678}
        };
    }
    @Test(dataProvider = "dp01")
    public void testExtractNumbers(String input, int expected) throws Exception {
        ExtractNumbers e = new ExtractNumbers();
        int actual = e.extractNumbers(input);
        Assert.assertEquals(actual,expected);
    }
}