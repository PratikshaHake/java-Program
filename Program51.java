/*Accept the number from user and return the multiplication of all digits  */

import java.util.*;
class Freqency 
{
    int Multiplication(int iNo)
    {
        int iAns=0,Mult=1;

        while(iNo>0)
        {
            iAns=iNo%10;
            Mult=Mult*iAns;
           
            iNo=iNo/10;
        }

        return Mult;
    }
}

public class Program51 {
    public static void main(String arg[])
    {
         Scanner sobj=new Scanner(System.in);
         int no=0,ans=0;
         Freqency fobj=new Freqency();
         System.out.println("Enter the number:");
         no=sobj.nextInt();
         ans=fobj.Multiplication(no);
         System.out.println("Multiplication of digits is: "+ans);


    }
    
}
