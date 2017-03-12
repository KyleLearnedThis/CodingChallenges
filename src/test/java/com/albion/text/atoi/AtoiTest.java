package com.albion.text.atoi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AtoiTest {

	@DataProvider(name = "data02")
	public Object[][] dat02() {
		Object[][] ret = new Object[][] {
				{1234, 4321},
				{-1234, -4321},
				{100, 1},
				{ 1010, 101 },
				{1534236469, 0},
				{-1563847412, 0}
		};
		return ret;
	}

	@Test(dataProvider = "data02")
	public void testReverse(int input, int expected) throws Exception {
		Atoi atoi = new Atoi();
		int actual = atoi.reverse(input);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void testCountDigits() throws Exception {
		Atoi a = new Atoi();
		int actual = a.countDigits(1234);
		Assert.assertEquals(actual,4);
	}

	@Test
	public void testExtractDigit() throws Exception {
		Atoi a = new Atoi();
		int actual = a.extractDigit(123, 1);
		Assert.assertEquals(actual, 2);
	}

	@DataProvider(name = "data01")
	public Object[][] data() {
		Object[][] ret = new Object[][] {
				{"     +004500", 4500},
				{"    010", 10},
				{"123", 123},
				{ "12345", 12345 },
				{ "-54321", -54321 }
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
