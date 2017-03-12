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

    public void delete(ListNode node) {
        if(node.next != null && node.next.next != null) {
            if(node.next == null ){

            }
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }

    /**
     * @param val
     * @return first occurrence of val in the list; Null if not found.
     */
    public ListNode find(int val) {
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == val){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public boolean removeFirst(){
        if(head == null){
            return false;
        }

        int v = head.val;
        head = head.next;
        return true;
    }

    public void removeLast(){
        if(head != null){
            //Only two elements.
            if(head.next == null){
                head = null;
            }else{
                ListNode t = head.next;
                while(t.next.next != null){
                    t = t.next;
                }
                t.next=  null;
            }
        }
    }
}
