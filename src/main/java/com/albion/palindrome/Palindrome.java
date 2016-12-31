package com.albion.palindrome;

public class Palindrome {

	public static int extract(int x, int digitIndex){
		String str = String.valueOf(x).substring(digitIndex, digitIndex+1);
		return Integer.parseInt(str);
	}
	
	public static boolean isPalindrome(int x){

		int digits = (int) Math.ceil(Math.log10(x+1));

		int repeat = (int) Math.floor(digits/2);

		for(int i = 0; i < repeat; i++){
			int L = extract(x, i);
			int R = extract(x, digits - i -1);
			
//			System.out.println("L:"+L);
//			System.out.println("R:"+R);
			if(digits%2 != 0 && i != repeat -1){
				if(L != R)
					return false;
			}
		}
		System.out.println("");

		//		System.out.println("digits:" + digits);

		return true;
	}

}
