//https://leetcode.com/problems/maximum-product-subarray/

//Find the contiguous subarray within an array (containing at least one number) which has the largest product.
//
//For example, given the array [2,3,-2,4],
//the contiguous subarray [2,3] has the largest product = 6.

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int frontProduct = 1,backProduct = 1;
        int len = nums.length;
        for(int i = 0;i < len;i++)
        {
        	frontProduct *= nums[i];
        	backProduct *= nums[len-i-1];
        	res = Math.max(res, Math.max(frontProduct, backProduct));
        	frontProduct = frontProduct==0?1:frontProduct;
        	backProduct = backProduct==0?1:backProduct;
        }
        return res;
    }
}
