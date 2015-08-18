import java.util.Scanner;

//https://leetcode.com/problems/excel-sheet-column-number/
//Related to question Excel Sheet Column Title
//
//Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//For example:
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
//Credits:
//Special thanks to @ts for adding this problem and creating all test cases.

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int num = 0;
        for(int i = 0;i < s.length();i++)
        {
        	num = (num*26 + (int)(s.charAt(i)-'A'+1));
        }
        return num;
    }
    
    public static void main(String[] args){
    	while(true)
    	{
    		Scanner scan = new Scanner(System.in);
        	String s = scan.nextLine();
        	System.out.println(titleToNumber(s));
    	}
    }
}
