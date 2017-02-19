package com.albion.lists.insert;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 */
public class SearchInsertPositionTest {
    @DataProvider(name =  "dp01")
    public Object[][] makeDataProvider(){
        int[] input = {1,3,5,6};
        return new Object[][]{
                {input,5,2},
                {input,2,1},
                {input,0,0},
                {input,7,4}
        };
    }

    @Test(dataProvider = "dp01")
    public void testSearchInsert(int[] input, int target, int expected) throws Exception {
        SearchInsertPosition s = new SearchInsertPosition();
        int actual = s.searchInsert(input, target);
        Assert.assertEquals(actual, expected);
    }
}