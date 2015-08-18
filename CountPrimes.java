//https://leetcode.com/problems/count-primes/

//Count the number of prime numbers less than a non-negative number, n.

public class CountPrimes {
    int countPrimes(int n) {
        
    	if(n <= 2)	return 0;
    
    	int count = n-2;
    	int end = (int) Math.sqrt(n);
    	Boolean isPrime[] = new Boolean [n];
    	
    	for(int i = 0;i < n;i++)	isPrime[i] = true;
    
    	for(int i = 2;i <= end;i++)
    	{
    		if(isPrime[i])
    		{
    			for(int j = i*i;j < n;j+=i)
    			{
    				if(isPrime[j] == true)
    				{
    					count--;
    					isPrime[j] = false;
    				}
    			}
    		}
    	}
    	return count;
    }
}
