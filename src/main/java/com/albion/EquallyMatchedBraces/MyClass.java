package com.albion.EquallyMatchedBraces;

import java.util.Stack;

class MyClass {
    public static void check_braces(String[] expressions) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        for(int i = 0; i < expressions.length; i++)
        {

        	String[] exprArrStr = expressions[i].split("(?!^)");
        	Stack<String> stack = new Stack<String>();
        	
        	
        	for(int j = 0; j < exprArrStr.length; j++)
        	{
        		String input = exprArrStr[j];
        		String oppositeInput = opposite(input);

            		if(stack.contains(oppositeInput)){
            			String peek = stack.peek();
            			if(oppositeInput.equals(peek)){        				
            				stack.remove(oppositeInput);
            			}
            		}
            		else{
            			stack.push(input);
            		}


        	}
        	
        	if(stack.size()!=0)
        	{
        		System.out.println("0");
        	}
        	else{
        		System.out.println("1");
        	}
        
        }
    }
    
    public static boolean validChar(String input)
    {
    	if(
    			"(".equals(input) ||
    			")".equals(input) ||
    			"[".equals(input) ||
    			"]".equals(input) ||
    			"{".equals(input) ||
    			"}".equals(input)
    			
    	){
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