//https://leetcode.com/problems/binary-tree-postorder-traversal/
//	Given binary tree {1,#,2,3},
//	   1
//	    \
//	     2
//	    /
//	   3
//	return [3,2,1].

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		if (root == null)
			return list;
		TreeNode cur = root, pre = null;

		List<TreeNode> stack = new LinkedList<TreeNode>();
		stack.add(root);

		while (!stack.isEmpty()) {
			cur = stack.get(stack.size() - 1);
			if ((cur.left == null && cur.right == null)
					|| ((pre != null) && (cur.left == pre || cur.right == pre))) {
				list.add(cur.val);
				pre = cur;
				stack.remove(stack.size() - 1);
			} else {
				if (cur.right != null) {
					stack.add(cur.right);
				}
				if (cur.left != null) {
					stack.add(cur.left);
				}
			}
		}
		return list;
	}
	public List<Integer> postorderTraversal2(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		if (root == null)
			return list;
		List<TreeNode> stack = new LinkedList<TreeNode>();
		TreeNode cur = root, pre = null;
		do {
			while (cur != null) {
				stack.add(cur);
				cur = cur.left;
			}
			while (!stack.isEmpty()) {
				cur = stack.get(stack.size() - 1);
				if (cur.right == pre || cur.right == null) {
					list.add(cur.val);
					pre = cur;
					stack.remove(stack.size() - 1);
				} else {
					cur = stack.get(stack.size() - 1).right;
					break;
				}
			}
		} while (!stack.isEmpty());
		return list;
	}
}
