
public class minSum{
  
  public int MinSum(int[] num )
   {
       int sum = 0;
       int s = 0;
       for(int i = 0;i < num.length;i++)
       {
           s += num[i];
           if(s > 0)
               s = 0;
           else
           {
               if(sum < s)
                   sum = s;
           }
       }
       return sum;
   }
   
   public static void main(String[] args)
   {
       int[] num = {1,-2,－5， 3, 10, -4, 7, 2, -5};
       System.out.printtln(MinSum(num));
   }
}

