/*Accept a number and display its summation factor */

import java.util.*;
class Demo
{
   int sumFactor(int iNo)
   {
     int fact=1;
     int sum=0;
     for(fact=1;fact<iNo;fact++)
     {
        if(iNo%fact!=0)
        {
           sum+=fact;
        }
     }

     return sum;
   }
}

public class Program20
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0,sum=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        sum=dobj.sumFactor(iNo);
        System.out.println("summation of non factor is:"+sum);
    }
    
}
