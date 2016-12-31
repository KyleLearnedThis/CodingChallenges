package com.albion.atoi;

/*
 * 1235
 * 
 */
public class Atoi {
	public int myAtoi(String str) {
		if("".equals(str)){
			return 0;
		}
		str = str.trim();
		boolean isNegative = false;
		if(str.charAt(0) == '+') {
			str = str.substring(1, str.length());	
		} else if (str.charAt(0) == '-'){
			isNegative = true;
			str = str.substring(1, str.length());	
		}
		str = str.replaceFirst("^0+(?!$)", "");

		int sum = 0;
		char[] array = str.toCharArray();
		int length = array.length;
		for(int i = 0; i < length; i++){
			
			int num = array[i] - 48;
			if(num  > 10 || num < 0){
				return 0;
			}
			
			int cur = getValue(i, array);
			sum = sum + cur;
		}
		
		if(isNegative) {
			sum = 0 - sum;
		}
		return sum;
	}
	
	public int getValue(int index, char[] x) {  // index = 1, length =3 
		int n = x.length - index - 1; // 3 - 1 - 1
		int base = new Double(Math.pow(10, n)).intValue();
		int val = x[index] - 48;
		int result = val * base;
		return result;
	}
}
