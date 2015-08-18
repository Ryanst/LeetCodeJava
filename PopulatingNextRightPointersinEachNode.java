
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//Given a binary tree
//
//    struct TreeLinkNode {
//      TreeLinkNode *left;
//      TreeLinkNode *right;
//      TreeLinkNode *next;
//    }
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Note:
//
//You may only use constant extra space.
//You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
//For example,
//Given the following perfect binary tree,
//         1
//       /  \
//      2    3
//     / \  / \
//    4  5  6  7
//After calling your function, the tree should look like:
//         1 -> NULL
//       /  \
//      2 -> 3 -> NULL
//     / \  / \
//    4->5->6->7 -> NULL

public class PopulatingNextRightPointersinEachNode {
	public void connect(TreeLinkNode root) {
		root.next = null;
		TreeLinkNode curLinkNode = root;
		TreeLinkNode firstLinkNode = root;
		TreeLinkNode preLinkNode;
		while (true) {
			while (firstLinkNode != null) {
				if (firstLinkNode.left != null) {
					curLinkNode = firstLinkNode;
					firstLinkNode = firstLinkNode.left;
					break;
				} else if (firstLinkNode.right != null) {
					curLinkNode = firstLinkNode;
					firstLinkNode = firstLinkNode.right;
					break;
				}
				else
					firstLinkNode = firstLinkNode.next;
			}
			if(firstLinkNode == null)	break;
			preLinkNode = firstLinkNode;
			while(curLinkNode.next != null)
			{
				if(firstLinkNode == curLinkNode.left)
				{
					firstLinkNode.next = curLinkNode.right;
					curLinkNode = curLinkNode.next;
				}
				else if(firstLinkNode == curLinkNode.right)
				{
					curLinkNode = curLinkNode.next;
					if (curLinkNode != null && curLinkNode.left != null) {
						
					}
				}
			}
		}
	}
}







