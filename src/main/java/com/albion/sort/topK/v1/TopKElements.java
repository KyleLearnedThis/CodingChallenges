package com.albion.sort.topK.v1;

import java.util.*;

public class TopKElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>(0);

		for(int i = 0; i < nums.length; i++){
			int key = nums[i];
			if(freq.containsKey(key)) {
				int val = freq.get(key);
				val++;
				freq.put(key, val);
			} else {
				freq.put(key, 1);
			}
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        // Collections.sort(list, (o1,o2)->(o2.getValue().compareTo(o1.getValue())));
		Collections.sort(list, (o1,o2)->(o2.getValue()-o1.getValue()));
		List<Integer> result = new ArrayList<>();

		for(int i = 0; i < k; i++){
			Map.Entry<Integer, Integer> entry = list.get(i);
			int key = entry.getKey();
			result.add(key);
		}
		return result;
	}
}
