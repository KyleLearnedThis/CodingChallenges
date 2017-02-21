package com.albion.dynamic.coinchange;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CoinChangeTest {
    @DataProvider(name = "dp01")
    public Object[][] makeDataProvider() {
        int[] coins = {25,10,5,1};
        return new Object[][] {
                {coins, 7, 3},
                {coins, 10, 1},
                {coins, 18, 5}
        };
    }
    @Test(dataProvider = "dp01")
    public void testDynamicProgramming(int[] coins, int amount, int expectedCoins) throws Exception {
        CoinChange coinChange = new CoinChange();
        int actual = coinChange.dynamicProgramming(coins, amount);
        Assert.assertEquals(actual, expectedCoins);
    }

    @Test(dataProvider = "dp01")
    public void testBfs(int[] coins, int amount, int expectedCoins) throws Exception {
        CoinChange coinChange = new CoinChange();
        int actual = coinChange.bfs(coins, amount);
        Assert.assertEquals(actual, expectedCoins);
    }

    @Test(dataProvider = "dp01")
    public void testIterative(int[] coins, int amount, int expectedCoins) throws Exception {
        CoinChange coinChange = new CoinChange();
        int actual = coinChange.iterative(coins, amount);
        Assert.assertEquals(actual, expectedCoins);
    }
}