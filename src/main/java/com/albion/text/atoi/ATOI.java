package com.albion.text.atoi;


/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class ATOI {
	public int atoi(String str) {
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

	/**
	 * https://leetcode.com/problems/reverse-integer/
	 */
	public int reverse(int x) {
		boolean isNegative = false;

		if(x < 0) {
			isNegative = true;
			x = Math.abs(x);
		}

		long result = 0;
		int digits = countDigits(x);
		for (int i = 0; i < digits; i++) {
			int digit = extractDigit(x, i);
			int n = digits - i - 1;
			long base = (long) Math.pow(10, n);
			result = result + (long) digit * base;
		}

		if(result > Integer.MAX_VALUE ){
			result = 0;
		}

		if(isNegative){
			result = -result;
		}

		return (int) result;
	}

	public int extractDigit(int value, int index) {
		int base = (int) Math.pow(10, index);
		int digit = value / base % 10;
		return digit;
	}

	public int countDigits(int value) {
		int digit = (int) Math.ceil(Math.log10(value + 1));
		return digit;
	}
}
