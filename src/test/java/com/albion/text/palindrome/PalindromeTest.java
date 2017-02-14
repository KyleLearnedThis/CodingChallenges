package com.albion.text.palindrome;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PalindromeTest {

  @Test
  public void isPalindrome() {
	  boolean result1 = Palindrome.isPalindromeNumber(1234321);
	  Assert.assertTrue(result1);
	  
	  boolean result2 = Palindrome.isPalindromeNumber(12344321);
	  Assert.assertTrue(result2);
	  
	  boolean result3 = Palindrome.isPalindromeNumber(12345);
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
