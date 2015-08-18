//https://leetcode.com/problems/linked-list-cycle-ii/

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//Follow up:
//Can you solve it without using extra space?

public class LinkedListCycleII
{
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
	
	//JAVA AC code
    public ListNode detectCycle(ListNode head) {

    	if(head == null)
    		return null;

        ListNode one = head;
        ListNode two = head;
        while(two != null && two.next != null)
        {
        	one = one.next;
        	two = two.next.next;
        	if(one == two)	break;
        }
        if(two == null || two.next == null)
        	return null;

        one = head;
        while(one != two)
        {
        	one = one.next;
        	two = two.next;
        }
        return two;
    }
    public static void main(String[] args)
    {
    	
    }
}
