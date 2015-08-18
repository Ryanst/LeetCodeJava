import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
//	Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//			For example,
//			Given the following matrix:
//
//			[
//			 [ 1, 2, 3 ],
//			 [ 4, 5, 6 ],
//			 [ 7, 8, 9 ]
//			]
//			You should return [1,2,3,6,9,8,7,4,5].

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<Integer>();
        int height = matrix.length;
        if(height == 0)	return list;
        
        int width = matrix[0].length;
        if(width == 0)	return list;
        
        int col = 0,row = 0;
        while(list.size() < width*height && width > 0 && height > 0)
        {	
        	for(int i = 1;i < width;i++)
        	{
        		list.add(matrix[row][col]);
        		col++;
        	}
        	
        	if(height == 1)
        	{
        		list.add(matrix[row][col]);
        		break;
        	}
        	
        	for(int i = 1;i < height;i++)
        	{
        		list.add(matrix[row][col]);
        		row++;
        	}
        	for(int i = 1;i < width;i++)
        	{
        		list.add(matrix[row][col]);
        		col--;
        	}
        	for(int i = 1;i < height;i++)
        	{
        		list.add(matrix[row][col]);
        		row--;
        	}
        	width -= 2;
        	height -=2;
        }
        
        return list;
    }
}
