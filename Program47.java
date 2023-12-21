/*Accept the number from user and count the frequency  of digits which are less than 6  */

import java.util.*;
class Freqency 
{
    int freq(int iNo)
    {
        int iAns=0,iCnt=0;

        while(iNo>0)
        {
            iAns=iNo%10;
            if(iAns<6)
            {
                iCnt++;
            }
            iNo=iNo/10;
        }

        return iCnt;
    }
}

public class Program47 {
    public static void main(String arg[])
    {
         Scanner sobj=new Scanner(System.in);
         int no=0,ans=0;
         Freqency fobj=new Freqency();
         System.out.println("Enter the number:");
         no=sobj.nextInt();
         ans=fobj.freq(no);
         System.out.println("Frequency of digits less than 6 in number is : "+ans);


    }
    
}
