package com.albion.salesforce.highway;

/**
 * This class is implemented for you to make assertions in your tests. See example test.
 *
 */
public class Assert {
    /**
     * Asserts two strings are equal
     */
    public static void assertEquals(String expected, String actual) throws AssertException {
        if (!expected.equals(actual)) {
            throw new AssertException("expected " + expected + ", but actual is " + actual);
        }
    }

    /**
     * Asserts two integers are equal
     */
    public static void assertEquals(int expected, int actual) throws AssertException {
        if (expected != actual) {
            throw new AssertException("expected " + expected + ", but actual is " + actual);
        }
    }
}