package com.albion.EquallyMatchedBraces;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyClassTest {
	// )(){}

	@DataProvider(name = "data01")
	public Object[][] data() {
		String[] input = { ")(){}", "[]({})", "([])", "{()[]}", "([)]" };
		Object[][] ret = { { input } };

		return ret;
	}

	@Test(dataProvider = "data01")
	public void check_braces(String[] input) {
		MyClass m = new MyClass();
		m.check_braces(input);

	}
}
