//https://leetcode.com/problems/maximum-depth-of-binary-tree/

//Given a binary tree, find its maximum depth.
//
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

public class MaximumDepthofBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

//这里用条件语句在leetcode上会时间超限，最后用到了Math.max(int a,int b)内置函数
//		return maxDepth(root.left) > maxDepth(root.right) ? maxDepth(root.left) + 1: maxDepth(root.right) + 1;
		
		return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
	}

}
