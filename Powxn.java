//https://leetcode.com/problems/powx-n/

//Implement pow(x, n).

public class Powxn {
	public double myPow(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double result = 1;
        for (double f = x; n > 0; n = n >> 1) {
            if (n % 2 == 1) {
                result *= f;
            }
            f = f * f;
        }
        return result;
    }
}
