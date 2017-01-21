package com.albion.dupilcate;

import junit.framework.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainDuplicatesTest {
    @DataProvider(name = "data01")
    public Object[][] makeDataProvider() {
        int[] x1 = {4,3,2,7,8,2,3,1};
        int[] o1 = {2,3};
        List<Integer> y1 = IntStream.of(o1).boxed().collect(Collectors.toList());

        int[] x2 = {1,2,3,4,5,5,6,7,8,8};
        int[] o2 = {5,8};
        List<Integer> y2 = IntStream.of(o2).boxed().collect(Collectors.toList());

        return new Object[][] {
                {x1, y1},
                {x2, y2}
        };
    }
    @Test(dataProvider = "data01")
    public void testFindDuplicates(int[] input, List<Integer> expected) throws Exception {
        ContainDuplicates c = new ContainDuplicates();
        List<Integer> actual = c.findDuplicates(input);
        Assert.assertEquals(actual.size(), expected.size());
        Assert.assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }

}