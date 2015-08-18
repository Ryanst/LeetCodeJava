import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its bottom-up level order traversal as:
//[
//  [15,7],
//  [9,20],
//  [3]
//]

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
    	addLevel(list, root, 0);
    	return list;
    }
    public void addLevel(LinkedList<List<Integer>> list,TreeNode node,int level)
    {
    	if(node == null)	return;
    	if(list.size() <= level) list.addFirst(new LinkedList<Integer>());
    	list.get(list.size()-level-1).add(node.val);
    	addLevel(list, node.left, level+1);
    	addLevel(list, node.right, level+1);
    }
}
