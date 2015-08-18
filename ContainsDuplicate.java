//https://leetcode.com/problems/contains-duplicate/

//Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

import java.util.Arrays;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return false;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
		
		//或者使用下面的方法
		//return nums.length != new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList())).size();
	}
}
