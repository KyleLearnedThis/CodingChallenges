package com.albion.firstUniqueChar;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstUniqueCharTest {

    @DataProvider(name = "dp01")
    public Object[][] makeTestData() {
        return new Object[][] {
                {"loveleetcode", 2},
                {"cc", -1},
                {"", -1},
                {"dddccdbba", 8}
        };
    }

    @Test(dataProvider = "dp01")
    public void testFirstUniqChar(String input, int expected) throws Exception {
        FirstUniqueChar f = new FirstUniqueChar();
        int actual = f.firstUniqChar(input);
        Assert.assertEquals(actual, expected);
    }

}