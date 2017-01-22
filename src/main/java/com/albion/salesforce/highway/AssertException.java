package com.albion.salesforce.highway;

/**
 * This class is implemented for you to throw assertion exceptions in your tests. See example test.
 */
@SuppressWarnings("serial")
public class AssertException extends Exception {
	public AssertException() {
		super();
	}

	public AssertException(String message) {
		super(message);
	}
}