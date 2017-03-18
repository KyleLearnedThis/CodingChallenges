package com.albion.number.excel;

/**
 * https://leetcode.com/problems/excel-sheet-column-title/
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while(n>0){
            n--;
            char c = (char)('A' + n % 26);
            builder.insert(0, c);
            n = n / 26;
        }
        String result = builder.toString();
        return result;
    }
}
