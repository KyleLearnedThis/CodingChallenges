package com.albion.number.nthdigit;

/**
 * https://leetcode.com/problems/nth-digit/
 */
public class NthDigit {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    // This is susceptible to learge memory usage when n is large.
    public int findNthDigitV2(int n) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            buffer.append(i);
        }
        String input = buffer.toString();
        String number = input.charAt(n-1) + "";
        int result = Integer.parseInt(number);
        return result;
    }
}
