import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-paths/
//	Binary Tree Paths Total Accepted: 4093 Total Submissions: 19243 My Submissions Question Solution 
//	Given a binary tree, return all root-to-leaf paths.
//
//	For example, given the following binary tree:
//
//	   1
//	 /   \
//	2     3
//	 \
//	  5
//	All root-to-leaf paths are:
//
//	["1->2->5", "1->3"]

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new LinkedList<String>();
		if (root == null)
			return res;
		String curString = root.val + "";
		binaryTreePathRec(res, curString, root);
		return res;

	}
	public void binaryTreePathRec(List<String> res, String curString,
			TreeNode curNode) {
		if (curNode.left != null) {
			String curleft = curString + "->" + curNode.left.val;
			binaryTreePathRec(res, curleft, curNode.left);
		}
		if (curNode.right != null) {
			String curright = curString + "->" + curNode.right.val;
			binaryTreePathRec(res, curright, curNode.right);
		}
		if (curNode.left == null && curNode.right == null) {
			res.add(curString);
		}
	}
}
