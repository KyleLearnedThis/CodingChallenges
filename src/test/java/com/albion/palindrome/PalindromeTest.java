package com.albion.palindrome;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

  @Test
  public void isPalindrome() {
	  boolean result1 = Palindrome.isPalindrome(1234321);
	  Assert.assertTrue(result1);
	  
	  boolean result2 = Palindrome.isPalindrome(12344321);
	  Assert.assertTrue(result2);
	  
	  boolean result3 = Palindrome.isPalindrome(12345);
	  Assert.assertFalse(result3);
  }
}
