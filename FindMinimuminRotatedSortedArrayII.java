//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class FindMinimuminRotatedSortedArrayII {

	public int findMin(int[] nums) {
        for(int i = 0;i < nums.length-1;i++)
    	{
    		if(nums[i] > nums[i+1])
    			return nums[i+1];
    	}
    	return nums[0];
    }
}
