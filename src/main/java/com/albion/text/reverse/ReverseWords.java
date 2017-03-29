package com.albion.text.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	public String reverseWords(String s) {

		s = s.trim();
		String[] parsedStr = s.split("\\s+");
		List<String> list = new ArrayList<String>(Arrays.asList(parsedStr));
		Collections.reverse(list);

		StringBuffer sf = new StringBuffer();

		for(String s2: list) {
			sf.append(s2);
			sf.append(" ");
		}
		String result = sf.toString().trim();

		return result;
	}

	public String reverseWordsV2(String s) {

		s = s.trim();
		String[] parsedStr = s.split("\\s+");

		StringBuffer sf = new StringBuffer();
		for(int i = parsedStr.length - 1; i >= 0; i--) {
			sf.append(parsedStr[i]);
			sf.append(" ");
		}
		String result = sf.toString().trim();

		return result;
	}

	public String reverseWordsV3(String s) {
		s = s.trim();
		String[] words = s.split(" ");
		StringBuilder builder = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			builder.append(words[i]);
			if(i != 0){
				builder.append(" ");
			}
		}
		String result = builder.toString();
		return result;
	}
}
