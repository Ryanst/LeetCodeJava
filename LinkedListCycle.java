//https://leetcode.com/problems/linked-list-cycle/
//Given a linked list, determine if it has a cycle in it.
//
//Follow up:
//Can you solve it without using extra space?


public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
		 if(head == null || head.next == null)	return false;
		 ListNode one = head;
		 ListNode two = head.next;
		 while(two != null && two.next != null)
		 {
			 if(one == two)	return true;
			 one = one.next;
			 two = two.next.next;
		 }
		 return false;
	 }
}
