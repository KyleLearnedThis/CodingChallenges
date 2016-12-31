package com.albion.removeDup;


import java.util.Map;
import java.util.TreeMap;

import com.albion.core.ListNode;

public class Solution2 {
	public ListNode deleteDuplicates(ListNode head) {

		//1,1,1,1,2
		Map<Integer, Integer> freq = new TreeMap<Integer, Integer>();
		

		ListNode cur = head;
		
		while(cur!=null){
			if(!freq.containsKey(cur.val)){
				freq.put(cur.val, 1);
			}
			else{
				int val = freq.get(cur.val);
				val = val + 1;
				freq.put(cur.val, val);
			}
			cur = cur.next;
		}
		
		ListNode newHead = null;
		ListNode p = null;
		
		for(Map.Entry<Integer, Integer> entry: freq.entrySet() )
		{
			int number = entry.getKey();
			int count = entry.getValue();
			if(count == 1){
				if(newHead == null)
				{
					newHead = new ListNode(number);
					p = newHead;
				}
				else{
					p.next = new ListNode(number);
					p = p.next;
				}
			}

		}
		
		return newHead;
	}
}
