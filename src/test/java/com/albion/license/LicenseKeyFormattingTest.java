package com.albion.license;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LicenseKeyFormattingTest {
    @DataProvider(name = "d01")
    public Object[][] makeDataProvider(){
        String s1 = "12345-67-89";
        int k1 = 3;
        String r1 = "123-456-789";

        String s2 = "2-4A0r7-4k";
        int k2 = 4;
        String r2 = "24A0-R74K";

        String s3 = "2-4A0r7-4k";
        int k3 = 3;
        String r3 = "24-A0R-74K";
        return new Object[][]{
                {s1, k1, r1},
                {s2, k2, r2},
                {s3, k3, r3}
        };
    }
    @Test(dataProvider = "d01")
    public void testLicenseKeyFormatting(String input, int k, String expected) throws Exception {
        LicenseKeyFormatting lkf = new LicenseKeyFormatting();
        String actual = lkf.licenseKeyFormatting(input, k);
        Assert.assertEquals(actual, expected);
    }

}