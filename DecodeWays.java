//https://leetcode.com/problems/decode-ways/
//	A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//		'A' -> 1
//		'B' -> 2
//		...
//		'Z' -> 26
//		Given an encoded message containing digits, determine the total number of ways to decode it.
//
//		For example,
//		Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
//
//		The number of ways decoding "12" is 2.
public class DecodeWays {
	public int numDecodings(String s) {
		int len = s.length();
		if (len == 0 || s.charAt(0) == '0') {
			return 0;
		}
		int[] dp = new int[len];
		dp[0] = 1;
		for (int i = 1; i < len; i++) {
			if (s.charAt(i) >= '1' && s.charAt(i) <= '9') {
				dp[i] = dp[i - 1];
			} else {
				dp[i] = 0;
			}
			if (s.charAt(i - 1) == '1'
					|| (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
				if (i < 2) {
					dp[i] += 1;
				} else {
					dp[i] += dp[i - 2];
				}
			}
		}
		return dp[len - 1];
	}
}
