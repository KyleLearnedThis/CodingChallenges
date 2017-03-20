package com.albion.text.capital;

/**
 * https://leetcode.com/problems/detect-capital
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean result = word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
        return result;
    }
}
