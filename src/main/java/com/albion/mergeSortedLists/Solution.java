package com.albion.mergeSortedLists;

import com.albion.core.ListNode;



/*
 * 		Integer[] i1 = {1,2,3,5};
		Integer[] i2 = {3,4,5};
		Integer[] i3 = {1,2,3,3,4,5,5};
		
		Case 1: no overlap
		Case 2: some overlap;
		
		1-2-3, 1-2-3
		
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    	ListNode l1_last = last(l1);
    	ListNode l2_last = last(l2);
    	
    	
    	/*
    	 * Non intersect
    	 * 
    	 * Case 1 i1 is before i2
    	 * i1 = 1 2 3
    	 * i2 = 5 6 7
    	 * 
    	 * case 2 i2 is before i1

    	 * i1 = 4 5 6
    	 * i2 = 1 2 3
    	 */
    	
    	if(l2.val >= l1_last.val ){
    		//1 2 [3]   [4] 5  6
    		
    	}
    	//[4] 5 6, 1 2 [3]
    	else if(l1.val >= l2_last.val){
    		
    	}
    	else {
    		//everything in between
    		
    	}
//    	
    	
    	return null;
    }
    
    public ListNode last(ListNode head)
    {
    	ListNode cur = head;
    	while(cur != null){
    		if(cur.next == null){
    			return cur;
    		}
    			
    		cur = cur.next;
    	}
    	
    	return cur;
    }
    

}