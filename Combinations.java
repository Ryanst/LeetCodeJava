import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/combinations/
//	Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//			For example,
//			If n = 4 and k = 2, a solution is:
//
//			[
//			  [2,4],
//			  [3,4],
//			  [2,3],
//			  [1,2],
//			  [1,3],
//			  [1,4],
//			]

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> list = new LinkedList<List<Integer>>();

		if (k == 0 || n == 0 || k > n)
			return list;

		if (n == k) {
			List<Integer> numList = new LinkedList<Integer>();
			for (int i = 1; i <= n; i++)
				numList.add(i);
			list.add(numList);
			return list;
		}

		if (k == 1) {
			for (int i = 1; i <= n; i++) {
				List<Integer> numList = new LinkedList<Integer>();
				numList.add(i);
				list.add(numList);
			}
			return list;
		}

		List<List<Integer>> listToAdd = new LinkedList<List<Integer>>();
		list = combine(n - 1, k);
		listToAdd = combine(n - 1, k - 1);
		for (List<Integer> numlist : listToAdd) {
			numlist.add(n);
			list.add(numlist);
		}

		return list;
	}

	// 来自discuss的更简洁的作法
	public List<List<Integer>> combine2(int n, int k) {
		if (k == n || k == 0) {
			List<Integer> row = new LinkedList<>();
			for (int i = 1; i <= k; ++i) {
				row.add(i);
			}
			return new LinkedList<>(Arrays.asList(row));
		}
		List<List<Integer>> result = this.combine(n - 1, k - 1);
		// result.forEach(e -> e.add(n));
		result.addAll(this.combine(n - 1, k));
		return result;
	}
}
