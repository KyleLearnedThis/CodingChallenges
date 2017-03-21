package com.albion.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public int extractValue(String input) {
        String pattern = "[0-9]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        if (m.find()) {
            String s = m.group();
            System.out.println("Found value: " + s);
            return Integer.parseInt(s);
        }else {
            System.out.println("NO MATCH");
            return -1;
        }
    }
}
