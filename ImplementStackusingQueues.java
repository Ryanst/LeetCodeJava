import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/implement-stack-using-queues/
//Implement Stack using Queues
//Implement the following operations of a stack using queues.
//
//push(x) -- Push element x onto stack.
//pop() -- Removes the element on top of the stack.
//top() -- Get the top element.
//empty() -- Return whether the stack is empty.
//Notes:
//You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
//Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
//You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
//Update (2015-06-11):
//The class name of the Java function had been updated to MyStack instead of Stack.

public class ImplementStackusingQueues {
	private Queue<Integer> queue = new LinkedList<Integer>();
	
    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int size = queue.size();
        for(int i = 1;i < size;i++)
        	queue.add(queue.remove());
        queue.remove();
    }

    // Get the top element.
    public int top() {
        int size = queue.size();
        for(int i = 1;i < size;i++)
        	queue.add(queue.remove());
        int top = queue.remove();
        queue.add(top);
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
