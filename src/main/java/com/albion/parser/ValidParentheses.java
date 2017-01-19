package com.albion.parser;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * https://github.com/sofrlowi/hired-challenges/blob/master/hired_challenge_2.png
 */
public class ValidParentheses {
    public boolean isValid(String input){
        Stack<Character> s1 = new Stack<>();
        char[] array = input.toCharArray();

        for(int i = 0; i < array.length; i++){
            char ch = array[i];
            if(ch == '(' || ch == '{' || ch == '[' ){
                s1.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                try{
                    char x = s1.pop();
                    if( ch == ')' && x != '(') {
                        return false;
                    } else if (ch == '}' && x != '{') {
                        return false;
                    } else if (ch == ']' && x != '[')  {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }
        return s1.size() == 0;
    }
}
