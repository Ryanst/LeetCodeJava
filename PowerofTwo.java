//https://leetcode.com/problems/power-of-two/

//Given an integer, write a function to determine if it is a power of two.

public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
    	
    	if(n <= 0)
    		return false;
    	if(n == 1)
    		return true;
    	
    	int remain;
        while(n != 0)
        {
        	remain = n % 2;
        	if(remain != 0)
        		break;
        	n = n / 2;
        }
        if(n != 0)
        	return false;
        else
        	return true;
    }
}
