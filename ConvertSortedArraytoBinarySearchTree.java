//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.


public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortArray(int []nums,int from,int to)
    {
        int mid = (from+to)/2;
        TreeNode t = new TreeNode(nums[mid]);
        if(mid - from > 0)
        	t.left = sortArray(nums,from,mid-1);
        if(to - mid > 0)
        	t.right = sortArray(nums,mid+1,to);
        
        return t;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0)	return null;
    	
        TreeNode root = sortArray(nums,0,nums.length-1);;
        
        return root;
    }
}
