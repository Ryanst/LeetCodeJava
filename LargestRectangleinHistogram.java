import java.util.Stack;

//https://leetcode.com/problems/largest-rectangle-in-histogram/
//Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
//
//
//Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
//
//
//The largest rectangle is shown in the shaded area, which has area = 10 unit.
//
//For example,
//Given height = [2,1,5,6,2,3],
//return 10.
public class LargestRectangleinHistogram {
	public int largestRectangleArea(int[] height) {
		int maxArea = 0;
		if (height.length == 0)
			return maxArea;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < height.length; i++) {
			if (stack.empty())
				stack.push(i);
			else {
				while (!stack.empty() && height[i] < height[stack.peek()]) {
					int index = stack.pop();
					int width = stack.empty() ? i : (i - stack.peek() - 1);
					maxArea = Math.max(maxArea, width * height[index]);
				}
				stack.push(i);
			}
		}
		while (!stack.empty()) {
			int index = stack.pop();
			int width = stack.empty() ? height.length : (height.length
					- stack.peek() - 1);
			maxArea = Math.max(maxArea, width * height[index]);
		}
		return maxArea;
	}
}
