package com.albion.classics.twosum;

import java.util.*;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {

		int result[] = new int[2];
		Integer[] x = new Integer[numbers.length];
		for (int i = 0; i < x.length; i++) {
			x[i] = new Integer(numbers[i]);
		}

		List<Integer> list = new ArrayList<>(Arrays.asList(x));

		for (int i = 0; i < list.size(); i++) {
			List<Integer> cloneList = new ArrayList<>(list);
			for (int j = 0; j < cloneList.size(); j++) {
				if (i + j == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}

		}

		return result;
	}

	public void twoSumV2(int[] array, int sum) {
		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				List<Integer> indices = map.get(array[i]);
				indices.add(i);
				map.put(array[i], indices);
			} else {
				List<Integer> indices = new ArrayList<>();
				indices.add(i);
				map.put(array[i], indices);
			}
		}
		for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
			int key = entry.getKey();
			System.out.print("[" + key + "]");
			List<Integer> list = entry.getValue();
			for (Integer i : list) {
				System.out.print(" " + i);
			}
			System.out.println("");
		}
		System.out.println("----------------");

		for (int i = 0; i < array.length; i++) {
			int b = sum - array[i];
			if (map.containsKey(b)) {
				List<Integer> indices = map.get(b);
				for (Integer index : indices) {
					if (i != index && i < index) {
						System.out.println(String.format("twoSum() : Indices %d and %d add up to the target %d", i, index, sum));
					}
				}
			}
		}
	}
}