package com.albion.core;

import org.testng.annotations.Test;

public class LinkListTest {
    @Test
    public void tetRemoveNthFromEnd() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        LinkList list = new LinkList();
        list.append(input);
        list.print();
    }
}