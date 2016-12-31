package com.albion.reversevowels;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseStringVowelsTest {

	@DataProvider(name = "dp")
	public Object[][] dataProvider() {
		String input = "ABCDE";
		String output = "EBCDA";
		Object[][] retVal = new Object[][] {
				{
					input, output
				}
		};
		return retVal;
	}

	@Test(dataProvider = "dp")
	public void testReverseVowels(String input, String output) {
		ReverseStringVowels s = new ReverseStringVowels();
		String result = s.reverseVowels(input);
		System.out.println(result);
	}
}
