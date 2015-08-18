//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//	Follow up for "Remove Duplicates":
//		What if duplicates are allowed at most twice?
//
//		For example,
//		Given sorted array nums = [1,1,1,2,2,3],
//
//		Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.

public class RemoveDuplicatesfromSortedArrayII {
	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		int len = 1;
		Boolean isDup = false;
		int cur = 1;
		int end = nums.length - 1;
		while (cur <= end) {
			if (nums[cur] == nums[cur - 1]) {
				if (isDup) {
					for (int h = cur; h < nums.length - 1; h++)
						nums[h] = nums[h + 1];
					end--;
				} else {
					len++;
					isDup = true;
					cur++;
				}
			} else {
				len++;
				isDup = false;
				cur++;
			}
		}
		return len;
	}
	public int removeDuplicates2(int[] nums) {
		int i = 0;
		for (int n : nums)
			if (i < 2 || n > nums[i - 2])
				nums[i++] = n;
		return i;
	}
	public static void main(String args[]) {
		int nums[] = {1, 1, 1, 2};
		int len = removeDuplicates(nums);
		System.out.print(len);
	}
}
