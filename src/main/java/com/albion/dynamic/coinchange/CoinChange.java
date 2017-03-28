package com.albion.dynamic.coinchange;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/coin-change
 * http://www.programcreek.com/2015/04/leetcode-coin-change-java/
 * http://www.geeksforgeeks.org/dynamic-programming-set-7-coin-change/
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
                if(i+coin <= amount){
                    if(dp[i] == Integer.MAX_VALUE){
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
        // rem: remaining coins after the last step; count[rem]: minimum number of coins to sums up to rem
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

    public long countWays(int S[], int m, int n) {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)

        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++) {
            for (int j = S[i]; j <= n; j++) {
                table[j] += table[j - S[i]];
            }
        }
        return table[n];
    }

    public int countWaysV2(int S[], int m, int n){
            // If n is 0 then there is 1 solution (do not include any coin)
            if (n == 0) {
                return 1;
            }
            // If n is less than 0 then no solution exists
            if (n < 0){
                return 0;
            }

            // If there are no coins and n is greater than 0, then no solution exist
            if (m <=0 && n >= 1) {
                return 0;
            }
            // count is sums of solutions (i) including S[m-1] (ii) excluding S[m-1]
            return countWaysV2( S, m - 1, n ) + countWaysV2( S, m, n-S[m-1] );
    }
}
