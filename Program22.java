/*Accept one number from user and check whether that number is greater than 100 or not */

import java.util.*;

class Demo
{
   void check(int iNo)
   {
     if(iNo>100)
        System.out.println("Number is greater than 100");
    else
        System.out.println("Number is less than 100");
   }
}
public class Program22 {
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        int iNo=0;
        System.out.println("Enter a number");
        iNo=sobj.nextInt();
        dobj.check(iNo);
    }
    
}
