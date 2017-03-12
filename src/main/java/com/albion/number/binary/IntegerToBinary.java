package com.albion.number.binary;

public class IntegerToBinary {
    public String toBinaryString(int n){
        int input = n;
        StringBuffer buffer = new StringBuffer();
        while(input > 0) {
            int bit = input % 2;
            buffer.insert(0, bit);

            input = input >> 1;
        }
        String result = buffer.toString();
        return result;
    }
}
