/*Accept a number from user and check whether it contains 0 or not */

import java.util.*;

class Demo
{
    boolean check(int iNo)
    {
        int Ans=0;
        boolean ret=false;
        while(iNo>0)
        {
          Ans=iNo%10;
          if(Ans==0)
          {
            ret=true;
          }
        
            iNo=iNo/10;
        
        }
      return ret;
    }
}

public class Program45 {

    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        int iNo=0;
        boolean Ans=true;
        System.out.println("Enter the number :");
        iNo=sobj.nextInt();
        Ans=dobj.check(iNo);
        if(Ans==true)
        {
            System.out.println("The number contains 0");
        }
        else
        {
            System.out.println("Number does not contains 0");
        }
    }
}
