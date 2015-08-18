//https://leetcode.com/problems/number-of-1-bits/

//Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
//
//For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int num = 0;
        //java没有unsigned，因此下面的方法在n >=2147483648 (10000000000000000000000000000000)的时候会出错
//        while(n != 0)
//        {
//        	num += n % 2;
//        	n = n / 2;
//        }
        
//        >>      :     右移运算符，num >> 1,相当于num除以2
//        >>>    :     无符号右移，忽略符号位，空位都以0补齐
        /// 
        
        while(n != 0)
        {
        	num += n&1;
        	n = n >>> 1;
        }
        return num;
    }
    public static void main(String[] args)
    {
    	System.out.println(hammingWeight(2147483647+1));
    }
}
