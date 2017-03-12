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

    /**
     * http://quiz.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
     * @param position
     */
    public void delete(int position) {
        // If linked list is empty
        if (head == null) {
            return;
        }

        // Store head node
        ListNode temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position-1; i++) {
            temp = temp.next;
        }
        // If position is more than number of nodes
        if (temp == null || temp.next == null) {
            return;
        }
        // Node temp.next is the node to be deleted
        // Store pointer to the next of node to be deleted
        ListNode next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
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
