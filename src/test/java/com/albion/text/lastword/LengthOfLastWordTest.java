package com.albion.text.lastword;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() throws Exception {
        LengthOfLastWord last = new LengthOfLastWord();
        int expected = 6;
        int actual = last.lengthOfLastWord("Hello world friend");
        Assert.assertEquals(actual, expected);
    }

}