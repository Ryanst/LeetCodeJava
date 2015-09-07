//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
//	Say you have an array for which the ith element is the price of a given stock on day i.
//
//	Design an algorithm to find the maximum profit. You may complete at most two transactions.
//
//	Note:
//	You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
public class BestTimetoBuyandSellStockIII {
	public int maxProfit(int[] prices) {
		int prilen = prices.length;
		if (prilen <= 1)
			return 0;
		int[] maxProfit1 = new int[prilen];
		int[] maxProfit2 = new int[prilen];
		for (int index = 0; index < prilen; index++) {
			maxProfit1[index] = 0;
			maxProfit2[index] = 0;
		}
		int minPrice = prices[0];
		for (int divIndex = 1; divIndex < prilen; divIndex++) {
			minPrice = Math.min(minPrice, prices[divIndex]);
			maxProfit1[divIndex] = Math.max(maxProfit1[divIndex - 1],
					prices[divIndex] - minPrice);
		}
		int maxPrice = prices[prilen - 1];
		for (int divIndex = prilen - 2; divIndex >= 0; divIndex--) {
			maxPrice = Math.max(maxPrice, prices[divIndex]);
			maxProfit2[divIndex] = Math.max(maxProfit2[divIndex + 1], maxPrice
					- prices[divIndex]);
		}
		int maxProfit = 0;
		for (int index = 1; index < prilen; index++) {
			maxProfit = Math.max(maxProfit, maxProfit1[index]
					+ maxProfit2[index]);
		}
		return maxProfit;
	}
}
