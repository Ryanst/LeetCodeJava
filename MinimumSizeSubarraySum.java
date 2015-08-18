//https://leetcode.com/problems/minimum-size-subarray-sum/

//Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//For example, given the array [2,3,1,2,4,3] and s = 7,
//the subarray [4,3] has the minimal length under the problem constraint.

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int len = 0;
        int begin = 0,end = 0;
        int sum = 0;
        for(int i = 0;i < nums.length;i++)
        {
        	sum += nums[i];
        	if(sum >= s)
        	{
        		end = i;
        		break;
        	}
        }
        if(sum < s)	return 0;
        
        while(end < nums.length)
        {
        	while(sum >= s && begin < nums.length)
        	{
        		sum -= nums[begin];
        		len--;
        		begin++;
        	}
        	if(begin < nums.length && end < nums.length)
        	{
            	sum -= nums[begin];	
            	sum += nums[end];
        	}
        	begin++;
        	end++;
        }
        
        return len;
    }
}
