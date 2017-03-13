package com.albion.text.addstrings;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry == 1) {
            int a = 0;
            if(i >= 0) {
                a = num1Array[i--] - '0';
            }

            int b = 0;
            if(j >= 0) {
               b = num2Array[j--] - '0';
            }

            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        String result = sb.toString();
        return result;
    }
}
