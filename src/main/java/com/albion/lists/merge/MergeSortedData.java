package com.albion.lists.merge;

import com.albion.core.ListNode;

public class MergeSortedData {

    /**
     * https://leetcode.com/problems/merge-two-sorted-lists/
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoListsV1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val < l2.val){
                    p.next = l1;
                    l1=l1.next;
                } else{
                    p.next=l2;
                    l2=l2.next;
                }
                p = p.next;
            }else if(l1==null){
                p.next = l2;
                break;
            }else if(l2==null){
                p.next = l1;
                break;
            }
        }

        p = head;
        head = head.next;
        p.next = null;

        return head;
    }

    public ListNode mergeTwoListsV2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoListsV2(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoListsV2(l1, l2.next);
            return l2;
        }
    }

    public int[] mergeSortedArray(int[] A, int[] B) {
        int i, j, k, m, n;
        i = 0;
        j = 0;
        k = 0;
        m = A.length;
        n = B.length;
        int[] C = new int[m+n];
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        //This section covers where they don't overlap.
        if (i < m) {
            for (int p = i; p < m; p++) {
                C[k] = A[p];
                k++;
            }
        } else {
            for (int p = j; p < n; p++) {
                C[k] = B[p];
                k++;
            }
        }
        return C;
    }
}
