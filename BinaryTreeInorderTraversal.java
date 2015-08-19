import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
//	Given a binary tree, return the inorder traversal of its nodes' values.
//
//			For example:
//			Given binary tree {1,#,2,3},
//			   1
//			    \
//			     2
//			    /
//			   3
//			return [1,3,2].

public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> nodeList = new ArrayList<Integer>();
		if (root == null)
			return nodeList;
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode curNode = root;
		do {
			while (curNode != null) {
				st.add(curNode);
				curNode = curNode.left;
			}
			curNode = st.pop();
			nodeList.add(curNode.val);
			curNode = curNode.right;
		} while (!st.empty() || curNode != null);
		return nodeList;
	}
}
