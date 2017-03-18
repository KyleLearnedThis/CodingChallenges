package com.albion.number.hexa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HexadecimalTest {
    @Test
    public void testToHex1() throws Exception {
        int input = 26;
        String expected = "1a";
        Hexadecimal hex = new Hexadecimal();
        String actual = hex.toHex(input);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testToHex2() throws Exception {
        int input = -1;
        String expected = "ffffffff";
        Hexadecimal hex = new Hexadecimal();
        String actual = hex.toHex(input);
        Assert.assertEquals(actual,expected);
    }
}