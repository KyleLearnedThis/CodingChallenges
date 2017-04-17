package com.albion.text.reverse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsV3Test {
    @Test
    public void testReverseWords() throws Exception {
        String input = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        ReverseWordsV3 v3 = new ReverseWordsV3();
        String actual = v3.reverseWords(input);
        Assert.assertEquals(actual, expected);
    }
}