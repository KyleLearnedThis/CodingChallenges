package com.albion.google.commonprefix;

/**
 * http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        } else if(strs.length == 1) {
            return strs[0];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int n = str.length();
            if(n < min) {
                min = n;
            }
        }

        for(int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length -1 ; j++) {
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i) != s2.charAt(i)) {
                    return s1.substring(0, i);
                }
            }
        }

        return strs[0].substring(0, min);
    }
}
