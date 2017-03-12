package com.albion.core;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class LinkListTest {
    @Test
    public void testDelete() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        LinkList list = new LinkList();
        list.append(input);
        System.out.println("BEFORE");
        list.print();
        ListNode n = list.find(6);
        Assert.assertNotNull(n);
        list.delete(n);
        System.out.println("AFTER");
        list.print();
    }
}