package com.albion.text.repeat;

/**
 * https://leetcode.com/problems/repeated-substring-pattern
 */
public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = (len + 1) / 2; i < len; i++) {
            if(len % (len - i) == 0) {
                String prefix = s.substring(0, i);
                String remainder = s.substring(i);
                String suffix = s.substring(len - i);
                if(s.startsWith(remainder) && suffix.equals(prefix)){
                    return true;
                }
            }
        }
        return false;
    }

    // Used Knuth-Morris-Pratt algorithm
    public boolean repeatedSubstringPatternKMP(String s) {
        int l = s.length();
        int[] lps = new int[l];
        int leading = 1;
        int chasing = 0;
        while(leading < l) {
            if(s.charAt(chasing) == s.charAt(leading)) {
                chasing++;
                lps[leading] = chasing;
                leading++;
            }else {
                if(chasing > 0) {
                    chasing = lps[chasing - 1];
                }else {
                    chasing = 0;
                    leading++;
                }
            }
        }
        int lp = lps[l - 1];
        return (lp > 0 && l % (l - lp) == 0 && s.startsWith(s.substring(lp)));
    }
}
