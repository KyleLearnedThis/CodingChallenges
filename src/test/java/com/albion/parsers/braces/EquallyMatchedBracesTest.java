package com.albion.parsers.braces;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EquallyMatchedBracesTest {
	// )(){}

	@DataProvider(name = "data01")
	public Object[][] data() {
		String[] input = { ")(){}", "[]({})", "([])", "{()[]}", "([)]" };
		Object[][] ret = { { input } };

		return ret;
	}

	@Test(dataProvider = "data01")
	public void check_braces(String[] input) {
		EquallyMatchedBraces m = new EquallyMatchedBraces();
		m.check_braces(input);

	}
}
