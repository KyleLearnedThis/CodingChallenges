package com.albion.dynamic.fibonnaci;

import java.util.Map;
import java.util.TreeMap;

public class Fibonacci {
    public int v1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return v1(n - 1 ) + v1(n - 2);
        }
    }

    public int v2(int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,1);

        if (n == 0 || n == 1 || n == 2) {
            return map.get(n);
        } else {
            for (int i = 3; i <= n; i++) {
                if(!map.containsKey(n)) {
                    int x = map.get(i - 1) + map.get(i-2);
                    map.put(i, x);
                }
            }
        }
        return map.get(n);
    }

    public int v3(int n) {
        if (n < 2) {
            return n;
        }
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i<=n;i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
