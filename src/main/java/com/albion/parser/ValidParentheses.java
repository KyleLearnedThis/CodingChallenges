package com.albion.parser;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValidSyntax(String input){
		Stack<Integer> stack = new Stack<Integer>();
		
		char[] array = input.toCharArray();
		
		for(int i = 0; i < array.length; i++){
			char ch = array[i];
			if(ch == '('){
				stack.push(1);
			} else if(ch == ')') {
				try{
					stack.pop();
				} catch (EmptyStackException e) {
					return false;
				}
			}
		}
		return stack.size() == 0;
	}
}
