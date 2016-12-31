package com.albion.reversewords;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseWordsTest {

	@DataProvider(name = "data01")
	public Object[][] data() {

		return new Object[][] {

		{ "a", "a" } };
	}

	@Test(dataProvider = "data01")
	public void reverseWords(String input, String expected) {
		Solution s = new Solution();
		String actual = s.reverseWords(input);

		Assert.assertEquals(actual, expected);
	}
}
