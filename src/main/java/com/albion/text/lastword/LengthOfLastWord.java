package com.albion.text.lastword;

/**
 * http://www.programcreek.com/2014/05/leetcode-length-of-last-word-java/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null) {
            return 0;
        }
        s = s.trim();
        if("".equals(s)) {
            return 0;
        }
        String[] words = s.split(" ");
        String word = words[words.length - 1];
        return word.length();
    }
}
