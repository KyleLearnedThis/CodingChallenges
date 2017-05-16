package com.albion.tree.process;

import java.util.*;

/**
 * https://leetcode.com/problems/kill-process
 */
public class ProcessTree {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Set<Integer>> map = makeMap(pid, ppid);
        traverse(map,result,kill);

        return result;
    }

    private Map<Integer, Set<Integer>> makeMap(List<Integer> pid, List<Integer> ppid){
        Map<Integer, Set<Integer>> map = new TreeMap<>();
        for (int i = 0; i < pid.size(); i++) {
            int parent = ppid.get(i);
            int child = pid.get(i);
            Set<Integer> set;
            if(!map.containsKey(parent)) {
                set = new HashSet<>();
                set.add(child);
            } else {
                set = map.get(parent);
                set.add(child);
            }
            map.put(parent, set);
        }
        return map;
    }

    private void traverse(Map<Integer, Set<Integer>> tree, List<Integer> result, int pid) {
        result.add(pid);
        Set<Integer> children = tree.get(pid);
        if(children != null){
            for (Integer child : children) {
                traverse(tree, result, child);
            }
        }
    }
}
