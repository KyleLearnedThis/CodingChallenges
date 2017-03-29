package com.albion.text.reverse;

import com.albion.graphs.highway.Assert;
import org.testng.annotations.Test;

public class ReverseWordsTest {
    @Test
    public void testReverseWordsV3() throws Exception {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        ReverseWords r = new ReverseWords();
        String actual = r.reverseWordsV3(input);
        Assert.assertEquals(actual, expected);
    }
}