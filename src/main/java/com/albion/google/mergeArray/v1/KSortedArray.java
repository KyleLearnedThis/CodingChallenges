package com.albion.google.mergeArray.v1;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Kyle: What a clever algorithm. stores rows of 1D array based on current index
 * in priority queue and that is one that is going to be polled next (with index updated,
 * in which the current index is being stored into result array). Also note that Priority Queue
 * does not automatically refresh order, you have to add and remove (or reshuffle)
 * to keep it sorted.
 */
public class KSortedArray {
    public static int[] mergeKSortedArray(int[][] arr) {
        //PriorityQueue is heap in Java
        PriorityQueue<ArrayContainer> queue = new PriorityQueue<>();
        int total = 0;

        //add arrays to heap
        for (int i = 0; i < arr.length; i++) {
            queue.add(new ArrayContainer(arr[i], 0));
            total = total + arr[i].length;
        }

        int m = 0;
        int result[] = new int[total];

        //while heap is not empty
        while(!queue.isEmpty()){
            ArrayContainer ac = queue.poll();
            result[m++]=ac.arr[ac.index];

            if(ac.index < ac.arr.length-1){
                queue.add(new ArrayContainer(ac.arr, ac.index+1));
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr2 = { 1, 3, 5, 7 };
        int[] arr1 = { 2, 4, 6, 8 };
        int[] arr3 = { 0, 9, 10, 11 };

        int[] result = mergeKSortedArray(new int[][] { arr1, arr2, arr3 });
        System.out.println(Arrays.toString(result));
    }
}
