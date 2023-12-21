/*Accept the number from user and return the difference between summation of even and odd digits  */

import java.util.*;
class Freqency 
{
    int EvenOdd(int iNo)
    {
        int iAns=0,OddSum=0,EvenSum=0;

        while(iNo>0)
        {
            iAns=iNo%10;
            if(iAns%2==0)
            {
                EvenSum+=iAns;
            }
            else
            {
                OddSum+=iAns;
            }
           
            iNo=iNo/10;
        }

        return EvenSum-OddSum;
    }
}

public class Program52 {
    public static void main(String arg[])
    {
         Scanner sobj=new Scanner(System.in);
         int no=0,ans=0;
         Freqency fobj=new Freqency();
         System.out.println("Enter the number:");
         no=sobj.nextInt();
         ans=fobj.EvenOdd(no);
         System.out.println("Difference between summation of Even and odd digits: "+ans);


    }
    
}
