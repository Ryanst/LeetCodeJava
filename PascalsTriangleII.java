import java.util.ArrayList;
import java.util.List;



//https://leetcode.com/problems/pascals-triangle-ii/

//Given an index k, return the kth row of the Pascal's triangle.
//
//For example, given k = 3,
//Return [1,3,3,1].
//
//Note:
//Could you optimize your algorithm to use only O(k) extra space?

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i = 1;i <= rowIndex;i++)
        {
        	for(int j = i-1;j >0;j--)
        	{
        		int tmp = list.get(j-1) + list.get(j);
        		list.set(j, tmp);
        	}
        	list.add(1);
        }
        return list;
    }
}
