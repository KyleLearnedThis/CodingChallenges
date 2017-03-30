package com.albion.lists.permutations;

import java.util.*;

public class AllPermutations {

    public List<List<List<Integer>>> allPairs(int[] input) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }

        ArrayList<List<List<Integer>>> results = new ArrayList<>();
        compute(set, new ArrayList<>(), results);
        for (List<List<Integer>> result : results) {
            System.out.println("====================");
            System.out.println(result);
        }

        return results;
    }

    private void compute(Set<Integer> set, List<List<Integer>> currentResults, List<List<List<Integer>>> results) {
        if (set.size() < 2) {
            results.add(new ArrayList<>(currentResults));
            return;
        }

        List<Integer> list = new ArrayList<>(set);
        Integer first = list.remove(0);
        for (int i=0; i<list.size(); i++) {
            Integer second = list.get(i);
            Set<Integer> nextSet = new LinkedHashSet<>(list);
            nextSet.remove(second);

            List<Integer> pair = Arrays.asList(first, second);
            currentResults.add(pair);
            compute(nextSet, currentResults, results);
            currentResults.remove(pair);
        }
    }
}
