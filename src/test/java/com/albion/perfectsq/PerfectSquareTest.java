package com.albion.perfectsq;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PerfectSquareTest {
	@DataProvider(name ="data")
	public Object[][] testBasicProvider() {
		Object[][] ret = { 
				{2209, true}, 
				{25, true},
				{9, true},
				{8, false},
				{26, false}
		};
		return ret;
	}

	@Test(dataProvider = "data")
	public void testBasic(int input, boolean expected) {
		PerfectSquare pq = new PerfectSquare();
		boolean actual = pq.isPerfectSquare(input);
		Assert.assertEquals(actual, expected);
	}
}
