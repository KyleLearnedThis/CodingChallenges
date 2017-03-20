package com.albion.lists.plusone;

/**
 * https://leetcode.com/problems/plus-one/#/description
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len - 1]++;
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if(carry == 1) {
                digits[i]++;
                carry = 0;
            }
            if(digits[i] >= 10) {
                digits[i] = digits[i] % 10;
                if(i != 0) {
                    carry = 1;
                } else {
                    int[] array = new int[len + 1];
                    array[0] = 1;
                    System.arraycopy(digits, 0, array, 1, len);
                    digits = array;
                }
            }
        }
        return digits;
    }
}
