package com.albion.number.binary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBinaryTest {
    @Test
    public void testAddBinary() throws Exception {
        String a = "1111";
        String b = "110";
        String c = "10101";
        AddBinary bin = new AddBinary();
        String actual = bin.addBinary(a,b);
        Assert.assertEquals(actual, c);
    }
}