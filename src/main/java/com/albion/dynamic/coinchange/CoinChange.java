package com.albion.dynamic.coinchange;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/coin-change
 * http://www.programcreek.com/2015/04/leetcode-coin-change-java/
 */
public class CoinChange {
    public int dynamicProgramming(int[] coins, int amount) {
        if(amount==0) {
            return 0;
        }

        int[] dp = new int [amount+1];
        dp[0]=0; // do not need any coin to get 0 amount
        for(int i=1;i<=amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<=amount; i++){
            for(int coin: coins){
                if(i+coin <=amount){
                    if(dp[i]==Integer.MAX_VALUE){
                        dp[i+coin] = dp[i+coin];
                    }else{
                        dp[i+coin] = Math.min(dp[i+coin], dp[i]+1);
                    }
                }
            }
        }

        if(dp[amount] >= Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }
    public int bfs(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        LinkedList<Integer> amountQueue = new LinkedList<>();
        LinkedList<Integer> stepQueue = new LinkedList<>();

        // to get 0, 0 step is required
        amountQueue.offer(0);
        stepQueue.offer(0);

        while (amountQueue.size() > 0) {
            int temp = amountQueue.poll();
            int step = stepQueue.poll();
            if (temp == amount) {
                return step;
            }
            for (int coin : coins) {
                if (temp > amount) {
                    continue;
                } else {
                    if (!amountQueue.contains(temp + coin)) {
                        amountQueue.offer(temp + coin);
                        stepQueue.offer(step + 1);
                    }
                }
            }
        }
        return -1;
    }

    public int iterative(int[] coins, int amount) {
        if(amount<1) {
            return 0;
        }
        return helper(coins, amount, new int[amount]);
    }

    private int helper(int[] coins, int rem, int[] count){
        // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
        if(rem<0) return -1; // not valid
        if(rem==0) return 0; // completed
        if(count[rem-1] != 0) return count[rem-1]; // already computed, so reuse
        int min = Integer.MAX_VALUE;
        for(int coin : coins) {
            int res = helper(coins, rem-coin, count);
            if(res>=0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem-1] = (min==Integer.MAX_VALUE) ? -1 : min;
        return count[rem-1];
    }
}
