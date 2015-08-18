import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-preorder-traversal/

//Given a binary tree, return the preorder traversal of its nodes' values.
//
//For example:
//Given binary tree {1,#,2,3},
//   1
//    \
//     2
//    /
//   3
//return [1,2,3].
//
//Note: Recursive solution is trivial, could you do it iteratively?

public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> nodeList = new ArrayList<Integer>();
		if (root == null)
			return nodeList;
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode curNode = root;
		do {
			while (curNode != null) {
				st.add(curNode);
				nodeList.add(curNode.val);
				curNode = curNode.left;
			}
			curNode = st.pop().right;
		} while (!st.empty() || curNode != null);
		return nodeList;
	}
}
