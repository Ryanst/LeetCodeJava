//https://leetcode.com/problems/missing-number/
//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//For example,
//Given nums = [0, 1, 3] return 2.
//
//Note:
//Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++)
			res = res ^ i ^ nums[i];

		return res ^ nums.length;
	}
	public static void main(String args[]) {
		int nums[] = {1};
		System.out.println(missingNumber(nums));
	}
}
