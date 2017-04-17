package com.albion.lists.single;

import com.albion.graphs.highway.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SingleElementTest {
    @DataProvider(name = "dp01")
    public Object[][] makeData(){
        int[] x1 = {1,1,2,3,3,4,4,8,8};
        int y1 = 2;
        int[] x2 = {3,3,7,7,10,11,11};
        int y2 = 10;
        return new Object[][] {
//                {x1, y1},
                {x2, y2}
        };
    }

    @Test(dataProvider = "dp01")
    public void testSingleNonDuplicate(int[] input, int expected) throws Exception {
        SingleElement se = new SingleElement();
        int actual = se.singleNonDuplicate(input);
        Assert.assertEquals(actual,expected);
    }
}