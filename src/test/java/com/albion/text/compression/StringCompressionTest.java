package com.albion.text.compression;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringCompressionTest {

    @DataProvider(name = "d01")
    public Object[][] getDataProvider() {
        return new Object[][] {
                {"aabcccccaaa", "a2b1c5a3"}
        };
    }

    @Test(dataProvider = "d01")
    public void testStringCompression(String input, String expected) throws Exception {
        String actual = StringCompression.stringCompression(input);
        Assert.assertEquals(actual, expected);
    }
}