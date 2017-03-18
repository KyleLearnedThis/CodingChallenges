package com.albion.number.excel;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelSheetColumnTitleTest {

    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][] {
                {26, "Z"},
                {27, "AA"}
        };
    }

    @Test(dataProvider = "dp01")
    public void testConvertToTitle(int input, String expected) throws Exception {
        ExcelSheetColumnTitle excel = new ExcelSheetColumnTitle();
        String actual = excel.convertToTitle(input);
        Assert.assertEquals(actual,expected);
    }
}