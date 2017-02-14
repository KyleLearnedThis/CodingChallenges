package com.albion.number.complement;

public class NumberComplement {
    public int findComplement(int num) {
        StringBuffer buffer = new StringBuffer();
        while(num != 0) {
            int bit = num % 2;
            if(bit == 1) {
                buffer.insert(0, "0");
            } else {
                buffer.insert(0, "1");
            }
            num = num >> 1;
        }
        String x = buffer.toString();

        int result = 0;
        int base = 1;
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            int val = c - '0';
            result = result + (val * base);
            base = base << 1;
        }
        return result;
    }
}
