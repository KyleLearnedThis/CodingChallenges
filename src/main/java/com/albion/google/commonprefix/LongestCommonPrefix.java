package com.albion.google.commonprefix;

/**
 * http://www.programcreek.com/2014/02/leetcode-longest-common-prefix-java/
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String result = "";
        if(strs == null || strs.length == 0) {
            return result;
        } else if(strs.length == 1) {
            return strs[0];
        }

        //Find the shortest string amongst strs.
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            int n = str.length();
            if(n < max) {
                max = n;
            }
        }

        for(int i = 0; i < max; i++) {
            for (int j = 0; j < strs.length -1 ; j++) {
                String s1 = strs[j].charAt(i) + "";
                String s2 = strs[j+1].charAt(i) + "";
                if(!s1.equals(s2)) {
                    return s1.substring(0, i);
                }
            }
        }

        return strs[0].substring(0, max);
    }
}
