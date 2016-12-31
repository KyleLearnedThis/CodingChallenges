package com.albion.ReorderList;

import java.util.Stack;

import com.albion.core.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        
        for(ListNode l = head; l!=null; l=l.next)
        {
        	stack.push(l);
        }
        
        if(stack == null || stack.size() <3)
        {
        	return;
        }
        //1,2,3,4,5,6,7,8
        //1,8,2,7,3,6,4,5
        
        //1,2,3,4,5,6,7
        //1,7,2,6,3,5,4
        int loopSize = stack.size()/2;
        ListNode cur = head;
        
        for(int i = 0; i < loopSize; i++)
        {
        	ListNode nextNode = cur.next;
        	ListNode fromStackNode = stack.pop();
        	
        	cur.next = fromStackNode;
        	fromStackNode.next = nextNode;
        	cur = nextNode;
        	
        	if(i == loopSize - 1){
        		cur.next = null;
        	}
        }

    }
}