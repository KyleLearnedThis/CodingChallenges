package com.albion.lists.remove;

import com.albion.core.ListNode;
import org.testng.annotations.Test;

public class RemoveListTest {
    @Test
    public void testRemoveNthFromEndV1() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        RemoveList list = new RemoveList();
        list.append(input);
        System.out.println("Before");
        list.print();

        ListNode head = list.getHead();
        list.removeNthFromEndV1(head, 2);
        System.out.println("After");
        list.print();
    }

    @Test
    public void testRemoveNthFromEndV2() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        RemoveList list = new RemoveList();
        list.append(input);
        System.out.println("Before");
        list.print();

        ListNode head = list.getHead();
        list.removeNthFromEndV2(head, 2);
        System.out.println("After");
        list.print();
    }
}