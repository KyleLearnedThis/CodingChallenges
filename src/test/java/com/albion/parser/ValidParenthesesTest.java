package com.albion.parser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidParenthesesTest {

@DataProvider(name = "data")
public Object[][] testIsValidSyntaxData() {
	Object[][] val = {
			{"((()))", true},
			{"(((", false},
			{"(()())", true}
	};
	return val;
}
	
  @Test(dataProvider="data")
  public void testIsValidSyntax(String input, boolean expectation) {
    ValidParentheses v = new ValidParentheses();
    boolean actual = v.isValidSyntax(input);
    Assert.assertEquals(actual, expectation);
  }
}
