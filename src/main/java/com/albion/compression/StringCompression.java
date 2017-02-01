package com.albion.compression;

public class StringCompression {
    public static String stringCompression(String input){
        String compressedString = "";

        if("".equals(input)) {
            return "";
        }

        int repeatedFreqCount = 0;
        for(int i=0; i<input.length(); i++){
            if(i == 0){
                repeatedFreqCount++;
            } else {
                if(input.charAt(i) == input.charAt(i-1)){
                    repeatedFreqCount++;
                } else {
                    compressedString += input.charAt(i-1)+""+repeatedFreqCount;
                    repeatedFreqCount = 1;
                }

                if(i == input.length()-1){
                    compressedString += input.charAt(i)+""+repeatedFreqCount;
                }
            }
        }

        if(compressedString.length() < input.length()){
            return compressedString;
        } else {
            return input;
        }
    }
}
