package com.albion.hired.anagramPair;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckAnagramsPairTest {

    @DataProvider(name = "data")
    public Object[][] makeProvider() {
        String[] s1 = {"cinema", "host", "aba", "train"};
        String[] s2 = {"iceman", "shot", "bab", "rain"};
        int[] x = {1,1,0,0};
        List<Integer> expected = IntStream.of(x).boxed().collect(Collectors.toList());

        return new Object[][] {
                {s1, s2, expected}
        };
    }

    @Test(dataProvider = "data")
    public void testAnagramPairs(String[] s1, String[] s2, List<Integer> expected) throws Exception {
        CheckAnagramsPair c = new CheckAnagramsPair();
        List<Integer> actual = c.anagramPairs(s1, s2);
        Assert.assertTrue(actual.size() == expected.size());
        for (int i = 0; i < actual.size(); i++) {
            Integer a1 = actual.get(i);
            Integer b1 = expected.get(i);
            Assert.assertEquals(a1, b1);
        }
    }

}