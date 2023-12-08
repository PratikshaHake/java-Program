/*Accept range from user and print numbers in between that range */

import java.util.*;

class Range
{
   void Display(int start, int end)
   {
    if(start>end)
    {
        System.out.println("Invalid range..");
    }
    else{
     while (start!=end+1) 
     {
       System.out.print(start+"\t");
       start++;        
     }
   }
}
}
public class Program40 {
    public static void main(String arg[])
    {
      Scanner sobj=new Scanner(System.in);
      Range robj=new Range();

      int low=0,high=0;
      System.out.println("Enter the lower range :");
      low=sobj.nextInt();
      
      System.out.println("Enter the higher range :");
      high=sobj.nextInt();

      robj.Display(low,high);


    }
    
}
