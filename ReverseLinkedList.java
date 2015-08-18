//https://leetcode.com/problems/reverse-linked-list/
//Reverse a singly linked list.
//
//click to show more hints.
//
//Hint:
//A linked list can be reversed either iteratively or recursively. Could you implement both?

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode curNext;
		while (cur != null) {
			curNext = cur.next;
			cur.next = pre;
			pre = cur;
			cur = curNext;
		}
		return pre;
	}
}
