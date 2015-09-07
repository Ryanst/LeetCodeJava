import java.util.List;

//Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
//
//For example, given the following triangle
//[
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
//The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
//
//Note:
//Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		for (int row = triangle.size() - 2; row >= 0; row--) {
			for (int col = 0; col <= row; col++) {
				triangle.get(row).set(
						col,
						Math.min(triangle.get(row + 1).get(col),
								triangle.get(row + 1).get(col + 1))
								+ triangle.get(row).get(col));
			}
		}
		return triangle.get(0).get(0);
	}
}
