package com.albion.parsers.braces;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class EquallyMatchedBraces {
	public static String[] braces(String[] values) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			list.add(isValidParenthesis(values[i]));
		}

		String[] result = new String[list.size()];
		list.toArray(result);
		return result;

	}
	public static String isValidParenthesis(String values) {
		String[] exprArrStr = values.split("(?!^)");
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < values.length(); i++) {
			for(int j = 0; j < exprArrStr.length; j++) {
				String input = exprArrStr[j];

				if(isLeftBrace(input)) {
					stack.push(input);
				}
				if(isRightBrace(input)) {
					if(stack.size() == 0) {
						return "NO";
					}
					String x = stack.peek();
					String oppositeInput = opposite(x);
					if(oppositeInput.equals(input)) {
						stack.pop();
					} else {
						return "NO";
					}
				}
			}

			if(stack.size()==0) {
				return "YES";

			} else{
				return "NO";
			}
		}
		return "NO";
	}

	public static boolean isLeftBrace(String input) {
		if("(".equals(input) || "{".equals(input) || "[".equals(input) ){
			return true;
		}
		else
			return false;
	}

	public static boolean isRightBrace(String input) {
		if(")".equals(input) || "}".equals(input) || "]".equals(input) ){
			return true;
		}
		else
			return false;
	}

	public static String opposite(String input)
	{
		if(")".equals(input)){
			return "(";
		}
		else if("(".equals(input))
		{
			return ")";
		}
		else if("[".equals(input)){
			return "]";
		}
		else if("]".equals(input)){
			return "[";
		}
		else if("}".equals(input)){
			return "{";
		}
		else if("{".equals(input)){
			return "}";
		}
		return "=";
	}
}