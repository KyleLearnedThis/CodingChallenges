package com.albion.number.numbersDisappeared;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbersTest {
    /**
     * Input:
     * [4,3,2,7,8,2,3,1]
     * Output:
     * [5,6]
     */
    @Test
    public void testFindNumberDisappeared() {
        int[] input = {4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(6);

        FindDisappearedNumbers f = new FindDisappearedNumbers();
        List<Integer> actual = f.findDisappearedNumbers(input);
        Assert.assertTrue(actual.size() == expected.size());
        Assert.assertTrue(actual.equals(expected));
    }
}