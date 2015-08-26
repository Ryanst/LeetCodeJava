import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/
//	Given a sorted integer array without duplicates, return the summary of its ranges.
//
//			For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
//

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new LinkedList<String>();
		if (nums.length == 0)
			return res;

		String str = "";
		int pre = 0;
		for (int i = 0; i < nums.length; i++) {
			if (pre == i)
				str += nums[i];
			if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
				if (pre != i) {
					str = str + "->" + nums[i];
				}
				res.add(str);
				str = "";
				pre = i + 1;
			}
		}

		return res;
	}
}
