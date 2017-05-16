package com.albion.tree.process;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProcessTreeTest {
    /**
     * [1,3,10,5]
     [3,0,5,3]
     5
     * @throws Exception
     */

    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        int[] x1 = {1,3,10,5};
        List<Integer> pid = IntStream.of(x1).boxed().collect(Collectors.toList());
        int[] x2 = {3,0,5,3};
        List<Integer> ppid = IntStream.of(x2).boxed().collect(Collectors.toList());
        int k1 = 5;
        int[] x3 = {5, 10};
        List<Integer> r1 = IntStream.of(x3).boxed().collect(Collectors.toList());
        return new Object[][]{
                {pid, ppid, k1, r1}
        };
    }

    @Test(dataProvider = "dp01")
    public void testKillProcess(List<Integer> pid, List<Integer> ppid, int kill, List<Integer> expected) throws Exception {
        ProcessTree processTree = new ProcessTree();
        List<Integer> actual = processTree.killProcess(pid, ppid, kill);
        boolean isSameContent = actual.equals(expected);
        Assert.assertTrue(isSameContent);
    }
}