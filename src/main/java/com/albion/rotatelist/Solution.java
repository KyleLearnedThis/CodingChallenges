package com.albion.rotatelist;

import com.albion.core.ListNode;

public class Solution {

    public ListNode rotateRight(ListNode head, int n) {
        
    	int size = size(head);
    	
    	if(size == 0  || size == 1)
    	{
    		return head;
    	}
    	
    	int k = n % size;
    	ListNode cur = head;
    	
    	while(k > 0)
    	{
    		cur = cur.next;
    		k--;
    	}
    	
    	ListNode last = last(head);
    	ListNode prev = getPrev(head, cur);
    	
    	ListNode glue = head;
    	
    	last.next = glue;
    	head = prev;
    	prev.next = null;
    	
    	
    	
    	return head;
    }
    
 
    
    public int size(ListNode head)
    {
    	
    	int size = 0;
    	
    	ListNode cur = head;
    	while(cur != null)
    	{
    		cur = cur.next;
    		size++;
    	}
		return size;
    	
    }
    
    public ListNode last(ListNode head)
    {
    	ListNode cur = head;
    	while(cur.next != null)
    	{
    		cur = cur.next;
    	}
    	return cur;
    }
    
    public ListNode getPrev(ListNode head, ListNode p)
    {
    	ListNode cur = head;
    	
    	while(cur != null){
        	if(cur.next == p){
        		return cur;
        	}
        	cur = cur.next;
    	}
    	
    	return null;

    }
}
