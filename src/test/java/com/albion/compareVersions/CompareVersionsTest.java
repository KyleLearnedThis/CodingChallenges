package com.albion.compareVersions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * https://leetcode.com/problems/compare-version-numbers/
 *
 * This doesn't handle the case 1.0 == 1.  Since it's not even mentioned in the test until run the code for submission.
 * Lame.
 */
public class CompareVersionsTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        return new Object[][] {
                {"36.1.3", "35.9", 1},
                {"35.1", "35.2", -1},
                {"3.5.0", "3.5.0", 0},
                {"34.0.7", "35.98.7", -1},
                {"1.1", "1", 1},
                {"1", "1.1", -1}
        };
    }
    @Test(dataProvider = "dp01")
    public void testCompareVersion(String version1, String version2, int expected) throws Exception {
        CompareVersions c = new CompareVersions();
        int actual = c.compareVersion(version1, version2);
        Assert.assertEquals(actual, expected);
    }
}