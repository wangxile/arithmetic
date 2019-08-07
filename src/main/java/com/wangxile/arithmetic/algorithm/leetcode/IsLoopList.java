package com.wangxile.arithmetic.algorithm.leetcode;

public class IsLoopList {
	/**
	 * 判断单链表是否存在环
	 * @param head
	 * @return
	 */
	public static <T> boolean isLoopList(ListNode head){
	    ListNode slowPointer, fastPointer;
	    
	    //使用快慢指针，慢指针每次向前一步，快指针每次两步
	    slowPointer = fastPointer = head;
	    while(fastPointer != null && fastPointer.next != null){
	        slowPointer = slowPointer.next;
	        fastPointer = fastPointer.next.next;

	        //两指针相遇则有环
	        if(slowPointer == fastPointer){
	            return true;
	        }
	    }
	    return false;
	}

}
