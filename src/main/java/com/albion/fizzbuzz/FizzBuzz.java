package com.albion.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        if(n <= 0) {
            return list;
        }
        String[] words = {"Fizz", "Buzz", "FizzBuzz"};
        for(int i = 1; i <= n; i++){
            int x = i;
            String current = "";
            if(x % 3 == 0 || x % 5 == 0) {
                if(x % 3 == 0 && x % 5 == 0) {
                    current = words[2];
                } else if(x % 3 == 0) {
                    current = words[0];
                } else if (x % 5 == 0) {
                    current = words[1];
                }
            } else {
                current = Integer.toString(i);
            }
            list.add(current);
        }
        return list;
    }
}
