package com.albion.text.excel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleToNumberTest {
    @Test
    public void testTitleToNumber() throws Exception {
        TitleToNumber t = new TitleToNumber();
        int actual = t.titleToNumber("AA");
        Assert.assertEquals(actual, 27);
    }
}