package com.albion.sort.topK.v2;

import java.util.*;

public class TopKElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->a.count-b.count);

        //maintain a heap of size k.
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            Pair p = new Pair(entry.getKey(), entry.getValue());
            queue.offer(p);
            if(queue.size()>k){
                queue.poll();
            }
        }

        //get all elements from the heap
        List<Integer> result = new ArrayList<Integer>();
        while(queue.size()>0){
            result.add(queue.poll().num);
        }
        //reverse the order
        Collections.reverse(result);

        return result;
    }
}
