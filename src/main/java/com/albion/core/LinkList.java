package com.albion.core;

public class LinkList {
    public ListNode head = null;

    public ListNode append(int val) {
        ListNode cur = head;
        if(head == null) {
            head = new ListNode(val);
        } else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = new ListNode(val);
        }
        return head;
    }

    public ListNode insertAtHead(int val) {
        if(head == null) {
            head = new ListNode(val);
        } else {
            ListNode node = new ListNode(val);
            node.next = head;
            head = node;
        }
        return head;
    }

    public ListNode append(int[] input) {
        for (int i = 0; i < input.length; i++) {
            append(input[i]);
        }
        return head;
    }

    public void print() {
        for(ListNode cur = head; cur != null; cur = cur.next) {
            System.out.print(" " + cur.val);
        }
        System.out.println("");
    }

    public ListNode getHead() {
        return head;
    }
}
