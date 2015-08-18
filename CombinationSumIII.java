import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/combination-sum-iii/
//	Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
//
//	Ensure that numbers within the set are sorted in ascending order.
//
//
//	Example 1:
//
//	Input: k = 3, n = 7
//
//	Output:
//
//	[[1,2,4]]
//
//	Example 2:
//
//	Input: k = 3, n = 9
//
//	Output:
//
//	[[1,2,6], [1,3,5], [2,3,4]]
public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if (k == 1) {
			List<Integer> numList = new LinkedList<Integer>();
			numList.add(n);
			list.add(numList);
			return list;
		}
		for (int i = 1; i <= 9; i++) {
			list.addAll(combination(i, k, n));
		}
		return list;
	}
	public List<List<Integer>> combination(int firstNum, int k, int n) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if (firstNum > n || k < 1)
			return list;
		if (k == 1) {
			if (firstNum == n) {
				List<Integer> numList = new LinkedList<Integer>();
				numList.add(n);
				list.add(numList);
				return list;
			}
			return list;
		}
		List<List<Integer>> listToAdd = new LinkedList<List<Integer>>();
		for (int fNum = firstNum + 1; fNum <= n - firstNum && fNum <= 9; fNum++) {
			listToAdd = combination(fNum, k - 1, n - firstNum);
			for (List<Integer> addNumList : listToAdd) {
				List<Integer> numList = new LinkedList<Integer>();
				numList.add(firstNum);
				numList.addAll(addNumList);
				list.add(numList);
			}
		}
		return list;
	}
}
