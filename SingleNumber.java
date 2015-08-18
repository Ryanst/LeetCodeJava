//https://leetcode.com/problems/single-number/

//Given an array of integers, every element appears twice except for one. Find that single one.
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int num = 0;
    	for(int i = 0;i < nums.length;i++)
    		num = num ^ nums[i];
    	
    	return num;
    }
    public static void main(String[] args)
    {
    	int []nums = {1,1,2};
    	System.out.println(singleNumber(nums));
    }
}
