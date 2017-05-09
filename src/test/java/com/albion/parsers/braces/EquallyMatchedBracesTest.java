package com.albion.parsers.braces;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EquallyMatchedBracesTest {

	@DataProvider(name = "data01")
	public Object[][] makeData() {
		String[] x1 = { "{}[]()", "{[}]"};
		String[] e1 = { "YES", "NO"};
		String[] x2 = { ")(){}", "[]({})", "([])", "{()[]}", "([)]" };
		String[] e2 = { "NO", "YES", "YES", "YES", "NO"};
		Object[][] inputs = { {x1, e1}, {x2, e2} };
		return inputs;
	}

	@Test(dataProvider = "data01")
	public void testBraces(String[] input, String[] expected) {
		EquallyMatchedBraces m = new EquallyMatchedBraces();
		String[] actual = m.braces(input);
		boolean result = Arrays.equals(expected, actual);
		Assert.assertTrue(result);
	}
}
