package com.albion.apple.numbers;

public class ExtractNumbers {

    public int extractNumbers(String input) {
        Integer result = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int l = i;
            int r = -1;

            int m = ch - '0';
            if (m >= 0 && m < 10) {
                r = getRightBound(input, i);
                if(r != -1) {
                    String str = "";
                    if(r == input.length() - 1){
                        str = input.substring(l);
                    } else {
                        str = input.substring(l, r);
                    }
                    result = result + Integer.parseInt(str);
                    i = r;
                }
            } else {
                continue;
            }
        }
        return result;
    }

    /**
     *
     * @param input
     * @param start
     * @return the index of last digit from the starting index
     */
    public int getRightBound(String input, int start) {
        String s = input.substring(start);
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if(n >= 0 && n < 10) {
                if(i != s.length() - 1){
                    continue;
                } else {
                    return start + i;
                }
            } else {
                return start + i;
            }
        }

        return -1;
    }
}
