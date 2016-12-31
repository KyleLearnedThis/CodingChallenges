package com.albion.atoi;

import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtoiTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		Object[][] ret = new Object[][] {
				{"     +004500", 4500}
//				{"    010", 10}
//				{"123", 123}
//				{ "12345", 12345 }, 
//				{ "-54321", -54321 } 		
		};
		return ret;
	}

	@Test(dataProvider = "data01")
	public void testAtoi(String input, int expectedNumber) {
		Atoi s = new Atoi();
		int actual = s.myAtoi(input);
		Assert.assertEquals(actual, expectedNumber, "not equal");
	}
}
