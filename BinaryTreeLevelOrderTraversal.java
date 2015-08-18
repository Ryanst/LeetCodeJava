import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree {3,9,20,#,#,15,7},
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]
//confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
    	addLevel(list, root, 0);
    	return list;
    }
    public void addLevel(LinkedList<List<Integer>> list,TreeNode node,int level)
    {
    	if(node == null)	return;
    	if(list.size() <= level) list.add(new LinkedList<Integer>());
    	list.get(level).add(node.val);
    	addLevel(list, node.left, level+1);
    	addLevel(list, node.right, level+1);
    }
}
