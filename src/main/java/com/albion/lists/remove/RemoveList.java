package com.albion.lists.remove;

import com.albion.core.LinkList;
import com.albion.core.ListNode;

/**
 * http://www.programcreek.com/2014/05/leetcode-remove-nth-node-from-end-of-list-java/
 */
public class RemoveList extends LinkList {
    public ListNode removeNthFromEndV1(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        //get length of list
        ListNode p = head;
        int len = 0;
        while(p != null){
            len++;
            p = p.next;
        }

        //if remove first node
        int fromStart = len-n+1;
        if(fromStart==1) {
            return head.next;
        }
        //remove non-first node
        p = head;
        int i=0;
        while(p!=null){
            i++;
            if(i==fromStart-1){
                p.next = p.next.next;
            }
            p=p.next;
        }

        return head;
    }

    public ListNode removeNthFromEndV2(ListNode head, int n) {
        if(head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        //if remove the first node
        if(fast == null){
            head = head.next;
            return head;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    /**
     * http://www.programcreek.com/2014/04/leetcode-remove-linked-list-elements-java/
     * @param head
     * @param val
     * @return
     */
    public ListNode removeAll(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode p = helper;
        while(p.next != null){
            if(p.next.val == val){
                ListNode next = p.next;
                p.next = next.next;
            }else{
                p = p.next;
            }
        }
        helper.next = null;
        return head;
    }
}
