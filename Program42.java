/*Accept range from user and print the addition of  numbers in between that range */

import java.util.*;

class Range
{
   int Addition(int start, int end)
   {
    int sum=0;
    if(start>end)
    {
        System.out.println("Invalid range..");
    }
    else{
     while (start!=end+1) 
     {
       sum+=start;
       start++;        
     }
   }
   return sum;
}
}
public class Program42 {
    public static void main(String arg[])
    {
      Scanner sobj=new Scanner(System.in);
      Range robj=new Range();

      int low=0,high=0,sum=0;
      System.out.println("Enter the lower range :");
      low=sobj.nextInt();
      
      System.out.println("Enter the higher range :");
      high=sobj.nextInt();

      sum=robj.Addition(low,high);
      System.out.println("Addition :"+sum);


    }
    
}
