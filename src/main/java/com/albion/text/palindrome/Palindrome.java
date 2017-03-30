package com.albion.text.palindrome;

public class Palindrome {

	public static int extract(int x, int digitIndex){
		String str = String.valueOf(x).substring(digitIndex, digitIndex+1);
		return Integer.parseInt(str);
	}

	public static boolean isPalindromeNumber(int x){
		int digits = (int) Math.ceil(Math.log10(x+1));
		int repeat = (int) Math.floor(digits/2);

		for(int i = 0; i < repeat; i++){
			int L = extract(x, i);
			int R = extract(x, digits - i -1);

			if(digits%2 != 0 && i != repeat -1){
				if(L != R)
					return false;
			}
		}
		return true;
	}

	private String formatString(String s){
		if(s == null || s.isEmpty() || s.length() == 1){
			return s;
		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if(Character.isLetter(ch) || (ch >=48 && ch <= 57) ) {
				String str = ch + "";
				str = str.toLowerCase();
				sb.append(str);
			}
		}
		s = sb.toString();
		System.out.println("s: " + s);
		return s;
	}

	/**
	 * https://leetcode.com/problems/valid-palindrome/
	 * @param s
	 * @return
	 */
	public boolean isPalindromeV2(String s) {
		String input = formatString(s);
		if(s == null || s.isEmpty() || s.length() == 1) {
			return true;
		}
		int size = input.length();
		int stop = size/2;
		if(stop == 0) {
			return true;
		}
		for(int i = 0; i <= stop; i++){
			char l = input.charAt(i);
			char r = input.charAt(size - i - 1);
			if(l != r) {
				return false;
			}
		}
		return true;
	}

	public boolean isPalindromeV3(String s) {
		int len = s.length();
		for (int i = 0; i < len/2; i++) {
			int l = i;
			int r = len - i - 1;
			if(l != r) {
				return false;
			}
		}
		return true;
	}
}
