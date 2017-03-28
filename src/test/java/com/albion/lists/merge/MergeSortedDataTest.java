package com.albion.lists.merge;

import com.albion.core.SingleLinkedList;
import com.albion.core.ListNode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedDataTest {
    @Test
    public void testMergeTwoListsV1() throws Exception {
        int[] a1 = {2,3,4,5};
        int[] b1 = {4,5,6,7,8};

        SingleLinkedList list1 = new SingleLinkedList(a1);
        SingleLinkedList list2 = new SingleLinkedList(b1);
        MergeSortedData m = new MergeSortedData();

        System.out.println("[Version 1]");
        ListNode n1 = m.mergeTwoListsV1(list1.getHead(), list2.getHead());
        printList(n1);
    }

    @Test
    public void testMergeTwoListsV2() throws Exception {
        int[] a1 = {2,3,4,5};
        int[] b1 = {4,5,6,7,8};

        SingleLinkedList list1 = new SingleLinkedList(a1);
        SingleLinkedList list2 = new SingleLinkedList(b1);
        MergeSortedData m = new MergeSortedData();

        System.out.println("[Version 2]");
        ListNode n1 = m.mergeTwoListsV2(list1.getHead(), list2.getHead());
        printList(n1);
    }


    @DataProvider(name = "dp01")
    public Object[][] makeData(){
        //Center overlap
        int[] a1 = {2,3,4,5};
        int[] b1 = {4,5,6,7,8};
        int[] r1 = {2,3,4,4,5,5,6,7,8};

        //No overlap;
        int[] a2 = {1,2,3,4};
        int[] b2 = {5,6,7,8};
        int[] r2 = {1,2,3,4,5,6,7,8};

        //b is in a
        int[] a3 = {1,2,3,4};
        int[] b3 = {2,3};
        int[] r3 = {1,2,2,3,3,4};

        return new Object[][]{
                {a1,b1,r1},
                {a2,b2,r2},
                {a3,b3,r3}
        };
    }

    @Test(dataProvider = "dp01")
    public void testMergeSortedArray(int[] a, int[] b, int[] expected) throws Exception {
        MergeSortedData m = new MergeSortedData();
        int[] actual = m.mergeSortedArray(a, b);
        boolean result = Arrays.equals(actual, expected);
        Assert.assertTrue(result);
    }

    private void printList(ListNode node){
        for(ListNode cur = node; cur != null; cur = cur.next) {
            System.out.print(" " + cur.val);
        }
        System.out.println("");
    }
}