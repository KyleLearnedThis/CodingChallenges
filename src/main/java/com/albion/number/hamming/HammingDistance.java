package com.albion.number.hamming;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int result = 0;
        String x1 = Integer.toBinaryString(x);
        String x2 = Integer.toBinaryString(y);

        int pad;
        StringBuffer buffer = new StringBuffer();
        if(x1.length() > x2.length()) {
            pad = x1.length() - x2.length();
            buffer.append(x2);
            for (int i = 0; i < pad; i++) {
                buffer.insert(0, '0');
            }
            x2 = buffer.toString();
        } else if(x2.length() > x1.length()){
            pad = x2.length() - x1.length();
            buffer.append(x1);
            for (int i = 0; i < pad; i++) {
                buffer.insert(0, '0');
            }
            x1 = buffer.toString();
        }

        for (int i = 0; i < x1.length(); i++) {
            char c1 = x1.charAt(i);
            char c2 = x2.charAt(i);
            if(c1 != c2) {
                result++;
            }
        }

        return result;
    }
}
