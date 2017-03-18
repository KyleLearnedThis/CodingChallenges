package com.albion.google.parser;

import java.util.Stack;

/**
 * https://leetcode.com/problems/longest-valid-parentheses
 * http://www.geeksforgeeks.org/length-of-the-longest-valid-substring
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s){
        int result = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    int x = 0;
                    if((i - dp[i - 1]) >= 2){
                        x = dp[i - dp[i - 1] - 2];
                    }
                    dp[i] = dp[i - 1] + x + 2;
                }
                result = Math.max(result, dp[i]);
            }
        }
        return result;
    }

    public int longestValidParenthesesV2(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;

        // Traverse all characters of given string
        for (int i = 0; i < n; i++) {
            // If opening bracket, push index of it

            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                // If closing bracket, i.e.,str[i] = ')'
                // Pop the previous opening bracket's index
                stack.pop();
                if (!stack.empty()) {
                    // Check if this length formed with base of
                    // current valid substring is more than max
                    // so far
                    result = Math.max(result, i - stack.peek());
                }
                else {
                    // If stack is empty. push current index as
                    // base for next valid substring (if any)
                    stack.push(i);
                }
            }
        }
        return result;
    }
}
