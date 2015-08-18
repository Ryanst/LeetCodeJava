import java.util.Scanner;

//https://leetcode.com/problems/zigzag-conversion/

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string text, int nRows);
//convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

//这道题的关键在于声明str[numRows]储存每行的字符

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        int len = s.length();
        if(len <= 1 || numRows == 1)
        	return s;
        String newS = "";
        int lines = len / (2*numRows - 2);
        for(int i = 0;i < len;i+=(2*numRows-2))
        	newS += s.charAt(i);
        
        int gap,pos;
        for(int i = 1;i < numRows -1;i++)
        {
        	pos = i;
        	gap = 2*(numRows -i -1);
        	for(int col = 1;col <= lines*2;col++)
        	{
        		newS += s.charAt(pos);
        		pos += gap;
        		gap = 2*numRows -2 - gap;
        	}
        	int remain = len - lines*(2*numRows - 2);
        	if(remain > i)
        	{
        		if(pos < len)
        			newS += s.charAt(pos);
            	if(remain + i > 2*numRows -2 )
            	{
            		pos +=gap;
            		if(pos < len)
            			newS += s.charAt(pos);
            	}
        	}
        		
        }
        int i = numRows -1;
        for(;i < len;i+=(2*numRows-2))
        	newS += s.charAt(i);
        
        int remain = len - lines*(2*numRows - 2);
        if(remain > numRows && i < len)
        	newS += s.charAt(i);
        
        return newS;
    }
    //discuss中更好的方法
    public String  convert2(String s, int nRows) {

        if (nRows <= 1)
            return s;

        int len = (int)s.length();
        StringBuffer[] str = new StringBuffer[nRows];

        int row = 0, step = 1;
        for (int i = 0; i < len; ++i)
        {
            str[row].append(s.charAt(i));

            if (row == 0)
                step = 1;
            else if (row == nRows - 1)
                step = -1;

            row += step;
        }

        String newS = "";
        for (int j = 0; j < nRows; ++j)
        {
        	newS += str[j];
        }

        return newS;
    }
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	String s;
    	int num;
    	while(true)
    	{
    		s = in.next();
    		num = in.nextInt();
    		System.out.println(convert(s,num));
    	}
    }
}









