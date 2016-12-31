package com.albion.PowerOfFour;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
    	
    	Integer x = new Integer(num);
    	String input = x.toBinaryString(x);
    	if(num == 0){
    		return false;
    	}else if(num == 1){
    		return true;
    	}
    	if(input.toCharArray().length % 2 == 0){
    		return false;
    	} else {
    		String copy = new String(input);
    		String y = copy.replace("0", "");
    		return y.equals("1");
    	}
    }
    
   public boolean isPowerOfFourV2(int num) {
	   if(num % 4 != 0){
		   return false;
	   } else {
		   int val = num;
		   while(val != 1) {
			   val = val / 4;
			   if(val == 1){
				   return true;
			   } else {
				   if(val % 4 != 0) {
					   return false;
				   } else {
					   continue;
				   }
			   }
		   }
		   return true;
	   }
    }
}