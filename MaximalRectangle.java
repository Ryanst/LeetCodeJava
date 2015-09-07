import java.util.Stack;

//https://leetcode.com/problems/maximal-rectangle/
//Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0)
			return 0;
		int maxArea = 0;
		int height = matrix.length;
		int width = matrix[0].length;
		int[][] level = new int[height][width];
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				if (matrix[row][col] == '0')
					level[row][col] = 0;
				else {
					if (row == 0)
						level[row][col] = 1;
					else
						level[row][col] = level[row - 1][col] + 1;
				}
			}
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				if (stack.empty())
					stack.push(col);
				else {
					while (!stack.empty()
							&& level[row][col] < level[row][stack.peek()]) {
						int lastHeight = level[row][stack.pop()];
						int lastWidth = stack.empty() ? col : col
								- stack.peek() - 1;
						maxArea = Math.max(maxArea, lastWidth * lastHeight);
					}
					stack.push(col);
				}
			}
			while (!stack.empty()) {
				int lastHeight = level[row][stack.pop()];
				int lastWidth = stack.empty() ? width : width - stack.peek()
						- 1;
				maxArea = Math.max(maxArea, lastWidth * lastHeight);
			}
		}
		return maxArea;
	}
}
