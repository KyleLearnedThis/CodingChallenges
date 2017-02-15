package com.albion.text.split;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 */
public class CountSegments {
    public int countSegments(String s) {
        s = s.trim();
        if("".equals(s)) {
            return 0;
        }
        String[] array = s.split("\\s+");
        return array.length;
    }
}
