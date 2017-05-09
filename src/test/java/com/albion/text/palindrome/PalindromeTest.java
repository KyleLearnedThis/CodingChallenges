package com.albion.text.palindrome;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeTest {
    @Test
    public void testCanBeConvertedIntoPalindrome() throws Exception {
    	String input = "abbbbcc";
    	boolean expected = true;
    	Palindrome p = new Palindrome();
    	boolean actual = p.canBeConvertedIntoPalindrome(input);
    	Assert.assertEquals(expected,actual);
    }

    @DataProvider(name = "dp02")
	public Object[][] makeDataV2() {
		return new Object[][] {
				{"abcba", true},
				{"abccba", true},
				{"a", true},
				{"abca", false}
		};
	}

	@Test(dataProvider = "dp02")
	public void testIsPalindromeV3(String input, boolean expected) throws Exception {
		Palindrome p = new Palindrome();
		boolean actual = p.isPalindromeV3(input);
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void isPalindromeNumberV1() {
		boolean result1 = Palindrome.isPalindromeNumber(1234321);
		Assert.assertTrue(result1);

		boolean result2 = Palindrome.isPalindromeNumber(12344321);
		Assert.assertTrue(result2);

		boolean result3 = Palindrome.isPalindromeNumber(12345);
		Assert.assertFalse(result3);
	}

	@Test
	public void isPalindromeNumberV2() {
		boolean result0 = Palindrome.isPalindromeNumberV2(-2147483648);
		Assert.assertFalse(result0);

		boolean result1 = Palindrome.isPalindromeNumberV2(1234321);
		Assert.assertTrue(result1);

		boolean result2 = Palindrome.isPalindromeNumberV2(12344321);
		Assert.assertTrue(result2);

		boolean result3 = Palindrome.isPalindromeNumberV2(12345);
		Assert.assertFalse(result3);
	}

	@DataProvider(name = "dp01")
	public Object[][] makeData() {
		return new Object[][] {
				{"abcba", true},
				{"abccba", true},
				{"A man, a plan, a canal: Panama", true},
				{"abca", false},
				{"a", true},
				{".,", true},
				{"0P", false},
				{"a.", true}
		};
	}

	@Test(dataProvider = "dp01")
	public void testIsPalindromeV2(String input, boolean expected) {
		Palindrome p = new Palindrome();
		boolean actual = p.isPalindromeV2(input);
		Assert.assertEquals(actual, expected);
    }
}
