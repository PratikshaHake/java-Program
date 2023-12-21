/*Accept the number from user and return the count of digits in between 3 and 7  */

import java.util.*;
class Freqency 
{
    int freq(int iNo)
    {
        int iAns=0,iCnt=0;

        while(iNo>0)
        {
            iAns=iNo%10;
            if(iAns<7 && iAns>3)
            {
                iCnt++;
            }
            iNo=iNo/10;
        }

        return iCnt;
    }
}

public class Program50 {
    public static void main(String arg[])
    {
         Scanner sobj=new Scanner(System.in);
         int no=0,ans=0;
         Freqency fobj=new Freqency();
         System.out.println("Enter the number:");
         no=sobj.nextInt();
         ans=fobj.freq(no);
         System.out.println("count of digits in between 3 and 7 is: "+ans);


    }
    
}
