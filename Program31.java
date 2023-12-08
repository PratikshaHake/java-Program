/*Accept a number and find its factorial of that number */

import java.util.*;

class Fact
{
  int factorial(int iNo)
  {
    int iAns=1;

    for(int i=1;i<=iNo;i++)
    {
        iAns*=i;
    }
    return iAns;
  }
}

public class Program31 {
    public static void main(String arg[])
    {
         Scanner sobj=new Scanner(System.in);
         Fact fobj=new Fact();
         int iNo=0,iRet=0;
         System.out.println("Enter the number :");
         iNo=sobj.nextInt();
         iRet=fobj.factorial(iNo);
         System.out.println("Factorial of number is :"+iRet);
    }
    
}
