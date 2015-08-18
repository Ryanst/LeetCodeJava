//https://leetcode.com/problems/reverse-linked-list-ii/

//Reverse a linked list from position m to n. Do it in-place and in one-pass.
//
//For example:
//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
//
//return 1->4->3->2->5->NULL.
//
//Note:
//Given m, n satisfy the following condition:
//1 ≤ m ≤ n ≤ length of list.

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prem = head;
        for(int i = 2;i < m;i++)
        	prem = prem.next;
        ListNode mNode;
        if(m != 1)
        	mNode = prem.next;
        else 
        	mNode = head;
        
        ListNode pre = null,cur = mNode,cNext = cur.next;
        for(int i = m;i < n;i++)
        {
        	cNext = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = cNext;
        }
        if(m !=1)
        	prem.next = pre;
        mNode.next = cur;
        
        if(m == 1)
        	return pre;
        else
        	return head;
    }
}
