package com.albion.core;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class SingleLinkedListTest {
    @Test
    public void testDelete() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        SingleLinkedList list = new SingleLinkedList();
        list.append(input);
        System.out.println("BEFORE");
        list.print();
        ListNode n = list.find(6);
        Assert.assertNotNull(n);
        list.delete(5);
        System.out.println("AFTER");
        list.print();
    }
}