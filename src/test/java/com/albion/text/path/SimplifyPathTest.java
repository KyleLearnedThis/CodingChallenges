package com.albion.text.path;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimplifyPathTest {
    @DataProvider(name = "dp01")
    public Object[][] makeDataV1(){
        return new Object[][]{
//                {"///a///", "/a"},
//                {"/home/", "/home"},
                {"/a/./b/../../c/", "/c"},
                {"/../", "/"},
                {"/home//foo/", "/home/foo"}
        };
    }

    @Test(dataProvider = "dp01")
    public void testSimplifyPath(String input, String expected) throws Exception {
        SimplifyPath s = new SimplifyPath();
        String actual = s.simplifyPath(input);
        Assert.assertEquals(actual,expected);
    }
}