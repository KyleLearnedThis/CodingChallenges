package com.albion.java;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.TreeMap;

public class OrderedMapTest {
    @Test
    public void testSortMapByValue() throws Exception {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(9,1);
        map.put(8,2);
        map.put(7,3);
        map.put(6,4);
        map.put(5,5);
        OrderedMap orderedMap = new OrderedMap();
        map = orderedMap.sortMapByValue(map);
        System.out.println("AFTER.........");
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println(" key: " + key + " value: " + value);
        }
    }

}