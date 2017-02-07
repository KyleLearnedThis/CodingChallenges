package com.albion.license;

/**
 * https://leetcode.com/problems/license-key-formatting/
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder s = new StringBuilder();
        S = S.replace("-", "");
        S = S.toUpperCase();
        int counter = 1;
        for(int i = S.length() - 1; i >= 0; i--){
            char c = S.charAt(i);
            if( (counter % K == 0) && (i != 0) ) {
                s.insert(0, "-"+c);
            } else {
                s.insert(0, c);
            }
            counter++;
            counter = counter % K;
        }
        String result = s.toString();
        return result;
    }
}
