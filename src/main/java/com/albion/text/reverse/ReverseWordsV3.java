package com.albion.text.reverse;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsV3 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            String word = new StringBuffer(words[i]).reverse().toString();
            sb.append(word);
            if(i != words.length - 1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
