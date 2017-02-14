package com.albion.text.missingchar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingCharacterTest {
    @Test
    public void testFindTheDifference() throws Exception {
        String s1 = "abcd";
        String s2 = "abcde";
        char expected = 'e';
        MissingCharacter m = new MissingCharacter();
        char actual = m.findTheDifference(s1, s2);
        Assert.assertEquals(actual, expected);
    }
}