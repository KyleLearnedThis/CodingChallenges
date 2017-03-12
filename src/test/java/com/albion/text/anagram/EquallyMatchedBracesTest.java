package com.albion.text.anagram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class EquallyMatchedBracesTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		String[] firstWords = { "cinema", "host", "aba", "train" };
		String[] secondWords = { "iceman", "shot", "shot", "rain" };

		return null;
	}

	// @Test(dataProvider="data01")
	@Test(expectedExceptions=UnsupportedOperationException.class)
	public void testFixedList() {

		String[] firstWords = { "cinema", "host", "aba", "train" };
		List<String> x = Arrays.asList(firstWords);
		//List<String> x = new ArrayList<String>(Arrays.asList(firstWords));
		x.add("creme");
		
		for(String str: x)
		{
			System.out.println("str:"+str);
		}
	}
}
