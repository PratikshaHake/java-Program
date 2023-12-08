/*Accept a number and display its non factor */

import java.util.*;
class Demo
{
   void nonFactor(int iNo)
   {
     int fact=1;
     for(fact=1;fact<iNo;fact++)
     {
        if(iNo%fact!=0)
        {
            System.out.print(fact+"\t");
        }
     }
   }
}

public class Program19 
{
    public static void main(String arg[])
    {
        Demo dobj=new Demo();
        Scanner sobj=new Scanner(System.in);
        int iNo=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.nonFactor(iNo);
    }
    
}
